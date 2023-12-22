import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      	int min = 2018;
      	sc.close();
      	if(b - a > 2019){
        	System.out.print(0);
        }
      	else{
      	for(int i = a; i < b; i ++){
          	for(int j = a + 1; j <= b; j ++){
            	if(min > ((i * j) % 2019)){
                	min = (i * j) % 2019;
                }
            }
        }
          System.out.print(min);
        }
      	
      	
    }
 
}