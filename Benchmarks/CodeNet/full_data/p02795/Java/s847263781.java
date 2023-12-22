import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int H = sc.nextInt();
      int W = sc.nextInt();
      int N = sc.nextInt();
      if(H>W){
        if(N%H==0){
          System.out.println(N/H);
        }else{
        	System.out.println(N/H+1);       
        }
      }else{
                if(N%W==0){
          System.out.println(N/W);
        }else{
        	System.out.println(N/W+1);       
        }
      }
    }
}