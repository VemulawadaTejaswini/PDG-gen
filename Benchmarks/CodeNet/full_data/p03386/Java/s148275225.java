import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      // 取得
	  int A = sc.nextInt();
      int B = sc.nextInt();
      int K = sc.nextInt();
      int pos = A;
      //前から
      for(int i=0;i<K && pos<=B;i++){
        pos++;
        System.out.println(A+i);
      }
      //後ろから
      for(int j=pos;j<=B;j++){
        if(j>B-K){
          System.out.println(j);
        }
      }
    }
}