public class game
{
  void main(String args[])
  {
    InputStreamReader r=new InputStreamReader(System.in);    
    BufferedReader in=new BufferedReader(r);
    int n=Integer.parserInt(in.readLine);
    int t=Integer.parserInt(in.readLine);
    int t=(int)(Math.ceil(n/t));
    System.out.println(t);
  }
}