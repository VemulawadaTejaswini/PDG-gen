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
        long min = a[0];
        long count = 0;
        int plus = 0;
        for(int i=1; i<5; i++){
          if(a[i] < min) {
            min = a[i];
            plus = i;
          }
          //if(a[i] < a[i+1]) a[i+1] = a[i];
          //if(a[i] > a[i+1]) plus += (a[i]-a[i+1]);
        }
        count = num / min;
          if(num > a[0] && (num % a[0]) != 0) count++;
          //count++;
          //if(remain[5] == num) break; 
        //}
		System.out.println(count+5-plus);
	}
}