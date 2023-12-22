import java.util.Arrays;
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
 	Scanner sc = new Scanner(System.in);
   	int n = sc.nextInt();
   	int len = sc.nextInt();
   	String[] arr = new String[len];
    for(int i=0;i<n;i++) {
        arr[i] = sc.next();
    }

   Arrays.sort(arr);
   StringBuilder sb = new StringBuilder();
   for(String s : arr) {
    sb.append(s);
   }

     System.out.println(sb.toString());
 }

}