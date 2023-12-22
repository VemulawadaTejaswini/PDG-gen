import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){//double 处理果盘
		Scanner in = new Scanner(System.in);
		String str = in.next();
		switch(str){
		case "Sunday":
			str = "Cloudy";
			break;
		case "Cloudy":
			str = "Rainy";
			break;
		case "Rainy":
			str = "Sunday";
			break;
		}
		System.out.println(str);
	}
}	