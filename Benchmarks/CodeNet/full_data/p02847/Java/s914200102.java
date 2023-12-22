import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
			    Scanner sc = new Scanner(System.in);
			    String s = sc.next();
			    List<String> week = Arrays.asList("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT");
			    System.out.println(7 - week.indexOf(s));
			    sc.close();
			  }

			}
