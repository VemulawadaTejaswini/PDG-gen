import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        
        if(M>0){
            int[] p = new int[M];
            String[] S = new String[M];
            int AC = 0;
            int WA = 0;
            int x = 2;
            int y = 1;
            int WAX =1;
            String A = "AC";
            String W = "WA";
            
            for(int i=0; i<M; i++){
                p[i] = sc.nextInt();
                S[i] = sc.next();
            }
            if(S[0].equals(W)){
                WA += 1;
            }
            else if(S[0].equals(A)){
                AC += 1;
                x = 0;
            }
            for(int i=1; i<M; i++){
                if(p[i]==p[i-1] && i<x){
                    if(S[i].equals(W)){
                        WA += 1;
                        x += 1;
                        WAX += 1;
                    }
                    else if(S[i].equals(A)){
                        AC += 1;
                        x = i;
                    }
                    y += 1;
                }
                else if(p[i]!=p[i-1]){
                    if(y==WAX){
                        WA = WA-WAX;
                    }
                    if(S[i].equals(W)){
                        WA += 1;
                    }
                    else if(S[i].equals(A)){
                        AC += 1;
                    }
                    x = i+2;
                    WAX = 0; 
                    y = 0;
                }
            }
            System.out.println(AC + " " + WA);
        }
        if(M==0){
            System.out.println(0 + " " + 0);
        }

    }
}