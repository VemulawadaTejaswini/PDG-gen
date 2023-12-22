import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int n = Integer.parseInt(sc.next());
            int m = Integer.parseInt(sc.next());
            int ret = 0;
            
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
	