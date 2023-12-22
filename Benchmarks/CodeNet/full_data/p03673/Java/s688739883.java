import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer a = in.nextInt();
		StringBuilder b = new StringBuilder();
		b.append(a.toString());
		if(n%2 == 0){
			for(int i=1; i<n; i++){
				a = in.nextInt();
				
				if(i%2==1){
					b.insert(0, " ").insert(0, a);
				}else{
					b.append(" ").append(a);
				}			
			}
			System.out.println(b);
		}else{
			for(int i=1; i<n; i++){
				a = in.nextInt();
				
				if(i%2==0){
					b.insert(0, " ").insert(0, a);
				}else{
					b.append(" ").append(a);
				}
								
			}
			System.out.println(b);
		}
		
				
	}
}