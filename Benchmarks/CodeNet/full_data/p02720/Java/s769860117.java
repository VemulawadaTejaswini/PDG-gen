import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        long[] a = new long[1000001];
        for(int i = 1; i <= 9; i++){
        	a[i] = i;
        }
        int cnt = 10;
        int x = 0;
        for(int i = 1; i <= 9; i++){
    		long d = a[i]%10;
    		if(d == 0){
    			a[cnt++] = a[i]*10;
    			a[cnt++] = a[i]*10+1;
    			x+=2;
    		}
    		else if(d==9){
    			a[cnt++] = a[i]*10+8;
    			a[cnt++] = a[i]*10+9;
    			x+=2;
    		}
    		else{
    			a[cnt++] = a[i]*10+d-1;
    			a[cnt++] = a[i]*10+d;
    			a[cnt++] = a[i]*10+d+1;
    			x+=3;
    		}
    	}
        int l = 10,r = 10+x;
        x = 0;
        for(int i = l; i <= r; i++){
        	long d = a[i]%10;
    		if(d == 0){
    			a[cnt++] = a[i]*10;
    			a[cnt++] = a[i]*10+1;
    			x+=2;
    		}
    		else if(d==9){
    			a[cnt++] = a[i]*10+8;
    			a[cnt++] = a[i]*10+9;
    			x+=2;
    		}
    		else{
    			a[cnt++] = a[i]*10+d-1;
    			a[cnt++] = a[i]*10+d;
    			a[cnt++] = a[i]*10+d+1;
    			x+=3;
    		}
        }
        for(int k = 1; k <= 7; k++){
        	l = r+1;
            r = l+x;
            x = 0;
            for(int i = l; i <= r; i++){
            	long d = a[i]%10;
        		if(d == 0){
        			a[cnt++] = a[i]*10;
        			a[cnt++] = a[i]*10+1;
        			x+=2;
        		}
        		else if(d==9){
        			a[cnt++] = a[i]*10+8;
        			a[cnt++] = a[i]*10+9;
        			x+=2;
        		}
        		else{
        			a[cnt++] = a[i]*10+d-1;
        			a[cnt++] = a[i]*10+d;
        			a[cnt++] = a[i]*10+d+1;
        			x+=3;
        		}
            }
        }
        int n = cin.nextInt();
        System.out.println(a[n]);
    }
}


