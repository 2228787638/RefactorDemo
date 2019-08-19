package vo;

import rentalstore.Movie;
import rentalstore.Rental;

import java.util.ArrayList;
import java.util.List;

public abstract class Template {
    public abstract String buildStatement(String name, List<Rental> rentals);
    public List<Double> getThisAmount(List<Rental> rentals){
        List<Double> thisAmountList = new ArrayList<>();
        for (Rental each : rentals) {
            double thisAmount = 0;

            switch (each.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    thisAmount += 2;
                    if (each.getDayRented() > 2) {
                        thisAmount += (each.getDayRented() - 2) * 1.5;
                    }
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += each.getDayRented() * 3;
                    break;
                case Movie.CHILDRENS:
                    thisAmount += 1.5;
                    if (each.getDayRented() > 3) {
                        thisAmount += (each.getDayRented() - 3) * 1.5;
                    }
                    break;
            }

            thisAmountList.add(thisAmount);
        }
        return thisAmountList;
    }

    public int calculateFrequentRenterPoints(List<Rental> rentals) {
        int frequentRenterPoints = 0;
        for (Rental each : rentals) {
            frequentRenterPoints++;
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDayRented() > 1) {
                frequentRenterPoints++;
            }
        }
        return frequentRenterPoints;
    }

    public double calculateTotalAmount(List<Rental> rentals) {
        double totalAmount = 0;
        for (int i =0;i<rentals.size();i++) {
            totalAmount += getThisAmount(rentals).get(i);
        }
        return totalAmount;
    }
}
