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
                int a,b,c,d;
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                d = sc.nextInt();

                if(a+b>c+d){
                        System.out.print("left");
                }else if(a+b==c+d){
                        System.out.print("Balanced");
                }else{
                        System.out.print("Right");
                }
        }
}