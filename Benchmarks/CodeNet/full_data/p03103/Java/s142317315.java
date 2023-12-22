import java.util.*;
import java.io.*;

class Shop implements Comparable<Shop>{
    long price;
    int stock;
    public Shop(long price, int stock){
        this.price = price;
        this.stock = stock;
    }

    public int compareTo(Shop o) {
        return Long.compare(this.price, o.price);
    }

    public String toString(){
        return "["+price+","+stock+"]";
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        LinkedList<Shop> shops = new LinkedList<>();
        for(int n=0; n<N; n++) shops.add(new Shop(sc.nextLong(), sc.nextInt()));
        Collections.sort(shops);

        long totalCost = 0;
        while(M>0){
            Shop bestShop = shops.poll();
            if(M <= bestShop.stock){
                totalCost += M * bestShop.price;
                M = 0;
            }else{
                totalCost += bestShop.stock * bestShop.price;
                M -= bestShop.stock;
            }
        }
        System.out.println(totalCost);





    }
}