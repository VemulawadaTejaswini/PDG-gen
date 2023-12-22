import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main{
  public static void main(String args[]) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String input = br.readLine();
      int ans=0;
      String f[]=input.split(" ");
      int a[]=new int[2];
      for(int i=0;i<2;i++){
        a[i]=Integer.parseInt(f[i]);
      }
      if(a[1]==0 || a[0]==0){
        ans=0;
      }
      if(a[0]%a[1]==0)
      {
        ans = a[1];
      }
      System.out.println(ans);
    }
}