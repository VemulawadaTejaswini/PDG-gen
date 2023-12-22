import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main (String[] args) {
   	 Scanner sc = new Scanner(System.in);
   	 int N = sc.nextInt();
   	 int Y = sc.nextInt();
   	 
   	 for(int i = 0; i <= N; i++) {
   		 for(int j = 0; j <= N - i; j++) {
   			 int k = N - i - j;
   			 int total = i*10000 + j*5000 + k*1000;
   			 if(total == Y) {
   				 System.out.println(i + " " + j + " " + k + " ");
   				 return;
   			 }
   		 }
   	 }
   	 System.out.println("-1 -1 -1");
    }
}
