import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	int l = Integer.parseInt(sc.next());
	int r = Integer.parseInt(sc.next());
	int min = (l*r)%2019;
	if((r - l) >= 2018){
		System.out.println(0);
	}else{
		for(int i = l; i < r; i++){
			for(int j = i+1; j < r+1; j++){
				
	min = Math.min(((j*i)%2019),min);
				
			}
		}
	System.out.println(min);
	}
}
}
