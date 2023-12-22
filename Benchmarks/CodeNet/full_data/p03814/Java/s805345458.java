import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    	Scanner scanner=new Scanner(System.in);

    	String input=scanner.next();

    	int first=0;
    	int last=0;

    	for(int i=0;i<input.length();i++) {
    		if(input.charAt(i)=='A') {
    			first=i;
    			break;
    		}
    	}

    	for(int i=input.length()-1;i>=0;i--) {
    		if(input.charAt(i)=='Z') {
    			last=i;
    			break;
    		}
    	}



    	int result=last-first+1;

    	System.out.println(result);

    	scanner.close();


    }

}