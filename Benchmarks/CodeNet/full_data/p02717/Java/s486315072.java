import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
    {
     	 Scanner sc = new Scanner(System.in);
      	
     	String[] sep = sc.nextLine().split(" ");
      	System.out.println(sep[2] + " " + sep[0] + " " + sep[1]);
    }
}