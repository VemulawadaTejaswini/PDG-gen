import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
      	List ss = new ArrayList<Character>();
 		
      	for(int i = 0;i < s.length(); i++){
          if(s.charAt(i) != 'B') ss.add(s.charAt(i));
          else{
          	if(ss.size() != 0) ss.remove(ss.size()-1);
          }
        }
      
     	for(int i = 0;i < ss.size();i++) System.out.print(ss.get(i));
      	System.out.println();
        
	}
}
