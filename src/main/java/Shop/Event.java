package Shop;
import java.util.Date;
public interface Event {

    public String getCountry();
    public void  setCountry(String country);
    public String getType();
    public void setType(String type);
    public String getModel();
    public void setModel(String model);
    public void checkInStock();
}
