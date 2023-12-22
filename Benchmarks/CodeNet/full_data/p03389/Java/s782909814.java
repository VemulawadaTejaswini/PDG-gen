import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());
            int max = Math.max(Math.max(a, b), c);
            
            a = max - a;
            b = max - b;
            c = max - c;
            
            if(a%2 + b%2 + c%2 == 0){
            	System.out.println(a/2 + b/2 + c/2);
            }else if(a%2 + b%2 + c%2 == 1){
            	System.out.println(a/2 + b/2 + c/2 + 2);
            }else if(a%2 + b%2 + c%2 == 2){
            	System.out.println(a/2 + b/2 + c/2 + 1);
            }
            
            sc.close();
        }
    }
	