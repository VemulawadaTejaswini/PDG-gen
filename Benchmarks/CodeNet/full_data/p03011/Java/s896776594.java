import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	int p = sc.nextInt();
	int q = sc.nextInt();
	int r = sc.nextInt();
	int[] times = new int[3];
	times[0]=p+q;
	times[1]=q+r;
	times[2]=r+p;
	int min=0;
	for(int i=0;i<3;i++){
		if(i==0){
			min=times[0];
		}else{
			min=Math.min(min,times[i]);
		}
	}
	System.out.println(min);
	}
}