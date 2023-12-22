import java.io.*; 
import java.util.Scanner;

public class Main {
  
	public static void main(String[] args){
      	Scanner in = new Scanner(System.in);
		int Ph = in.nextInt();
      	int Qh = in.nextInt();
      	int Rh = in.nextInt();
      
      	System.out.println(minSumBetween(Ph,Qh,Rh));
      
	}
  
  	public static int minSumBetween(int a,int b,int c){
    	if(a<b){
        	if(b<c) return a+b;
          	else return a+c;
        }else{
        	if(a<c) return b+a;
          	else return b+c;
        }
    }
}