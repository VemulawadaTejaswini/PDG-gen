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
    }
    class A{
    	void doIt(){
    		String str = sc.next();
    		char ctr[] = str.toCharArray();
    		int U = 0,D = 0,L = 0,R = 0;
    		for(int i = 0;i < str.length();i++){
    			if(ctr[i] == 'S'){
    				D = 1;
    			}else if(ctr[i] == 'N'){
    				U = 1;
    			}else if(ctr[i] == 'W'){
    				L = 1;
    			}else{
    				R = 1;
    			}
    		}
    		boolean ok = true;
    		if((D + U) % 2 == 1)ok = false;
    		if((L + R) % 2 == 1)ok = false;
    		if(ok)System.out.println("Yes");
    		else System.out.println("No");
    	}
    }
}