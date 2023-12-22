import java.util.*;
class Main{
	public static void main(String[]args){
      Scanner in = new Scanner(System.in);
      int x = in.nextInt(), y = in.nextInt(), z=0;
      if(x<10)
        z = y - (100*(10-x));
      else 
        z = y;
      System.out.println(z);
    }
}