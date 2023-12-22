    import java.util.Scanner;
     
    public class Main {
    	public static void main(String[] args){
    		 Scanner INPUT_R = new Scanner(System.in);
    		 int R = INPUT_R.nextInt();
     
    		 int G = INPUT_R.nextInt();
     
    		 int B = INPUT_R.nextInt();
     
    		 if(((R * 100) + (G * 10) + B) % 4 ==0) {
    			 System.out.println("YES");
    		 }else {
    			 System.out.println("NO");
    		 }
     
    	}
    }