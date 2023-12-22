import java.util.*;
 
import java.io.*;
 
public class Main{
    
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();

        String a = "";
        String b = "";
        for(int i = 0; i < M; i++){
            a = a + String.valueOf(N);
        }
        for(int i = 0; i < N; i++){
            b = b + String.valueOf(M);
        }
        if(a.compareTo(b) >= 0){
            System.out.println(b);
        }else{
            System.out.println(a);
        }
        
	}
} 