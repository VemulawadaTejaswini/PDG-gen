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
                String N = sc.next();

                boolean ch =
                        (N.charAt(0)==N.charAt(1) && N.charAt(0)==N.charAt(2))
                        || (N.charAt(3)==N.charAt(1) && N.charAt(3)==N.charAt(2));

                if(ch){
                        System.out.print("Yes");
                }else{
                        System.out.print("No");
                }
        }
}
