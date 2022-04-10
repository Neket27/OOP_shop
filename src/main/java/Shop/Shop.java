package Shop;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
public class Shop {
    public Shop() {
    }

    public static void main(String[] args) {
      //  Calendar calendar =new Calendar();
        Date date=new Date();
        int a=date.getYear();
        System.out.println(a+1900);
        Computers comp = new Computers("Компьютеры",
                "honor",
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
      //  @builder
        comp.createComputer(
                "Компьютеры",
                    "honor",
                    15000,
                2022,
                date,
                "Russia",
                "Компьютер моноблок",
                "honor magexbook 15",
                "i7",
                "amd99",
                2,
                true



                //.buidl();
        );

        comp.addComputers(comp);
        comp.printComputers();
    }
}
