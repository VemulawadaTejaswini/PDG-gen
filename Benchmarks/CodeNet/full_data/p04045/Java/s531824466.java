import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        ArrayList<Integer> D = new ArrayList<Integer>();
        for(int i=0; i<K; i++){
            int tmp = sc.nextInt();
            D.add(tmp);
        }
        int M = N;
        while(true){
            if(f(M,D))break;
            M++;
        }
        System.out.println(M);
    }
    static boolean f(int N, ArrayList<Integer> D){
        String S = String.valueOf(N);
        for(int i=0; i<S.length(); i++){
            int tmp = S.charAt(i)-'0';
            if(D.contains(tmp)){
                return false;
            }
        }
        return true;
    }
}