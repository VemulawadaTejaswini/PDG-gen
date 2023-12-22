import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();
        String a = "RGB";
        int ans = 0;

        for(int i=0; i<N-2; i++){
            for(int j=i+1; j<N-1; j++){
                if(S.charAt(i)==S.charAt(j)){
                    continue;
                }
                else{
                    for(int k=j+1; k<N; k++){
                        if(S.charAt(i)==S.charAt(k) || S.charAt(j)==S.charAt(k) || j-i==k-j){
                            continue;
                        }
                        else{
                            ans += 1;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}