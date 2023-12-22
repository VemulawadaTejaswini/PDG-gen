import java.util.*;
public class Main{
  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(str.indexOf("1")!=-1&&str.indexOf("4")!=-1&&str.indexOf("7")!=-1&&str.indexOf("9")!=-1) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}


	}
}