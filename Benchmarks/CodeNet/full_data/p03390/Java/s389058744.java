import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int q = Integer.parseInt(sc.next());
            long a, b, temp, re;
            int bflag = 0, doubleflag = 0, root;
            
            for(int i=0; i<q; i++){
            	a = Long.parseLong(sc.next());
            	b = Long.parseLong(sc.next());
            	re = a * b - 1;
            	
            	if(re == 0){
            		System.out.println(0);
            		sc.close();
            		return;
            	}
            	
            	bflag = 0;
            	doubleflag = 0;
            	root = (int)Math.sqrt(re);
            	
            	if(a>b){
            		temp = a;
            		a = b;
            		b = temp;
            	}
            	
            	if(re/root == root){
            		doubleflag = 1;
            	}
            	if(a-2 == re/(b+1) && b-1 > a){
            		bflag = 1;
           		}
            	System.out.println(root * 2 - 1 - doubleflag - bflag + a/b);
            }
            sc.close();
        }
    }
	