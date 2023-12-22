import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        String[] S = sc.next().split("");
        long res = 0;
        
        for(int i = 1; i < S.length; ++i){
            for(int j = i+1; j < S.length; ++j){
                for(int k = j+1; k <= S.length; ++k){
                    if(!S[i-1].equals(S[j-1]) && !S[i-1].equals(S[k-1]) && !S[j-1].equals(S[k-1])) {
                        if((j - i) != (k - j)) {
                            res++;
                        }
                    }
                }
 
            }
        }
        System.out.println(res);
    }
    
}