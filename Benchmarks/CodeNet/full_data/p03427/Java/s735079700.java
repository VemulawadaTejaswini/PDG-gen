import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;

class Main{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                long N = sc.nextLong();
                long count=0,max=0,x;
                for(long i=0; i<N; i++){
                        x = i;
                        while(x!=0){
                                count += x % 10;
                                x /= 10;
                        }
                        max = Math.max(max,count);
                        count = 0;
                }
                System.out.println(max);
        }
}
