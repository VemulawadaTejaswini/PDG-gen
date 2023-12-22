import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
	  //カードの枚数
      int n = sc.nextInt();
      //カードの点数
      Integer a[] = new Integer[n];
      for(int i = 0; i < n; i++){
        a[i] = sc.nextInt();
      }
      Arrays.sort(a,Collections.reverseOrder());
      //Aliceの得点
      int alice = 0;
      //ボブの得点
      int bob = 0;
      for(int i = 0;i < n; i++){
      	if(i % 2 == 0){
          alice += a[i];
        }else{
          bob += a[i];
        }
      }
      System.out.println(alice - bob);
    }
}