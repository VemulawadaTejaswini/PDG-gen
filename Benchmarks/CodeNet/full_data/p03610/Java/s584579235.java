import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    	Scanner scanner=new Scanner(System.in);

    	String input=scanner.next();

    	String[] data=input.split("");

    	StringBuilder sb =new StringBuilder();

    	int index=0;

    	while(true) {

    		if(index<=input.length()-1) {
    			sb.append(data[index]);
    			index+=2;
    		}else {
    			break;
    		}
    	}



    	String result=sb.toString();

    	System.out.println(result);

    	scanner.close();


    }

}