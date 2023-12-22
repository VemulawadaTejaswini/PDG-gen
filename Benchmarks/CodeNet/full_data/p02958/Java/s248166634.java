import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int count = 0;
		for(int i = 0; i < n; i++){
			if(i+1 != Integer.parseInt(sc.next()))count++;
		}
		if(count == 0 || count == 2){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
