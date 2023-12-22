import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import sun.util.logging.resources.logging;
public class Main{
    public static Scanner scan  = new Scanner(System.in);
    public static void main(String[]args){
        int n;
        n=nextInt();
        Long[] arr = new Long[n];
        for(int i=0;i<n;i++){
            arr[i]=nextLong();
        }
        long sum1,sum2;
        //Long con =0L;
        //Long k = n/2L;

        List<Long> list_sum1 = new ArrayList<Long>();
        List<Long> list_sum2 = new ArrayList<Long>();
        sum1=0L;
        sum2=0L;
        for(int i=0;i<n;i++){
            if(i%2==0) list_sum1.add(arr[i]);
            else list_sum2.add(arr[i]);
        }
        Collections.sort(list_sum1);
        Collections.sort(list_sum2);
        if(list_sum1.size()>list_sum2.size()) list_sum1.remove(0);
        for(Long a:list_sum1){
            sum1+=a;
        }
        for(Long a:list_sum2){
            sum2+=a;
        }
        print(Math.max(sum1,sum2));
    }



    public static int nextInt(){
        return Integer.parseInt(scan.next());
    }
    public static long nextLong(){
        return Long.parseLong(scan.next());
    }
    public static String next(){
        return scan.next();
    }
    public static double nextDouble(){
        return Double.parseDouble(scan.next());
    }
    public static float nextFloat(){
        return Float.parseFloat(scan.next());
    }

    //Yes or No
    public static void yesNo(boolean flag){
        if(flag) System.out.println("Yes");
        else System.out.println("No");
    }
    public static void print(Object a){
        System.out.println(a);
    }
}