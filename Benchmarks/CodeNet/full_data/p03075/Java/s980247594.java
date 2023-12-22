import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); 
        int max = a;
        int min = a;

        for(int i=0; i<4; i++){
            int x = sc.nextInt();
            max = Math.max(max, x);
            min = Math.min(min, x);
        }

        int k = sc.nextInt();

        if(max-min<=k){
            System.out.println("Yay");
        }
        else if(max-min>k){
            System.out.println(":(");
        }
    }
}