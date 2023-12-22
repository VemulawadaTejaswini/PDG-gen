package problemsolving;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        
        int d1 =  x2-x1 ;
        int d2 =  y2 - y1;
        

        System.out.print( (x2-d2)+" "+(y2 +d1)+" "+ (x1-d2) +" "+(y1 + d1));
    }
}
