import java.util.*;
 
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] c = sc.next().toCharArray();
        int e = 0;
        int w = 0;
        for(int i = 0; i < c.length; i++){
        	if(c[i] == 'E'){
            	e++;
            }
        }
        int min = e;
        for(int i = 1; i < n; i++){
            if(c[i] == 'E'){
            	e--;
            }
            if(c[i - 1] == 'W'){
            	w++;
            }
            min = Math.min(min, e + w);
        }
        System.out.println(min);
	}
}