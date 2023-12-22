import java.util.Scanner;

public class Main{
    public static Scanner scan  = new Scanner(System.in);
    public static void main(String[]args){
        int n,m;
        n=nextInt();
        m=nextInt();
        int[] arr = new int[m];
        for(int i=0;i<m;i++){
            arr[i]=nextInt();
        }
        int sum =0;
        for(int a:arr){
            sum+=a;
        }
        int tmp = n-sum;
        if(tmp<0){
            print(-1);
        }
        else print(tmp);
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