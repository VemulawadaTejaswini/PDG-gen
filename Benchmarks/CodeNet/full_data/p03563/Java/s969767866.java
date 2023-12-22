import java.util.Scanner;
 
class Main {
    public static void main (String[] args){
    	Scanner sc=new Scanner(System.in);
    	Double a=sc.nextDouble();
    	Double b=sc.nextDouble();
    	if(a>b)System.out.println(a+a-b);
    	else System.out.println(b+b-a);
 
    	
    }
}