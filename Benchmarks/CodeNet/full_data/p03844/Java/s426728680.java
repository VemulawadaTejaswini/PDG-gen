import java.util.*;
class Main{
	public static void main(String args[]){
    	Scanner s= new Scanner(System.in);
      	int a=s.nextInt();
      	char str=s.next().charAt(0);
      //System.out.println(str);
      	int b=s.nextInt();
      	
      if(str=='+'){
      	System.out.println(a+b);	
      }else{
      System.out.println(a-b);}
      
    }
}
