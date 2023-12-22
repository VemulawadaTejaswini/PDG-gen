import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String b = "";
		
		for(int i=0; i<n; i++){
			Integer a = in.nextInt();
			if(i==0){
				b = a.toString();
			}else{
				if(n%2==0){
					if(i%2==1){
						b = a + " " + b;
					}else{
						b = b + " " + a;
					}
				}else{
					if(i%2==0){
						b = a + " " + b;
					}else{
						b = b + " " + a;
					}
				}
			}
		}
		
		System.out.println(b);		
	}
}