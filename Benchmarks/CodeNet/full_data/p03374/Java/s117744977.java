
import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int n = Integer.parseInt(sc.next());
            long c = Long.parseLong(sc.next());
            long[][] sushi = new long[n][2];
            long temp, a, b;
            
            for(int i=0; i<n; i++){
            	sushi[i][0] = Long.parseLong(sc.next());
                sushi[i][1] = Long.parseLong(sc.next());
            }
            
            temp = sushi[0][1];
			sushi[0][1] = 0;
			a = solve(sushi, n-1, 0, 1, 0, c, n) + temp - Math.abs(sushi[0][0] - 0);
			
			sushi[0][1] = temp;
			temp = sushi[n-1][1];
			sushi[n-1][1] = 0;
			b = solve(sushi, n-1, 0, -1, n-1, c, n) + temp - c + Math.abs(sushi[n-1][0] - 0);
			
			sushi[n-1][1] = temp;
            
            //出力
            System.out.println(Math.max(Math.max(a, b), 0));
            sc.close();
        }
        
        public static Long solve(long[][] sushi, int num, int flag, int direction, int ith, long c, int n){
            Long ret = (long)0;
            Long temp;
            Long a, b;
        	
        	if(num>0){
        		if(flag == 1){
        			while(sushi[ith+direction][1] >= Math.abs(sushi[ith+direction][0] - sushi[ith][0])){
        				ret += sushi[ith+direction][1] - Math.abs(sushi[ith+direction][0] - sushi[ith][0]);
        				ith += direction;
        			}
        		}else{
        			temp = sushi[ith+direction][1];
        			sushi[ith+direction][1] = 0;
        			a = solve(sushi, num-1, 0, direction, ith+direction, c, n) + temp - Math.abs(sushi[ith+direction][0] - sushi[ith][0]);
        			
        			sushi[ith+direction][1] = temp;
        			
        			temp = sushi[(n-direction)%(n+1)][1];
        			sushi[(n-direction)%(n+1)][1] = 0;
        			b = solve(sushi, num-1, 1, -direction, (n-direction)%(n+1), c, n) + temp - Math.abs(c - sushi[(n-direction)%(n+1)][0] + sushi[ith][0]);
        			
        			sushi[(n-direction)%(n+1)][1] = temp;
        			
        			ret = Math.max(0, Math.max(a, b));
        		}
            }
        	
        	return ret;
        }
    }
	