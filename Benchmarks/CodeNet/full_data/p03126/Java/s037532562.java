import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();//メニューの数
    int p = 0;
    int q = 0;
    int aa = (1<<m) - 1; //2^m-1
    int bb = 0;
    //System.out.println(aa);

    for(int i=0; i<n; i++){
      int lo = sc.nextInt();
      for(int k=0; k<lo; k++){
        p = sc.nextInt();
        q =  q + (int)Math.pow(2,p-1);
      }
      if(i==0){
        bb = q & aa;
      }else{
        bb = bb & q;
      }

      q =0;

    }

    System.out.println(Integer.bitCount(bb));












  }
}