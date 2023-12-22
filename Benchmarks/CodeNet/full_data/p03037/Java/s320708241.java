import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{	
public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m = sc.nextInt();
	int[] min = new int[m];
	int[] max = new int[m];
	int bottom = 1;
	int top = n;
	for(int i= 0; i < m; i++){
		min[i] = sc.nextInt();
		max[i] = sc.nextInt();
	}
	for(int i = 0; i < m; i++){
		if(min[i] > bottom) bottom = min[i];
		if(max[i] < top) top = max[i];
	}
	if(top >= bottom){
		System.out.println(top - bottom + 1);
	}else{
		System.out.println(0);
	}
}
}
