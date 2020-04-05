import behaviour.ISell;
import instruments.guitars.Guitar;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;
    private double till;

    public Shop(String name, double till) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
        this.till = till;
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public int getStockSize() {
        return this.stock.size();
    }

//    public void addToStock(ISell item) {
//        this.stock.add(item);
//    }

    public void addToStock(ISell... items) {
        for (ISell item : items) {
            this.stock.add(item);
        }
    }

//    public void removeFromStock(ISell item) {
//        this.stock.remove(item);
//    }

    public void removeFromStock(ISell... items) {
        for (ISell item : items) {
            this.stock.remove(item);
        }
    }

    public double getTill() {
        return till;
    }

    public void addMoneyToTill(double amount) {
        this.till += amount;
    }

    public void removeMoneyFromTill(double amount) {
        this.till -= amount;
    }

    public double potentialProfit() {
        double potentialProfit = 0;
        for (ISell item : stock) {
            potentialProfit += item.getProfit();
        }

        return potentialProfit;
    }

    public void sellItem(ISell item) {
        if (stock.contains(item)) {
            removeFromStock(item);
            addMoneyToTill(item.getSellingPrice());

        }
    }
}
