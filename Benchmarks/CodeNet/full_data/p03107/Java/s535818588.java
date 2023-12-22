import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
  		
      	String s = sc.next();
      	List<Character> ss = new ArrayList<Character>();
      	int count = 0;
      
      	for(int i = 0;i < s.length();i++){
          	ss.add(s.charAt(i));
        }
      	
      	for(int i = 0; i < ss.size()-1;i++){
          if(ss.get(i) != ss.get(i+1)){
          	ss.remove(i);
            ss.remove(i);
            count += 2;
             
            if(i-2 >= -1) i -= 2;
            else i -=1;
          }
        }
          
        System.out.println(count);
	}
}
