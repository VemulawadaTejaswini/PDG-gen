package test;
import java.util.Scanner;
class Main{
	
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println(ze(x-a)>ze(x-b)?"B":"A");
 }
    private static int ze(int x) {
    	int x_ = x<0 ?-x :x ;
    	return x_;
    }
}
  
