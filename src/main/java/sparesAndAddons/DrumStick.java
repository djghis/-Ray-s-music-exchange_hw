package sparesAndAddons;



public class DrumStick extends ItemsForSale {


    public DrumStick(String item, double buyingPrice, double sellingPrice) {
        super(item, buyingPrice, sellingPrice);
    }

    public double getProfit() {
        return this.getSellingPrice() - this.getBuyingPrice();
    }

    public double markUpPercentage() {
        return (this.getSellingPrice() - this.getBuyingPrice()) / this.getBuyingPrice() * 100 ;
    }

}
