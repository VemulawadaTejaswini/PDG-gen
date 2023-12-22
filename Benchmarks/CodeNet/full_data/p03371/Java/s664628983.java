import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] price = new int[3];
        for(int i=0;i<3;i++) price[i]=sc.nextInt();
        int[] piece = new int[2];
        piece[0] = sc.nextInt();
        piece[1] = sc.nextInt();
        if(piece[0]>piece[1]){ // piece[0] is always the pizza less needed
            int med = piece[0];
            piece[0] = piece[1];
            piece[1] = med;
            int priceMed = price[0];
            price[0] =price[1];
            price[1] = priceMed;
        }
        double ans = 0.0;
        ans += Math.min(price[0]*piece[0]+price[1]*piece[0],price[2]*2*piece[0]);
        ans += Math.min(price[1]*(piece[1]-piece[0]),price[2]*2*(piece[1]-piece[0]));
        System.out.print(ans);
    }
}