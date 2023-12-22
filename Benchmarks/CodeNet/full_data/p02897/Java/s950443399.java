import java.util.Scanner;
import java.util.*;
public class Solution
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n,temp;
    n=sc.nextInt();
    if(n%2!=0)
    temp=n+1;
    else 
    temp=n;
    double poss=temp/2;
    poss/=n;
    System.out.printf("%.10f",poss);
  }
}