import java.io.*;
class color
{
  public static void main(String [] args) throws IOException
  {
    InputStreamReader ir=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(ir);
    int n=Integer.parseInt(br.readLine());
    String s=br.readLine();
    if(n <= 3200)
    {
      System.out.println(s);
    }
    else
    {
      System.out.println("red");
    }
  }
}