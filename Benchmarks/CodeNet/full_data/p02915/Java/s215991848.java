import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main{
  public static void main(String[] args){
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(br.readLine());
    System.out.println(n*n*n);
  }
}
