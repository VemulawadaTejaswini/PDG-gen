import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        String[] s = new String[N];
        int count = 0;
        int countA = 0;
        int countB = 0;

        for(int i = 0; i < N; i++){
            s[i] = sc.next();
        
            if(s[i].contains("AB")){
                count++;
            }
            
            if(s[i].substring(0,1).equals("B")){
                countB++;
            }
            if(s[i].substring(s[i].length()-1,s[i].length()).equals("A")){
                countA++;
            }
        }
        System.out.println(count + Math.min(countA,countB));
    }
}
