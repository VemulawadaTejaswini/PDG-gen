import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int L = sc.nextInt();
        sc.nextLine();
        String S[] = new String[N];
        
        for(int i=0 ; i< N ; i++){
            S[i] = sc.nextLine();
        }
        
        Arrays.sort(S);
        
        for(String i:S){
            System.out.print(i);
        }
    }
}
