import java.util.*;
public class Main{
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Long N=scanner.nextLong();
    Long K=scanner.nextLong();
    

    if (K==1){
        System.out.println(0);
    }else if(K>N*2){
        System.out.println(N);
    }else{
        N=(N>K)?N%K:K%N;
        do{
            N=Math.abs(N-K);
        }while(N>Math.abs(N-K));
        /*while(N>Math.abs(N-K)){
            N=Math.abs(N-K);
            
        }*/
        System.out.println(N);
    }
  }

}