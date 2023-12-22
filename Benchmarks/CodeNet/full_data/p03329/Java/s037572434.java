import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	int exp6,exp9;
    	Scanner sc = new Scanner(System.in);
         int value=sc.nextInt();
         
         for(exp6=1;Math.pow(6,exp6)<=value;exp6++);
 		for(exp9=1;Math.pow(9,exp9)<=value;exp9++);
 		exp6--;exp9--;
 		
         System.out.println(Math.min(pulloutcount(value,(int)Math.pow(6,exp6),1),pulloutcount(value,(int)Math.pow(9,exp9),1)));
         }

public static int pulloutcount(int value,int pullout,int count) {
	int exp6,exp9;
	value-=pullout;
	if(value<=5) {
		return value+count;
	}else {
		for(exp6=1;Math.pow(6,exp6)<=value;exp6++);
		for(exp9=1;Math.pow(9,exp9)<=value;exp9++);
		exp6--;exp9--;
		
		return Math.min(pulloutcount(value,(int)Math.pow(6,exp6),count+1),pulloutcount(value,(int)Math.pow(9,exp9),count+1));
	}
	
	
}


}