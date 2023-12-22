import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int A = sc.nextInt();
        int arr[] = new int[1000];
        for (int i = 0; i < A; i++) {
            int num = sc.nextInt();
            if (num != 0) {
            	arr[num - 1]++;} 
            arr[num]++;
            arr[num + 1]++;}
        int best = 0;
          for (int i = 0; i < arr.length; i++) {
            if (arr[i] > best) {
            	best = arr[i];}}
           System.out.println(best);
        sc.close();}}
 
    