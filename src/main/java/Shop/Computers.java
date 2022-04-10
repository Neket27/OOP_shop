package Shop;

import java.util.Date;

public class Computers extends Product implements Event{
    String country, type, model, cpu, gpu;
    boolean wi_fi;

    public Computers(){
        super();
    }
    public Computers(String category,String title,int price,int year ,Date currentDate,String country, String type, String model, String cpu, String gpu, int warranty, boolean wi_fi) {
        super(category,title,price,year,warranty,currentDate);
        this.country = country;
        this.type = type;
        this.model = model;
        this.cpu = cpu;
        this.gpu = gpu;

        this.wi_fi = wi_fi;
    }

    @Override
    public String getCountry() {return country;}
    @Override
    public void setCountry(String country) {this.country=country;}
    public String getType() {return type;}
    public void setType(String type) {this.type = type;}
    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}
    public String getCpu() {return cpu;}
    public void setCpu(String cpu) {this.cpu = cpu;}
    public String getGpu() {return gpu;}
    public void setGpu(String gpu) {this.gpu = gpu;}
    public boolean isWi_fi() {return wi_fi;}
    public void setWi_fi(boolean wi_fi) {this.wi_fi = wi_fi;}


    public Computers createComputer(String category, String title, int price, int year, Date currentDate, String country, String type, String model, String cpu, String gpu, int warranty, boolean wi_fi) {

        if((getCurrentDate().getYear()+1900)-year > 5) {
            System.out.println((getCurrentDate().getYear() + 1900) - year);
            throw new IllegalArgumentException("computer old, delete it");
        }
        return new Computers(category,title,price,year,currentDate,country, type, model, cpu, gpu, warranty, wi_fi);
    }



}