import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;
import java.lang.Object;
 
public class Main {
    Scanner sc = new Scanner(System.in);
   
    public static void main(String[] args) {
        new Main(); 
    }
   
    public Main() {
        new A().doIt();
//        new D().doIt();
    }
    class D{
    	void doIt(){
    		int Max = 1000000009;
        	int all[] = new int[900003];
        	ArrayList<Par> array = new ArrayList<Par>();
    		all[0] = 1;
    		for(int i = 1;i < 900003;i++){
        		all[i] = (all[i-1] * 3) % Max;
        	}
    		int A = sc.nextInt();
    		int B = sc.nextInt();
    		int C = sc.nextInt();
    		int sum = 0;
    		array.add(new Par(A,B,C,A+B+C));
    		int length = 1;
    		while(length > 0){
    			Par p = array.remove(length - 1);
    			length--;
    			if(p.A== 0){
    				sum = (sum + all[p.cnt]) % Max;
    			}
    			if(p.A - 1 >= 0){
    				array.add(new Par(p.A-1,p.B,p.C,p.cnt-1));
    				length++;
    			}
    			if(p.B - 1 >= 0){
    				array.add(new Par(p.A,p.B-1,p.C,p.cnt-1));
    				length++;
    			}
    			if(p.C - 1 >= 0){
    				array.add(new Par(p.A,p.B,p.C - 1,p.cnt-1));
    			}
    		}
    		System.out.println(sum);
    	}		
    	class Par{
    		int A,B,C,cnt;
    		public Par(int A,int B,int C,int cnt){
    			this.A = A;
    			this.B = B;
    			this.C = C;
    			this.cnt = cnt;
    		}
    	}
    }
    class A{
    	long result = 0;
    	void dfs(String str,int num,int length,long cnt){
    		if(num == length){
    			result = result + cnt;
    		}
    		else{
    			for(int i = num;i < length;i++){
    				dfs(str,i+1,length,cnt + Long.parseLong(str.substring(num,i+1)));
    			}
    		}
    	}
    	void doIt(){
    		String str = sc.next();
    		int length = str.length();
    		dfs(str,0,length,0);
    		System.out.println(result);
    	}
    }
}