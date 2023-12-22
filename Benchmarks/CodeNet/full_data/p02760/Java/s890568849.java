import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.io.BufferedOutputStream;
import java.util.function.LongPredicate;
import java.util.function.Predicate;
import java.util.List;
import java.io.*;
import java.util.*;
import java.io.PrintWriter;

public class Main {
    public static void main(final String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int[][] a = new int[3][3];
    	for (int i = 0; i < a.length; i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j] = scanner.nextInt();
			}
		}
    	boolean[][] b = new boolean[3][3];
    	int n = scanner.nextInt();
    	List<Integer> list = new ArrayList<>();
    	for(int i=0;i<n;i++) {
    		list.add(scanner.nextInt());
    	}
    	for(int i=0;i<3;i++) {
    		for(int j=0;j<3;j++) {
    			b[i][j] = list.contains(a[i][j]) ? true: false;
    		}
    	}

    	boolean flag = false;
    	for(int i=0;i<3;i++) {
    		if (b[i][0] && b[i][1] && b[i][2]) flag = true;
    	}
    	for(int i=0;i<3;i++) {
    		if (b[0][i] && b[0][i] && b[2][i]) flag = true;
    	}
    	if (b[0][0] && b[1][1] && b[2][2]) flag = true;
    	if (b[2][0] && b[1][1] && b[0][2]) flag = true;
    	
    	if (flag) {
    		System.out.println("Yes");
    	}else {
    		System.out.println("No");
    	}
    }
}
