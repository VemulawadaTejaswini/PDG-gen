import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

class Main{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                int a,b;
                a = sc.nextInt();
                b = sc.nextInt();
               
                if((a*b)%2==0){
                       System.out.print("Even");
                }else{
                        System.out.print("Odd");
                }
        }
}
