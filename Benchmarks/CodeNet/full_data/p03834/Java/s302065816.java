import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		String[] list = s.split("");
      	list[5] = " ";
      	list[13] = " ";
      	for(int i=0; i<s.length(); i++) System.out.print(list[i]);
	}
}