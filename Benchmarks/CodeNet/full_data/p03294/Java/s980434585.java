import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 入力数の入力
		int N = sc.nextInt();
		
		ArrayList<Integer> listA = new ArrayList<Integer>();
		
		// 数字のの入力
		for(int i = 1;i <= N;i++){
			listA.add(sc.nextInt());
		}
		
		long m = 0;
		
		//fの計算
		for(int i = 1;i < listA.size();i++)
		{
			if(i == 1){
				m = lcm(listA.get(i-1),listA.get(i));
			}else{
				m = lcm(m,listA.get(i));
			}
		}

		m --;
		long f = 0;
			
		for(int i = 0;i < listA.size();i++)
		{
			f += m % listA.get(i);
		}

   		System.out.println(f);
   		sc.close();
        return ;

    }
    
    static long gcd (long x,long y) {return y>0?gcd(y,x%y):x;}
    
  //最小公倍数lcm
    static long lcm (long a, long b) {
    	long temp;
    	long c = a;
    	c *= b;
    	while((temp = a%b)!=0) {
    		a = b;
    		b = temp;
    	}
    	return (long)(c/b);
    }
}

