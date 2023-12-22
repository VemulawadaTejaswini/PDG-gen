import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N =sc.nextInt();
      //空っぽの箱がN個用意しておく。のちにおいしさをいれる。
      int[] d =new int[N];
      //ここでd1から順に入れていける。でも、何個入れるかわからないので、ループを使う。
          
      for(int i=0; i<N; i++){
        //おいしさ。
      d[i] =sc.nextInt();
      }
      
      
      //Nから２つ選ぶとき、そのすべての組み合わせをループする。
      int total = 0;
      for(int x=0; x<N-1; x++){
      for(int y=x+1; y<N; y++){
      int r = d[x]*d[y];
        total += r;
      }
      }
          System.out.println(total);
    }
}
