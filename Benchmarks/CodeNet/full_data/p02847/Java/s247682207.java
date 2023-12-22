import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	int output = 0;
	if(str.equals("SUN")){
	    output = 7;
    }else if(str.equals("MON")){
	    output = 6;
    }else if(str.equals("TUE")){
        output = 5;
    }else if(str.equals("WED")){
        output = 4;
    }else if(str.equals("THU")){
        output = 3;
    }else if(str.equals("FRI")){
        output = 2;
    }else if(str.equals("SAT")){
        output = 1;
    }
	System.out.println(output);
    }
}
