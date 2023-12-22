import java.io.*;
public class Coins
{
  public static void main(String args[])throws Exception
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int x=Integer.parseInt(br.readLine());
    int r=x/500;
    int d=x%500;
    int re=d/5;
    int tot=r*1000+re*5;
    System.out.println(tot);
  }
}
    