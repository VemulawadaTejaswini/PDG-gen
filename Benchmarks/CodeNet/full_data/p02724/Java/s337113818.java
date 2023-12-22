import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Integer integ = sc.nextInt();
         
      	Integer fh = 0;
      	while(integ >= 500){
        	integ -= 500;
          	fh++;
        }
      	Integer f = 0;
      	while(integ >= 5){
        	integ -= 5;
          	f++;
        }
      	int happy = (fh*1000) + (f*5);
      
		System.out.println(happy);
	}
}