import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
  
        int all = 0;
        for(int i=0; i<M; i++){
            all += sc.nextInt();
        } 
        if(all>N){
            System.out.println("-1");
        }else{
            System.out.println(N-all);
        }
    }
}