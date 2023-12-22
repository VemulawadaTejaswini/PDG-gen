import java.util.*;

public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);		
		double nextTime = 0;
      	for(int i=0;i<5;i++){
        	nextTime = nextTime + (double)sc.nextInt(); 
        	if(i!=4) nextTime = Math.ceil(nextTime/10)*10;
        }
      	System.out.println((int)nextTime);
    }
}