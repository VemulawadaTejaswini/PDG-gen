import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = sc.nextInt();
        for(int i=x-k+1;i<x+k;i++){
            if(i>-1000000&&i<1000000){
                System.out.print(i);
                if(i!=x+k-1){
                    System.out.print(" ");
                }
            }
        }
    }
}