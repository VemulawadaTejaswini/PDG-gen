import java.util.*;
 
public class Main {
 
public static void main(String[] args){
  	int count5 = 0;
  	int count7 = 0;
	Scanner sc = new Scanner(System.in);
    String[] line = sc.nextLine().split(" ");
	for(String n:line){
    	if(n.equals("5")){
        	count5++;
        }
       	if(n.equals("7")){
        	count7++;
        }
    }
  if(count5==2 && count7==1){
  	System.out.println("YES");
  }else {
	System.out.println("NO");
  }
	
}
}