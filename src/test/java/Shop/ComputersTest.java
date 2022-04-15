package Shop;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ComputersTest {

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
                true,
                6);


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
                true,
                3);


        Assert.assertEquals(actualComputers.getCategory(),expectedComputers.getCategory());
        Assert.assertEquals(actualComputers.getTitle(),expectedComputers.getTitle());
        //Assert.assertEquals(actualComputers.getPrice(),expectedComputers.getPrice());
        System.out.println("Error price: "+"1= "+ actualComputers.getPrice()+ " 2= "+ expectedComputers.getPrice());
        Assert.assertEquals(actualComputers.getYear(),expectedComputers.getYear());
        Assert.assertEquals(actualComputers.getCurrentDate(),expectedComputers.getCurrentDate());
        Assert.assertEquals(actualComputers.getCountry(),expectedComputers.getCountry());
        Assert.assertEquals(actualComputers.getType(),expectedComputers.getType());
        Assert.assertEquals(actualComputers.getModel(),expectedComputers.getModel());
        Assert.assertEquals(actualComputers.getCpu(),expectedComputers.getCpu());
        Assert.assertEquals(actualComputers.getGpu(),expectedComputers.getGpu());
        Assert.assertEquals(actualComputers.getWarranty(),expectedComputers.getWarranty());
        Assert.assertEquals(actualComputers.getWarranty(),expectedComputers.getWarranty());

    }

    @Test
    public void CheckInStockTest(){
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
                true,
                4);

        Assert.assertThrows(RuntimeException.class,
                ()->actualComputers.checkInStock());
    }

    @Test
    public void checkCorrectWarrantyTest(){
        Computers actualComputers = new Computers("Компьютеры",
                "hp",
                15000,
                2000,
                date,
                "Russia",
                "Компьютер моноблок",
                "honor magexbook 15",
                "i7",
                "amd99",
                -82,
                true,
                100);

        Assert.assertThrows(RuntimeException.class,
                ()->actualComputers.checkCorrectnessDates());

    }

    @Test
    public void checkCorrectnessDatesTest(){
        Computers actualComputers = new Computers("Компьютеры",
                "hp",
                15000,
                2000,
                date,
                "Russia",
                "Компьютер моноблок",
                "honor magexbook 15",
                "i7",
                "amd99",
                82,
                true,
                100);

        Assert.assertThrows(RuntimeException.class,
                ()->actualComputers.checkCorrectnessDates());

    }



}