import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	String s = scan.next();

	String yy = s.substring(0,4);
	String mm = s.substring(5,7);
	String dd = s.substring(8,10);

	int year = Integer.parseInt(yy);
	if(year < 2019){
	    System.out.println("Heisei");
	}else if(year == 2019){
	    if(mm.equals("01") || mm.equals("02") ||
	       mm.equals("03") || mm.equals("04")){
		System.out.println("Heisei");
	    }else{
		System.out.println("TBD");
	    }
	}else{
	    System.out.println("TBD");
	}

    }
}
