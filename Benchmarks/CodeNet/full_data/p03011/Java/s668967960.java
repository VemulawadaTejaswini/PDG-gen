import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int P = sc.nextInt();
      int Q = sc.nextInt();
      int R = sc.nextInt();
      if(P>=Q && P>=R){
        System.out.println(Q+R);
      }else if(Q>=P && Q>=R){
        System.out.println(P+R);
      }else if(R>=P && R>=Q){
        System.out.println(P+Q);
      }
    }
}     