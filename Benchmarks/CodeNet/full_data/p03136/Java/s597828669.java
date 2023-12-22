import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      side = new int[n];
      for(i=0;i<=n;i++){
        side[i] = sc.nextInt();
      }
      int max = 0
      for(p=0;p<=n;p++){
       if(max<side[i]){
         max=side[i]
       }
      }
      int sum = 0
      for(q=0;q<=n;q++){
        sum += side[q]
      }
      if(sum-max>max){
        System.out.println("yes");
        else
        System.out.println("no");
      }
	}
}
