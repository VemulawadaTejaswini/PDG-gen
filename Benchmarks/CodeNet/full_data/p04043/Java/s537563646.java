import java.util.*;
import java.io.*;
class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	String str = scan.next();
    	int N = Integer.parseInt(str);
      	str = scan.next();
      	int L = Integer.parseInt(str);
      	List<String> list = new ArrayList<>();
      	
      	for(int i = 0; i < N; i++){
        	String input = scan.next();
          	list.add(input);
        }
      	
      	Arrays.sort(list);
      	String ans;
      	for(i = 0; 2 ; i++){
        	input = list.get(i);
          	ans = ans + input;
        }
    	System.out.println(ans);
    }
}