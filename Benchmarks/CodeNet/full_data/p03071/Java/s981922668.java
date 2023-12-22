import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = A + B;
      int D = A + (A-1);
      int E = B + (B-1);
      if(C>=D && C>=E){
        System.out.println(C);
      }else if(D>=C && D>=E){
        System.out.println(D);
      }else if(E>=C && E>=D){
        System.out.println(E);
      }
    }
}