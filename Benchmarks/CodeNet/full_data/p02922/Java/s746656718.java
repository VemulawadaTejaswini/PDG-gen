import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
      	int A = sc.nextInt();
      	int B = sc.nextInt();
      	int anser;
      	int count = 1;
      
      	anser = B/A;
	    count = A * anser;
      	if(anser == 1){
        }else{
          	count = count - anser;
        }
      
		if(count >= B){
        }else{
          anser++;
          count = count + A;
        }
      	System.out.println(anser);
	}
}