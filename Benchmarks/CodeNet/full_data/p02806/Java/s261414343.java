import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] s=new String[N];
        int[] t=new int[N];
        for(int i=0; i<N; i++){
            s[i]=sc.next();
            t[i]=sc.nextInt();
        }
        String X = sc.next();
        int res=0;

        for(int i=0; i<N; i++){
            if(X == s[i]){
                for(int j=i+1; j<N; j++){
                    res = res + t[j];
                }
                System.out.println(res);
                return;
            }
        }
        
        
        
        
        }
    }