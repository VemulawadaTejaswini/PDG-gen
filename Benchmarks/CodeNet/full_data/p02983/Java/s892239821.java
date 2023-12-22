import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      	int min1 = a;
      	int min2 = b;
      	int pointer = a;
      	sc.close();
      	for(int i = a; i <= b; i ++){
          	if(min1 > (i % 2019)){
            	min1 = (i % 2019);
              	pointer = i;
            }
        }
      	for(int i = a; i <= b; i ++){
          	if(i != pointer){
            	min2 = Math.min(min2, (i % 2019));
            }
          	
        }
      	System.out.print(min1 * min2);
    }
 
}