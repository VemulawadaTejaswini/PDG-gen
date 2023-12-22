import java.util.*;
 
import java.io.*;
 
public class Main{
    
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int[] p = new int[M];
        String[] S = new String[M];
        for(int i = 0; i < M; i++){
            p[i] = s.nextInt();
            S[i] = s.next();
        }

        int correct = 0;
        int wrong = 0;
        int[] AC = new int[N];
        for(int i = 0; i < M; i++){
            if(AC[p[i]-1] == 0){
                if(S[i].equals("AC")){
                    AC[p[i]-1]++;
                    correct++;
                }else{
                    wrong++;
                }
            }else{
                continue;
            }
        }
        
        System.out.println(correct + " " + wrong);
 
	}
} 