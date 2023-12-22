import java.util.*;
 
class Main
{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int[] points = new int[2];
		for(int i=0; i<points.length; i++){
			points[i] = sc.nextInt();
		}
		
		int intN = points[0];
		int intD = points[1];
		
        System.out.println((int)Math.ceil((intN / (intD*2+1))));
    }
}