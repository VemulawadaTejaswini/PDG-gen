
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
	    
	    int cnt = 1;
	    int min = list[0];
	    for (int i = 1; i < list.length; i++) {
			 if (min >= list[i]) {
				 cnt++;
				 min = list[i];
			 }
		}
	    
	    
	    System.out.println(cnt);
	    
	  }
	}