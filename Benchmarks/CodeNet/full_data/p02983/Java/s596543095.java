import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	Long a = sc.nextLong();
      	Long b = sc.nextLong();
      	int min = 2018;
      	sc.close();
      	if(b - a > 2019){
        	System.out.print(0);
        }
      	else{
      	for(Long i = a; i < b; i ++){
          	for(Long j = i + 1; j <= b; j ++){
            	if(min > (((Long)(i * j)) % 2019)){
                	min = ((Long)(i * j)) % 2019;
                }
              	if(min == 0){
                	break;
                }
            }
        }
          System.out.print(min);
        }
      	
      	
    }
 
}