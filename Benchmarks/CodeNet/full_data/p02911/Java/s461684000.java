import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int nin = in.nextInt();
		long point = in.nextInt();
		int ave = in.nextInt();
		int san[] = new int[nin+1];
		
		long line = point - ave;
		if(line>0){
		    for(int i = 0; i < nin ; i++){
		        System.out.println("Yes");
		    }
		        System.exit(0);
		}else{
		    for(int i = 1 ; i <= ave ; i++){
		      san[in.nextInt()] += 1; 
		    }
		}
		    long dist = 1 - line;
	        for(int i = 1 ; i <= nin ; i++){
		       if(san[i]>=dist){
		            System.out.println("Yes");
		       }else{
		            System.out.println("No");
		       }
		    }
	}
}
