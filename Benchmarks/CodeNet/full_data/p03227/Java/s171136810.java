import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
      	String[] list = s.split("");
      	if(s.length()==3){
          System.out.println(list[2]+list[1]+list[0]);
        }else{
          System.out.println(s);
        }
	}
}