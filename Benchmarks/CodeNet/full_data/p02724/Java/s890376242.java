/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int x=0;
    
    for(int i=500;i<=n;i+=500)
        {
          x+=1000;
        }
        n=n%500;
        if(n!=0)
        {
          for(int i=5;i<=n;i=i+5)
          {
            x=x+5;
          }
        }
        System.out.println(x);
        }
        }
        
