import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] x = new int[5];

        for(int i=0; i<5; i++){
            x[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        if(x[4]-x[0]>k){
            System.out.println(":(");
        }
        else if(x[4]-x[0]<=k){
            System.out.println("Yay!");
        }
    }
}