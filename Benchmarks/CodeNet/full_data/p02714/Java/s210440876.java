import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	String s = sc.next();
      	int count = 0;
      	int istack;
      
      	Map cMap = new HashMap<Character,Integer>() {
          {
        	put('R',1);
        	put('G',10);
        	put('B',100);
          }
        };    	
      
      	for(int i = 0;i < n;i++){
          for(int j = i+1;j < n;j++){
            for(int k = j+1; k < n;k++){
              if(j - i != k - j){
                istack = (int)cMap.get(s.charAt(i))
                  +(int)cMap.get(s.charAt(j))
                  +(int)cMap.get(s.charAt(k));
                if(istack == 111) count++;
              }
            }
          }
        }
      
      	System.out.println(count);
	}
}
