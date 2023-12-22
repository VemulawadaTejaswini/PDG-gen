import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        long[] b = new long[a];
      long[] c = new long[a];
        long sum = 0;
        boolean check = false;
		for(int i=0; i<a; i++){
          b[i] = sc.nextLong();
          c[i] = sc.nextLong();
        }
        for(int i=a-1; i>0; i--){
          if(check){
            if(b[i] + b[i-1] < -(b[i] + b[i-1])){
            b[i] = -b[i];
            b[i-1] = -b[i-1];
            }
            else if(c[i] + b[i-1] < -(c[i] + b[i-1])){
              b[i] = -c[i];
              b[i-1] = -b[i-1];
            }
          }
          }
          if(!check && b[i] + b[i-1] < -(b[i] + b[i-1])){
            b[i] = -b[i];
            b[i-1] = -b[i-1];
            check = false;
          }
          else if(b[i] + b[i-1] == -(b[i] + b[i-1])){
            c[i] = -c[i];
            c[i-1] = -c[i-1];
            check = true;
          }
          else check = false;
        }
        for(int i=0; i<a; i++){
          sum += b[i]; 
        }
		System.out.println(sum);
	}
}