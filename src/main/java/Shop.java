import behaviour.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;
    private double till;

    public Shop(String name, double till){
        this.name = name;
        this.stock = new ArrayList<ISell>() ;
        this.till = till;
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public int getStockSize(){
        return this.stock.size();
    }

//    public void addToStock(ISell item) {
//        this.stock.add(item);
//    }

    public void addToStock(ISell ... items) {
        for(ISell item : items) {
            this.stock.add(item);
        }
    }

//    public void removeFromStock(ISell item) {
//        this.stock.remove(item);
//    }

    public void removeFromStock(ISell ... products) {
        for(ISell product : products) {
            this.stock.remove(product);
        }
    }

    public double getTill() {
        return till;
    }

    public void addMoneyToTill(double amount) {
        this.till += amount;
    }

    public void removeMoneyFromTill(double amount){
        this.till -= amount;
    }
}
