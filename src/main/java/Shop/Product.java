package Shop;
import java.util.Date;
import java.util.*;

public class Product {
   private String category, title;
   private int price,year,warranty;
   private Date currentYear;
   private Map<java.lang.String,java.lang.String> HashMap;
   Map<String,String> description = new HashMap<String,String>();
   Map<String,String> reviews = new HashMap<String,String>();

    ArrayList<Computers> computers = new ArrayList<>();
    ArrayList<Telephones> telephones = new ArrayList<>();
    ArrayList<Appliances> appliances = new ArrayList<>();

    public  Product(){}
    public Product(String category, String title, int price, int year, int warranty, Date currentYear) {
        this.category = category;
        this.title = title;
        this.price = price;
        this.year = year;
        this.warranty=warranty;
        this.currentYear=currentYear;
    }
    //get and set
    public String getCategory() {return category;}
    public String getTitle() {return title;}
    public int getPrice() {return price;}
    public int getYear() {return year;}
    public void setCategory(String category) {this.category = category;}
    public void setTitle(String title) {this.title = title;}
    public void setPrice(int price) {this.price = price;}
    public void setYear(int year) {this.year = year;}
    public int getWarranty(){return warranty;}
    public void setWarranty(int warranty){this.warranty=warranty;}
    public Date getCurrentDate() {return currentYear;}
    public void setCurrentDate(Calendar date) {this.currentYear = currentYear;}

    public void addComputers(Computers computers){this.computers.add(computers);}
    public void addTelephones(Telephones telephones){this.telephones.add(telephones);}
    public void addAppliances(Appliances appliances){this.appliances.add(appliances);}
    public Computers  getComputers(int num)  {return computers.get(num);}
    public Telephones getTelephones(int num) {return telephones.get(num);}
    public Appliances getAppliances(int num) {return  appliances.get(num);}

    public void printComputers(){
        System.out.print("Computer");
        for(int i=0; i<computers.size();i++){
            System.out.println("Категория: "+getComputers(i).getCategory()+
                    "Модель: "+getComputers(i).getModel()+
                    "Название: "+getComputers(i).getTitle()+
                    "Процессор: "+getComputers(i).getCpu()+
                    "Видеокарта: "+ getComputers(i).getGpu()+
                    "Цена: "+getComputers(i).getPrice()+
                    "Год выпуска: "+getComputers(i).getYear()+
                    "Гарантия: "+ getComputers(i).getWarranty()
                                                                        );

        }    }

    public void printTelephones(){
        System.out.print("Computer");
        for(int i=0; i<telephones.size();i++){
            System.out.println("Категория: "+getTelephones(i).getCategory()+
                    "Модель: "+getTelephones(i).getModel()+
                    "Название: "+getTelephones(i).getTitle()+
                    "Процессор: "+getTelephones(i).getCpu()+
                    "Видеокарта: "+ getTelephones(i).getGpu()+
                    "Цена: "+getTelephones(i).getPrice()+
                    "Год выпуска: "+getTelephones(i).getYear()+
                    "Гарантия: "+ getTelephones(i).getWarranty()
            );

        }    }

    public void printAppliances(){}


}
