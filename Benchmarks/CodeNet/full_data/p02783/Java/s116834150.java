import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//　敵の数
		int n = sc.nextInt();
		// 必殺技の回数
		int k = sc.nextInt();
        //攻撃回数
        long t = 0;
      
      	// 必殺技で除去できる物は除外
     	if(k>=n){
          System.out.println(t);
        }
      
      	else{
          //敵の体力
		  long a[] = new long[n];
      	
  		  for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
          }
      
      	  Arrays.sort(a);
      	
          for(int i=0;i<n-k;i++){
            t = t+a[i];
          }
		  System.out.println(t);
        }
	}
}
