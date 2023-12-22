import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3, y3, x4, y4;
		int xx = Math.abs(x1-x2), yy = Math.abs(y1-y2);
		
		if(x1 >= x2 && y1 >= y2){
			x3 = x2 + yy;
			y3 = y2 - xx;
			x4 = x1 + xx;
			y4 = y1 - yy;
		}else if(x1 <= x2 && y1 >= y2){
			x3 = x2 + yy;
			y3 = y2 + xx;
			x4 = x1 + yy;
			y4 = y1 + xx;
		}else if(x1 <= x2 && y1 <= y2){
			x3 = x2 - yy;
			y3 = y2 + xx;
			x4 = x1 - yy;
			y4 = y1 + xx;
		}else{
			x3 = x2 - yy;
			y3 = y2 - xx;
			x4 = x1 - yy;
			y4 = y1 - xx;
		}
		
		System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
	}
}