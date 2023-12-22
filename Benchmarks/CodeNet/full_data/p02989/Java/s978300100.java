import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer n = Integer.parseInt(scan.next());
        Integer d[] = new Integer[n];

        for(int i=0;i<n;i++)   
            d[i] = Integer.parseInt(scan.next());

        Arrays.sort(d);
        
        System.out.println(d[n/2] - d[n/2-1]);
    }
}