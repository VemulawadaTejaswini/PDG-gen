import  java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int a = scan.nextInt();
      	int prepre = 2;//n-2
      	int pre = 1;//n-1
      	int now = 3;
      	if(a == 1){
        	System.out.print(prepre);
        }
      	else if(a == 2){
        	System.out.print(pre);
        }
      	else{
      		for(int i = 2; i < a; i++){
        		prepre = pre;
          		pre = now;
              	now = prepre + pre;
       	 	}
          	System.out.print(now);
        }
    	
    }

}