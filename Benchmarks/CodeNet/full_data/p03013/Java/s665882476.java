import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
      	Integer a[] = new Integer[m];
      	int step[] = new int[n+1];
      
      	for(int i=0;i<m;i++){
          a[i] = sc.nextInt();
        }
      
      	step[0] = 1;
      	if(Arrays.asList(a).contains(1)){
          step[1] = 0;
        }else{
          step[1] = 1;
        }
      
		for(int i=2;i<=n;i++){
          if(Arrays.asList(a).contains(i)){
            step[i] = 0;
          }else{
            step[i] = step[i-1] + step[i-2];
          }
        }
      
		System.out.println(step[n]%1000000007);
	}
}