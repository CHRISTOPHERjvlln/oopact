
package classmain;
import java.time.LocalDate;
import java.time.Period;

public class Supply {
    @SuppressWarnings("FieldMayBeFinal")
    private int supplyID;
    private String supplyName;
    private String supplyDescription;
    private double itemPrice;
    private String purchaseDate;

    public Supply(int supplyID, String supplyName, String supplyDescription, double itemPrice, String purchaseDate) {
        this.supplyID = supplyID;
        this.supplyName = supplyName;
        this.supplyDescription = supplyDescription;
        this.itemPrice = itemPrice;
        this.purchaseDate = purchaseDate;
    }

    public int getSupplyID() {
        return supplyID;
    }

    public String getSupplyName() {
        return supplyName;
    }

    public String getSupplyDescription() {
        return supplyDescription;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    
    
    
    
    
    int years ;
    int months;
    int totalmonths;
    public void stockDuration(String purchasedate) {
        LocalDate date = LocalDate.parse(purchasedate);
        years = Period.between(date,LocalDate.now()).getYears();
        months = Period.between(date,LocalDate.now()).getMonths();
        totalmonths = (years * 12) + months;
        
    }
}
