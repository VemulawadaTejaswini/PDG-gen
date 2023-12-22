import java.util.*;
import java.io.*;
 
public class Main {
    public static void main (final String[] args) {
        final Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      	int count = 1;
      	boolean flag = false;
      	int[] block = new int[n];
      	for (int i = 0; i < n; i++) {
          block[i] = sc.nextInt();
          if(block[i] == count) count++;
          if(block[i] == 1) flag = true;
        }
      	if(!flag) System.out.println(-1);
      	else System.out.println(n-count+1);
    }
}