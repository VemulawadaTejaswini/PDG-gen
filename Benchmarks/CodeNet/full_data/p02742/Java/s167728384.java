import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        
        if((H*W)%2 == 0){
            System.out.println((H*W)/2);
        }else{
            System.out.println((H*W)+1 / 2);
        }
    }
}