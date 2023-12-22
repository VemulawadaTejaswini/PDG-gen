import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){//double 处理果盘
		Scanner in = new Scanner(System.in);
		String str = in.next();
		boolean f = false;
		switch(str){
		case "Sunday":
			f = true;
			str = "Cloudy";
			break;
		case "Cloudy":
			f = true;
			str = "Rainy";
			break;
		case "Rainy":
			f = true;
			str = "Sunday";
			break;
			default:
		}
		if(f)
			System.out.println(str);
	}
}	