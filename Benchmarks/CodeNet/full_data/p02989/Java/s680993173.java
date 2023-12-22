import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// スペース区切りの整数の入力
        int[] d = new int[n];
        for(int i=0;i<n;i++){
          d[i]=sc.nextInt();
        }
        //ソート
        Arrays.sort(d);
        int dec = d[(n/2)]-d[n/2-1];
        
		// 出力
		System.out.println(dec);
	}
  
    
}