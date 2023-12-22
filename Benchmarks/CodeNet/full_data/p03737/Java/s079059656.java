import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		String s1 = scn.next();
      	s1 = s1.toUpperCase();
		String[] list1 = s1.split("");
      	String s2 = scn.next();
      	s2 = s2.toUpperCase();
		String[] list2 = s2.split("");
      	String s3 = scn.next();
      	s3 = s3.toUpperCase();
		String[] list3 = s3.split("");
      	System.out.println(list1[0]+list2[0]+list3[0]);
	}
}