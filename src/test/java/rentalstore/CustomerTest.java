package rentalstore;

import org.junit.Assert;
import org.junit.Test;
import sun.plugin2.message.ModalityChangeMessage;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void getName() {
    }

    @Test
    public void should_return_textresult_contains_the_price_given_the_Movie_REGULAR_and_DayRented_biiger_than_2_statement() {

        Customer customer = new Customer("gotdon");

        customer.addRental(new Rental(new Movie("haha",Movie.REGULAR),10));

        boolean result = customer.textStatement().contains("haha\t14.0");
        Assert.assertTrue(result);
    }
    @Test
    public void should_return_textresult_contains_the_price_given_the_Movie_REGULAR_and_DayRented_is_2_statement() {

        Customer customer = new Customer("gotdon");

        customer.addRental(new Rental(new Movie("haha",Movie.REGULAR),2));

        boolean result = customer.textStatement().contains("haha\t2.0");
        Assert.assertTrue(result);
    }
    @Test
    public void should_return_textresult_contains_the_price_given_the_Movie_NEW_RELEASE_statement() {

        Customer customer = new Customer("gotdon");

        customer.addRental(new Rental(new Movie("hehe",Movie.NEW_RELEASE),10));

        boolean result = customer.textStatement().contains("hehe\t30.0");
        Assert.assertTrue(result);
    }
    @Test
    public void should_return_textresult_contains_the_price_given_the_Movie_CHILDRENS_and_DayRented_biiger_than_3_statement() {

        Customer customer = new Customer("gotdon");

        customer.addRental(new Rental(new Movie("xixi",Movie.CHILDRENS),10));

        boolean result = customer.textStatement().contains("xixi\t12.0");
        Assert.assertTrue(result);
    }

    @Test
    public void should_return_textresult_contains_the_price_given_the_Movie_CHILDRENS_and_DayRented_is_3_statement() {

        Customer customer = new Customer("gotdon");

        customer.addRental(new Rental(new Movie("xixi",Movie.CHILDRENS),3));

        boolean result = customer.textStatement().contains("xixi\t1.5");
        Assert.assertTrue(result);
    }

    @Test
    public void should_return_textresult_contains_the_price_given_the_NEW_RELEASE_and_DayRented_is_1_statement() {

        Customer customer = new Customer("gotdon");

        customer.addRental(new Rental(new Movie("xixi",Movie.NEW_RELEASE),1));

        boolean result = customer.textStatement().contains("1 frequent");
        Assert.assertTrue(result);
    }

    @Test
    public void should_return_htmlresult_contains_the_price_given_the_NEW_RELEASE_and_DayRented_bigger_than_1_statement() {

        Customer customer = new Customer("gotdon");

        customer.addRental(new Rental(new Movie("xixi",Movie.NEW_RELEASE),5));

        boolean result = customer.textStatement().contains("2 frequent");
        Assert.assertTrue(result);
    }

    @Test
    public void should_return_htmlresult_contains_the_price_given_the_Movie_REGULAR_and_DayRented_biiger_than_2_statement() {

        Customer customer = new Customer("gotdon");

        customer.addRental(new Rental(new Movie("haha",Movie.REGULAR),10));
        boolean result = customer.htmlStatement().contains("<P>\thaha\t14.0<BR><P>");
        Assert.assertTrue(result);
    }
}