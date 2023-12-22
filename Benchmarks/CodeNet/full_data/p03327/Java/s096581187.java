import java.util.Scanner;

public class main{
	public static void main(String[] args){ 
    Scanner scan = new Scanner(System.in);

    String str = scan.next();
    int i = Integer.paraseInt(str);
    if(i > 999){
    	System.out.print("ABD");
    }else{
    	System.out.print("ABC");
    }
	}
}