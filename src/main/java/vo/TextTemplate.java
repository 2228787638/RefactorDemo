package vo;

import rentalstore.Rental;

import java.util.List;

public class TextTemplate extends Template {
    @Override
    public String buildStatement(String name, List<Rental> rentals) {
        String result = "Rental Record for " + name + "\n";
        for (int i=0;i<rentals.size();i++) {
            result += "\t" + rentals.get(i).getMovie().getTitle() + "\t" + String.valueOf(getThisAmount(rentals).get(i)) + "\n";
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(calculateTotalAmount(rentals)) + "\n";
        result += "You earned " + String.valueOf(calculateFrequentRenterPoints(rentals)) + " frequent renter points";
        return result;
    }
}
