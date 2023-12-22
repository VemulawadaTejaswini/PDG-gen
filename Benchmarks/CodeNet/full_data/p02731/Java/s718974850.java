import java.util.Scanner;
public class Main
{
 	public static void main(String[] args)
    {
     	Scanner sc = new Scanner(System.in);
      	int sep = Integer.parseInt(sc.nextLine());
      	double result = sep * sep * sep / 27;
      	System.out.println(result);
    }
  
}