import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main
{
  
  public static void main(String[] args) throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int N=Integer.parseInt(br.readLine());
    int ans=0;
    if(N<100){
      ans=Math.min(N,9);
    }else if (N<10000){
      ans=9+Math.min(N-99,900);
    }else{
      ans=9+900+Math.min(N-9999,90000);
    }
    System.out.println(ans);
  }
}



