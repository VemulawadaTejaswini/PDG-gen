import java.util.*;
public class Main{
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N=scanner.nextInt();
    int K=scanner.nextInt();
    

    if (K==1){
        System.out.println(0);
    }else if(K>N*2){
        System.out.println(N);
    }else{
        
        while(N>Math.abs(N-K)){
            N=Math.abs(N-K);
            
        }
        System.out.println(N);
    }
  }

}