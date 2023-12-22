import java.util.*;
class Main{
	public static void main(String []args){
      Scanner in = new  Scanner(System.in);
      String n = in.nextLine(); boolean pos = true;
      for(int i = 0 ; i < n.length()-2 ; i++)
        if(!(n.substring(i,i+2).equalsIgnoreCase("hi")))
          pos = false;
 	  System.out.println((pos)?"Yes":"No");
    }
}