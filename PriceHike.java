
package classmain;

public class PriceHike {
    private double currentPrice;
    private double updatedPrice;
    private double purchaseDate;

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public void setUpdatedPrice(double updatedPrice) {
        this.updatedPrice = updatedPrice;
    }

    public void setPurchaseDate(int purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    
    
    public double getCurrentPrice() {
        return currentPrice;
    }

    public double getUpdatedPrice() {
        return updatedPrice;
    }

    public double getPurchaseDate() {
        return purchaseDate;
    }
    
    
    
    public void priceComputed(int years) {
        int interestrate = 10;     
        double interest = (currentPrice * interestrate) / 100;
         
        for(int i = 3;i<= years; i+=3) {
           currentPrice += interest;           
        }
        
        updatedPrice = currentPrice;
    } 
}
