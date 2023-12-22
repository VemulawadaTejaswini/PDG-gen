import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int AC = 0;
        int WA = 0;
        
        int Con[][] = new int[M][2];
        
        for(int i=0;i<M;i++){
            Con[i][0] = sc.nextInt();
            Con[i][1] = Judge(sc.next());
        }
        
        int Question[] = new int[N];
        for(int i=0;i<N;i++){
            Question[i] = 0;
        }
        
        for(int i=0;i<M;i++){
            if(Question[Con[i][0]-1] == 0 && Con[i][1] == 0){
                WA++;
            }
            if(Question[Con[i][0]-1] == 0 && Con[i][1] == 1){
                AC++;
                Question[Con[i][0]-1] = 1;
            }
        }
        
        
        System.out.println(AC + " " + WA);
    }
    
    public static int Judge(String judge){
        if(judge.equals("AC")){
            return 1;
        } else {
            return 0;
        }
    }
}
