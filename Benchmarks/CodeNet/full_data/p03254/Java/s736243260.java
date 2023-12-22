import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
        int x = sc.nextInt();
        int a[] = new int[n]; 
        int i;
        int count = 0;
        for(i = 0;i < n;i++){
          a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        i = 0;
        if(x - a[0] < 0){
            System.out.println(count); 
            System.exit(0);
        }
        while(x > 0){
          x -= a[i];
          count++;
          i++;
          if(i == n){
            break;
          }
        }
        System.out.println(count); 
      
 
 
    }
}