import java.util.Scanner;

public class ProblemA {
	
	public static void main(String[] args) {
		StringBuilder sb;
		
        Scanner sc = new Scanner(System.in);
        sb = new StringBuilder(sc.nextLine());
        sc.close();
      	String pattern = "ST";
      	
      	int patternIndex;
      	do{
        	patternIndex = sb.indexOf(pattern);
        	if(patternIndex >= 0) {
        		sb.delete(patternIndex, patternIndex+2);
        	}	
      	}
      	while(patternIndex >= 0);
      	
        System.out.println(sb.length());
	}
}