import java.util.Scanner;

class Main
{
	public static void main(String args[])
    {
         Scanner scan = new Scanner(System.in);
         int r = scan.nextInt();
         
         unit_square = circle_square(1);
         square = circle_square(r);
      	 System.out.println(square/unit_square);
    }
    public circle_square(int r)
    {
    	return r*r*Math.PI;
    }
}