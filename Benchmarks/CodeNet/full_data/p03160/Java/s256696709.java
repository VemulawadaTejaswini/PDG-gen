import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ;++i){
            arr[i] = scanner.nextInt();
        }
        int s0 = 0,s1 = Math.abs(arr[1]-arr[0]);
        int res=s1;
        for(int i=2;i<n;++i){
            res =Math.min(s0+Math.abs(arr[i]-arr[i-2]),s1+Math.abs(arr[i]-arr[i-1]));
            s0 =s1;
            s1=res;
        }
        System.out.println(res);
    }
}
