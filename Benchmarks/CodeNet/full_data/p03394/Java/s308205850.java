import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int n = Integer.parseInt(sc.next()), count = 0, i = 2, sum = 0;
            
            while(count<n-1){
            	if(i%2 == 0 || i%3 == 0){
            		System.out.print(i + " ");
            		sum += i;
            		count++;
            	}
            	i++;
            }
            
            for(int j = 6 - sum%6; ; j += 6){
            	if((j>=i || (j%2 != 0 && j%3 != 0)) && gcd(j, sum) != 1){
                    System.out.println(j);
                    sc.close();
                    return;
            	}
            }
        }
        
        public static int gcd(int a, int b) {
            return b == 0 ? a : gcd(b, a % b);
         }
    }
	