package dailyproblems.StockAccountManagement;
import java.util.ArrayList;
import java.util.Scanner;

 class Stock {
    public static void main(String[] args) {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        StockPortfolio p = new StockPortfolio();
        while (flag == 0) {
            System.out.println("----Enter details of Stock ");
            var s = new StockPortfolio.Stock1();
            System.out.println("Enter Company Name:");
            s.company = sc.nextLine();
            System.out.println("Enter number of share:");
            s.noOfShare = sc.nextInt();
            System.out.println("Enter Price of share:");
            s.price = sc.nextDouble();
            p.port.add(s);
            System.out.println("Want to enter more Stocks? enter 0 for YES or 1 for NO!");
            flag = sc.nextInt();
        }
        for (int i = 0; i < p.port.size(); i++) {
            System.out.println(p.totalValue());

        }
    }
}

class StockPortfolio {

    ArrayList<Stock1> port = new ArrayList<>();
    double totalValue = 0;

    static class Stock1 {
        int noOfShare;
        String company;
        double price;
    }

    public double totalValue() {
        for (Stock1 stock : port) {
            totalValue += stock.price * stock.noOfShare;
        }
        return totalValue;
    }
}
