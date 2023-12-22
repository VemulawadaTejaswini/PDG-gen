import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner stdin = new Scanner( System.in);
		String  x;
		int i=0,j=0;
		x =stdin.next();
		for(int k=0;k<x.length();k++){
			char xx=x.charAt(k);
			if(xx=='W') {j=j+i;
			}else{i++;
			}
			
		}
		System.out.print(j);
	}
}
