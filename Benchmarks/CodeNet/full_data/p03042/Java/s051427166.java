import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int N = scan.nextInt();
      	int upper  = N / 100;
      	int down = N % 100;
      	if(down == 0 || down > 13){//tsuki ga ato janai
          	if(upper == 0 || upper > 12){
        		System.out.print("NA");
            }
          	else {
            	System.out.print("MMYY");
            }
        }
      	if(0 < down && down < 13){
        	if(0 < upper && upper < 13){
            	System.out.print("AMBIGUOUS");
            }
          	else {
            	System.out.print("YYMM");
            }
        }
      	
    }
 
}