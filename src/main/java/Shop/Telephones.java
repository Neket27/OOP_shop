package Shop;

import java.util.Calendar;
import java.util.Date;

public class Telephones extends Product implements Event {
    String country,type, model,cpu,gpu,display;
    boolean wi_fi;

    public Telephones(String category, String title, int price, int year, Date currentYear, String country, String type, String model, String cpu, String gpu, int warranty, boolean wi_fi, String display) {
        super(category,title,price,year,warranty,currentYear);
        this.country = country;
        this.type = type;
        this.model = model;
        this.cpu = cpu;
        this.gpu = gpu;
        this.wi_fi = wi_fi;
        this.display=display;


    }


    public String getCountry() {return country;}
    public void setCountry(String country) {this.country = country;}
    public String getType() {return type;}
    public void setType(String type) {this.type = type;}
    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}
    public String getCpu() {return cpu;}
    public void setCpu(String cpu) {this.cpu = cpu;}
    public String getGpu() {return gpu;}
    public void setGpu(String gpu) {this.gpu = gpu;}
    public String getDisplay() {return display;}
    public void setDisplay(String display) {this.display = display;}
    public boolean isWi_fi() {return wi_fi;}
    public void setWi_fi(boolean wi_fi) {this.wi_fi = wi_fi;}
}
