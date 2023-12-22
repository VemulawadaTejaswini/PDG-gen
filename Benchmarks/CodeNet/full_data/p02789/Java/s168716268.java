import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      		int a = sc.nextInt();


      int[] ary=new int[a];
      for (int i=0; i < a;i++){
        ary[i]=sc.nextInt();
      }
	int ans=0;      
    int min=2000000;
      int max=0;
      for (int i=0; i < a;i++){
        if (ary[i]<min){
          ans++;
          min=ary[i];
        } else if (true) {
        }
      }
		System.out.println(ans);
	}
}