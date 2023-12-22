import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] str = s.split("/");
		if(Integer.parseInt(str[0])>=2019 && Integer.parseInt(str[1])>4) {
			System.out.println("TBD");
		}else {
			System.out.println("Heisei");
		}
	}
}