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
        boolean[] AC = new boolean[N];
        int[] WA = new int[N];
        for(int i = 0; i < M; i++){
            if(AC[p[i]-1] == false){
                if(S[i].equals("AC")){
                    AC[p[i]-1] = true;
                    correct++;
                }else{
                    WA[p[i]-1]++;
                }
            }else{
                continue;
            }
        }

        for(int i = 0; i < N; i++){
            if(AC[i] == false){

            }else{
                wrong += WA[i];
            }
        }
        
        System.out.println(correct + " " + wrong);
 
	}
} 