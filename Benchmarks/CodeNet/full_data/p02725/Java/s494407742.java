import java.util.Scanner;
import java.util.Arrays;

class Main {
 public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   int k = scanner.nextInt();
   int n = scanner.nextInt();
   int[] a = new int[n]; //Input
   a[0] = scanner.nextInt(); //1st element
   a[1] = scanner.nextInt();
   int max = a[1]-a[0];
   int[] array = new int[n]; //Distance from 0
   for(int i = 2; i < n; i++) {
     for(int j = 2; j < n; j++) {
       if(a[j]-a[i] > max) {
         max = a[j]-a[i];
       }
     }
   }
   
   //Arrays.sort(array);
   //int r = array[n-1] - array[0];
   System.out.println(max);
 }
}