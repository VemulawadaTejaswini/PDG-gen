/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

	import java.util.*;
public class Main
{
	public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
  int x = sc.nextInt();
  int result =0;
  int div=0;
  if(x>500){
       div = x/500;
        result = div*2*500;
   
  }
  x = x-(div*500);
  result+= x;
while(x%5!=0){
    result = result-x%5;
   break;
     
}
    System.out.println(result);
  }
  
}