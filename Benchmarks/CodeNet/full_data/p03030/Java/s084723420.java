import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner stdle = new Scanner(System.in);
		// 整数の入力
        int N = stdle.nextInt(); 
        String[] S = new String[N];
        int[] P = new int[N];

        for(int i = 0; i < N; i++){
            S[i] = stdle.next();
            
            P[i] = stdle.nextInt();
        }

        int[] SPc = new int[N];
        int[] flag = new int[N];
        int[] Sname = new int[N];
        for(int i = 0; i < N; i++){
            Sname[i] = (int)(S[i].charAt(0));
        }
        int count = 0;
        int min = 1000000;
        for(int i = 0; i < N; i++){
            for(int j = 0 ; j < N; j++){
                if(flag[j] == 0){
                    if(min >  Sname[j]){
                        min = Sname[j];
                        SPc[count] = j;
                    }
                }
            
            }
            flag[SPc[count]] = 1;
            min = 100000;
            count += 1;
            
        }

        for(int h = 0 ; h < N; h++){
            System.out.println((SPc[h]+1));
        }
        
       
    }
}

