import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
  public static void main(String [] args)throws Exception{

    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    String [] inp = br.readLine().split(" ");
    int a = Integer.parseInt(inp[0]);
	int b = Integer.parseInt(inp[1]);
	int c = Integer.parseInt(inp[2]);
    if(a<5||a>7||b<5||b>7||c<5||c>7){
      System.out.println("NO");
    }else if((a+b+c)==17){
      if(a!=6 &&b!=6 && c!=6){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
    }
  	else{
      System.out.println("NO");
    }

    
  }
}