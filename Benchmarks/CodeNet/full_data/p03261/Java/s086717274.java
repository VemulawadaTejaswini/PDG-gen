import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] W = new String[N];
        W[0] = sc.next();

        loop:for(int i=1; i<N; i++){
            W[i] = sc.next();
            for(int j=0; j<i; j++){
                if(W[i].equals(W[j])){
                    System.out.println("No");
                    break loop;
                }
            }
            if(W[i].charAt(0)!=W[i-1].charAt(W[i-1].length()-1)){
                System.out.println("No");
                break;
            }
            if(i==N-1){
                System.out.println("Yes");
            }
        }
    }
}