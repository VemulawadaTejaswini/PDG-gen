import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int l = sc.nextInt();
    	int r = sc.nextInt();
    	int num = 0;
    	int result = 2019;
    	for(int i = l;i <= r;i++) {
    		for(int j = i+1;j <= r;j++) {
    			num = (i*j)%2019;
    			result = Math.min(result,num);
    		}
    	}
    	System.out.println(result);
    	sc.close();
    }
}