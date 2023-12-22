import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int K = sc.nextInt();
        String Slist[] = S.split("");
        
        String change = Slist[K-1];
        
        for(int i=0;i<S.length();i++){
            
            if(!(Slist[i].equals(change))){
                Slist[i]="+";
            }
        }
        
        
        
        
        
    }
}
