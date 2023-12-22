import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
      // 整数の入力
		int N = sc.nextInt();
		int[] a = new int[N];
      	int maxnum = 1;
        boolean flag = false;
      	for(int i=0;i<N;i++){
          a[i]=sc.nextInt();
          if(a[i]==maxnum){
          	maxnum++;
            flag = true;
          }
        }
      	if(flag){
	      	System.out.println(N-maxnum+1);
        }else{
        	System.out.println(-1);
        }

      
      	
	}
}