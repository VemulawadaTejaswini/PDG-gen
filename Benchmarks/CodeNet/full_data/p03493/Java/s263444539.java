import java.util.Scanner;

class ClassSample {
	  public static void main(String args[]){
        
        Scannar scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        int count = 0;
        
        if(s.charAt(0) == '1')count++;
        if(s.charAt(1) == '1')count++;
        if(s.charAt(2) == '1')count++;
		
        System.out.println(count);
	 }
}
