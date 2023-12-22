import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
 
class Main{
        public static void main(String args[]){
                Scanner scan = new Scanner(System.in);
                int A = scan.nextInt();
                int B = scan.nextInt();
                int X = scan.nextInt();
 
                if(A<=X && X<=A+B){
                        System.out.print("Yes");
                }else{
                        System.out.print("No");
                }
        }
}