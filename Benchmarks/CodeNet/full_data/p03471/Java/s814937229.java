import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Y = sc.nextInt();

    int Yukichi = 0;
    int Higuchi = 0;
    int Noguchi = 0;
    
    boolean flag = false;

    loop: for(Yukichi = 0; Yukichi <= N; Yukichi++){
      for(Higuchi = 0; Yukichi + Higuchi <= N; Higuchi++){
        Noguchi = N - (Yukichi + Higuchi);
        int num = 10000*Yukichi + 5000*Higuchi + 1000*Noguchi;
        if(num == Y){
        	flag = true;
        	System.out.println(Yukichi +" "+ Higuchi +" "+ Noguchi);
        	break loop;
        }
      }
    }
    
    if(!flag)
    	System.out.println(-1 +" "+ -1 +" "+ -1);
  }
}