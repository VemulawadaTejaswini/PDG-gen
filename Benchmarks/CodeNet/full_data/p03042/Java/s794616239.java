import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int S = sc.nextInt();
	int s34 = S%100;
	int s12 = S/100;

	if((1<=s12 && s12<=12) && (1<=s34 && s34<=12)){
	    System.out.print("AMBIGUOUS");
	}else if(1<=s12 && s12<=12){
	    System.out.print("MMYY");
	}else if(1<=s34 && s34<=12){
	    System.out.print("YYMM");
	}else if((s12==0 && s34>12)||(s12>12 && s34==0)){
	    System.out.print("NA");
	}
    }
}
