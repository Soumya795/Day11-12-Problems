package dailyproblems;

import java.util.Scanner;

public class Stock {
    static String stockName;
    static int stockPrice;
    static int stockQuantity;

    public Stock(String stockName, int stockPrice, int stockQuantity) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        this.stockQuantity = stockQuantity;
    }

    public String toString() {
        return "stock report is as follows" + "\nstock name " + stockName + "\nstock price " + stockPrice + "\nquantity " + stockQuantity + "\ntotal value " + (stockPrice * stockQuantity) + " " + "\n";

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter stock name");
        stockName = sc.next();

        System.out.println("enter stock price");
        stockPrice = sc.nextInt();

        System.out.println("enter stock quantity");
        stockQuantity = sc.nextInt();

        Stock stock = new Stock(stockName, stockPrice, stockQuantity);
        System.out.println(stock.toString());

    }

}
