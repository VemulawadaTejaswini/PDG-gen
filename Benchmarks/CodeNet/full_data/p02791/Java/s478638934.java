
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] list = new int[n];
	    
	    for (int i = 0; i < list.length; i++) {
			list[i] = sc.nextInt();
		}
	    
	    int cnt = 0;
	    outside: for (int i = 0; i < list.length; i++) {
			for (int j = i; 0 <= j; j--) {
				if (list[i] > list[j]) {
					continue outside;
				}
			}
			cnt++;
		}
	    
	    System.out.println(cnt);
	    
	  }
	}