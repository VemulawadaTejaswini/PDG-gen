import java.util.*;
public class Main{

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		//以" "分割
		String[] str=s.split(" ");
		for(int i=0;i<str.length;i++) {
			char up=Character.toUpperCase(str[i].charAt(0));
			System.out.print(up);
		}
		System.out.println();

	}

}
