import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            long n = Integer.parseInt(sc.next());
            long m = Integer.parseInt(sc.next());
            long ret = 0;
            
            if(n>1 && m>1){
            	ret = (n-2) * (m-2);
            }else if(n==1 && m==1){
            	ret = 1;
            }else{
            	ret = Math.max(n, m) - 2;
            }
            
            //出力
            System.out.println(ret);
            sc.close();
        }
    }
	