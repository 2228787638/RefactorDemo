package vo;

import rentalstore.Movie;
import rentalstore.Rental;

import java.util.ArrayList;
import java.util.List;

public class HtmlTemplate extends Template {
    @Override
    public String buildStatement(String name, List<Rental> rentals) {
        String result = "<H1>"+"Rental Record for " +"<EM>"+ name +"</EM>" + "\n"+"</H1><P>";
        for (int i=0;i<rentals.size();i++) {
            result += "\t" + rentals.get(i).getMovie().getTitle() + "\t" + String.valueOf(getThisAmount(rentals).get(i)) + "<BR>";
        }
        //add footer lines
        result += "<P>"+"You owed is " + "<EM>"+String.valueOf(calculateTotalAmount(rentals))+"</EM><P>" + "\n";
        result += "On this rental you earned " + "<EM>"+String.valueOf(calculateFrequentRenterPoints(rentals))+"<EM>" + " frequent renter points"+"<P>";
        return result;
    }


}
