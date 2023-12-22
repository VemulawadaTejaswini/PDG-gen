import java.util.*;

import java.io.*;
 
public class Main{

    public static int stringToInt(char i, int[] a){
        if(i == 'A') return a[0];
        if(i == 'B') return a[1];
        if(i == 'C') return a[2];
        return 0;
    }
 
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = s.nextInt();
        }

        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        boolean result = false;
        for(int i = 0; i < N; i++){
            if(map.get(A[i]) == null){
                 map.put(A[i], true);
            }else{
                result = true;
                break;
            }

        }
        if(result){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
        
        
	}
} 