import java.util.*;
public class Main {
    public static void main(String[] args) {
    	//AtCoder Beginner Contest 053
    	//b
    	Scanner sc = new Scanner(System.in);
    	String s = sc.next();
        int x = s.length();
    	String[] arry = s.split("");
    	boolean flag = false;
    	int h = 0;
    	int o = 0;
    	for(int i = 0; i < x; i++){
    		if("A".equals(arry[i]) && flag == false){
    			flag = true;
    			h = i;
    		}
    		if("Z".equals(arry[i])) o = i;
    	}
    	System.out.println(o-h+1);
    }
}