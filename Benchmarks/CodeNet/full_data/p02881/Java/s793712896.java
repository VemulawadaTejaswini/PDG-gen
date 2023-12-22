import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class Main{
	public static void main(String[] args){
      	ArrayList<Long> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
      	for (long i = 1; i * i <= n; i++) { 
        if (n % i == 0) {
            list.add(i);       
            if (i != n / i) {
                list.add(n / i);
            }
        }
        }
		
        long min = n;
        for(int i = 0; i < list.size(); i+=2){
          long x = Math.abs((1 - list.get(i)));
          long y = Math.abs((1 - list.get(i+1)));
          if(min > (x+y))
             min = x+y;
        }
        System.out.println(min);
          
	}
}