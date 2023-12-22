import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{	
public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.next());
	int l = Integer.parseInt(sc.next());
	int sum = n*(n+2*l-1)/2;
	int min = l;
	
	for(int i = 0; i < n;i++){
		if(Math.abs(l+i-1) > Math.abs(l+i)) min = l+i;
	}
	System.out.println(sum-min);
}
}
