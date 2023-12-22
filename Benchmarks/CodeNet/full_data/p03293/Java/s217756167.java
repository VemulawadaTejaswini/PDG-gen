import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str1=scan.next(),str2=scan.next();
		str1+=str1;
		if (str1.contains(str2))
        {
            System.out.println("Yes");
        }
		else {
			System.out.println("No");
		}
		}
}