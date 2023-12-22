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

        HashMap<Integer, Boolean> result = new HashMap<Integer, Boolean>();
        int correct = 0;
        int wrong = 0;
        for(int i = 0; i < M; i++){
            if(result.containsKey(p[i]) == false){
                if(S[i].equals("WA")){
                    wrong++;
                    result.put(p[i], false);
                }else{
                    correct++;
                    result.put(p[i], true);
                }
            }else{
                if(result.get(p[i]) == true){
                    continue;
                }else{
                    if(S[i].equals("WA")){
                        wrong++;
                        result.put(p[i], false);
                    }else{
                        correct++;
                        result.put(p[i], true);
                    }
                }
            }
        }
        
        System.out.println(correct + " " + wrong);
 
	}
} 