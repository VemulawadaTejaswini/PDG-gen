import java.util.Scanner;

public class triple {
public static void main(String args[])
{
  Scanner s=new Scanner(System.in);
  String n=s.nextLine();
  String[] num=n.split(" ");
  int[] u=new int[num.length];
  for(int i=0;i<num.length;i++)
  {
    u[i]=Integer.parseInt(num[i]);
  } 
  int flag=0;
  for(int i=0;i<u.length;i++)
  {
    for(int j=i+1;j<u.length;j++)
    {
      if(u[i]==u[j])
      {
        flag++;
      }
    }
    break;
  }
  if(flag==1)
  {
    System.out.println("YES");
  }
  else
  {
    System.out.println("NO");
  }
}
}
