import java.util.Arrays;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        String ss[]= s.split(" ");
        int a[] = new int[4];
        for (int i = 0; i < 4; i++) {
            a[i] = Integer.parseInt(ss[i]);
        }
        if(a[2] > a[1]){
            System.out.println("0");
        }else{
            Arrays.sort(a);
               System.out.println(a[2] - a[1]);
        
        
        }
    }
   
}
