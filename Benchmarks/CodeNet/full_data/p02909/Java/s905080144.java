import java.util.*;
public class Main{
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  String s = sc.nextLine();
	  String t;
	  if(s.equals("Sunny"))t="Cloudy";
	  else if(s.equals("Cloudy"))t="Rainy";
	  else t="Sunny";
	  System.out.println(t);
	}
}