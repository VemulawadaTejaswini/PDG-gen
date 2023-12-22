import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        for(int i=1;i<arr.length-1;i+=2){
            if(arr[i]>arr[i+1]){
                n=-1;
            }
        }
        System.out.println(n-1);
    }
}