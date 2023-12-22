import java.util.*;
class a
{
  public static void main(String args[])
  {
    int i,j;
     Scanner myObj = new Scanner(System.in);
    i = myObj.nextInt();
    j = myObj.nextInt();
    if(i>=10)
      System.out.println(i);
    else
    {
      System.out.println(j+(100*(10-i)));
    }
  }
}
    
