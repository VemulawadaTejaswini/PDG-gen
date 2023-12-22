import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int[] a = new int[3];
		for(int i = 0 ; i < 3 ; i++) a[i] = Integer.parseInt(sc.next());
		if(a[0] % 2 > a[1] % 2){
			int e = a[0];
			a[0] = a[1];
			a[1] = e;
		}
		if(a[1] % 2 > a[2] % 2){
			int e = a[1];
			a[1] = a[2];
			a[2] = e;
		}
		if(a[0] % 2 > a[1] % 2){
			int e = a[0];
			a[0] = a[1];
			a[1] = e;
		}
		int yono = 0;
		if(a[0] % 2 == 1){
		}else if(a[1] % 2 == 1){
			yono++;
			a[1]++;
			a[2]++;
		}else if(a[2] % 2 == 1){
			yono++;
			a[0]++;
			a[1]++;
		}
		for(int i = 0 ; i < 3 ; i++) a[i] /= 2;
		int max = Math.max(a[0] , Math.max(a[1] , a[2]));
		for(int i = 0 ; i < 3 ; i++) yono += (max - a[i]);
		ou.print(yono + "\n");
		ou.flush();
    }
}