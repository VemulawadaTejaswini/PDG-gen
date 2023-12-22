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
   String s = sc.next();
  
   if( s.charAt(2)==s.charAt(3)&&s.charAt(4) == s.charAt(5)){
       System.out.println("Yes");
   }else{
     System.out.println("No");}
}}
