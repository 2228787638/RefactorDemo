package rentalstore;

import vo.HtmlTemplate;
import vo.Template;
import vo.TextTemplate;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public String textStatement() {
        Template template = new TextTemplate();
        return template.buildStatement(getName(),this.rentals);
    }

    public String htmlStatement() {
        Template template = new HtmlTemplate();
        return template.buildStatement(getName(),this.rentals);
    }


}
