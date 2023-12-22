import java.util.Scanner;
class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String s=sc.next();
		String sa[]=s.split("/");
		if(Integer.parseInt(sa[0])<=2019&&Integer.parseInt(sa[1])<=4&&Integer.parseInt(sa[2])<=30)
			System.out.println("Heisei");
		else
			System.out.println("TBD");
		}
		}




