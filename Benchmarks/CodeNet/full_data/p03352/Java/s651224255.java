import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int max = 0;
		for(int b=1; Math.pow(b, 2)<=X; b++){
			for(int j=2; Math.pow(b, j) <= X; j++){
				Math.max(max, Math.pow(b, j));
			}
		}
		System.out.println(max);
	}	
}
