package Shop;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ComputersTest<actualComputers> extends Computers {

    @Test
    void testGetCountry() {
    }

    @Test
    void testSetCountry() {
    }


    Date date = new Date();

    @Test
    public void instantiationComputers() {

        Computers actualComputers = new Computers("Компьютеры",
                "hp",
                15000,
                2022,
                date,
                "Russia",
                "Компьютер моноблок",
                "honor magexbook 15",
                "i7",
                "amd99",
                2,
                true);


        Computers expectedComputers = new Computers("Компьютеры",
                "hp",
                15000,
                2022,
                date,
                "Russia",
                "Компьютер моноблок",
                "honor magexbook 15",
                "i7",
                "amd99",
                2,
                true);


        Assert.assertEquals(expectedComputers,actualComputers);


    }
}