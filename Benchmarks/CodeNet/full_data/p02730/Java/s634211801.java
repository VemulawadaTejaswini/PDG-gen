import java.util.*;
class Main
{
	public static void main(String[] args) 
    { 	Scanner s=new Scanner(System.in);
         String str = s.nextLine(); 
         StringBuilder input1 = new StringBuilder(); 
          StringBuilder input2 = new StringBuilder(); 
          input1.append(str);
          input2 = input1.reverse();
        
  
        if (input1.equals(input2)) 
            System.out.print("Yes"); 
        else
            System.out.print("No"); 
    } 
}
