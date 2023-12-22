import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[]p = new int[n];
     
    for(int i=0; i<n; i++) {
    	p[i] = sc.nextInt();
     	}
    Arrays.sort(p);
    int al = 0;
    for(int i=0; i<n-1; i++) {
    	al += p[i];
    }
    System.out.println(p[n-1]/2+al);
      }
}
