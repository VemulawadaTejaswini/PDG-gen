import java.util.HashMap;
import java.util.Scanner;
public class Main{
    public static Scanner scan  = new Scanner(System.in);
    public static void main(String[]args){
        int n,tmp,sum;
        sum=0;
        tmp=0;
        n=nextInt();
        String[] st = new String[n];
        int[] time = new int[n];
        for(int i=0;i<n;i++){
            st[i]=next();
            time[i]=nextInt();
        }
        String x;
        x=next();
        for(int i=0;i<n;i++){
            if(st[i].equals(x)){
                tmp=i+1;
                break;
            }
        }
        for(int i=tmp;i<n;i++){
            sum+=time[i];
        }
        print(sum);
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
