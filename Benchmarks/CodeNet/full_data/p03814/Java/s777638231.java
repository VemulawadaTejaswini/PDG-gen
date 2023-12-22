import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

  		String str = sc.next(); 
      	int i = 0;
      	int count = 0;;
      	int count_commit = 0;
      
      	while(str.charAt(i) != 'A') i++;
     
        for(; i < str.length(); i++) {
          	count++;
        	if(str.charAt(i)=='Z'){
            	count_commit += count;
            	count = 0;
            }
        }
      
      	System.out.println(count_commit);
        
	}
}
