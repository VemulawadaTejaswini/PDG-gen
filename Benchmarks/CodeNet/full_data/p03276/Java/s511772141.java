import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Main {
    static int x;
    public static void main(String[] args) {
        Scanner scanner = new Scanner();
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int[] x=new int[n];
        for(int i=0;i<n;i++){
            x[i]=scanner.nextInt();
        }
        long min=Long.MAX_VALUE;
        for(int i=0;i+k-1<n;i++){
            long ans=0;
            int val1=x[i];
            int val2=x[i+k-1];
            if((val1^val2)<0){
                ans=Math.min(Math.abs(val1)*2+Math.abs(val2),Math.abs(val1)+2*Math.abs(val2));
            }else{
                ans=Math.max(Math.abs(val1),Math.abs(val2));
            }
            min=Math.min(ans,min);
        }
        put(min);

    }


    public static int max(int a,int b){
        return Math.max(a,b);
    }
    public static long max(long a,long b){
        return Math.max(a,b);
    }
    public static int abs(int a){
        return Math.abs(a);
    }
    public static long abs(long a){
        return Math.abs(a);
    }
    public static void print(Object object){
        System.out.print(object);
    }
    public static void put(Object object) {
        System.out.println(object);
    }
    public static void put(){
        System.out.println();
    }
    public static String format(String string, Object... args) {
        return String.format(string, args);
    }
}
