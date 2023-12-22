import java.util.Scanner;
import java.util.ArrayList;

class Main{
	public static void main(String[] args){
      	ArrayList<Long> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
      	for (long i = 1; i*i <= n; i++) { 
          if (n%i == 0) {
              list.add(i);       
              if (i != n / i) {
                  list.add(n/i);
              }
          }
        }
		
        long min = n;
        for(int i = 0; i < list.size()-1; i+=2){
          long x = list.get(i);
          long y = list.get(i+1);
          if(min > (x+y-2)) min = x+y-2;
        }
        System.out.println(min);
          
	}
}