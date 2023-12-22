import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        long[] a = new long[5];
        long[] remain = new long[6];
		long num = sc.nextLong();
        remain[0] = num;
        for(int i=0; i<5; i++){
          a[i] = sc.nextLong();
        }
        long count = 0;
        int loop = 0;
        while(true){
          for(int i=4; i>=loop; i--){
            if(remain[loop] == 0) loop++;
            if(remain[i] == 0) continue;
            else if(remain[i] < a[i]){
              remain[i+1] += remain[i];
              remain[i] = 0;                                    
            }
            else{
              remain[i] -= a[i];
              remain[i+1] += a[i];
            }
          }
          /*for(int i=0; i<4; i++){
            if(a[i] < a[i+1]) a[i+1] = a[i];
          }*/
          //count = num / a[0];
          //if(num > a[0] && (num % a[0]) != 0 && !(a[0] < a[1] && a[1] < a[2] && a[2] < a[3] && a[3] < a[4])) count++;
          count++;
          if(remain[5] == num) break; 
        }
		System.out.println(count);
	}
}