import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader vd = new BufferedReader(new InputStreamReader(System.in));
		String[] s = vd.readLine().split("");
    	int sum=0;
  	  for(int i=0;i<4;++i){
 	     if(s[i]=="+")sum=sum+1;
 	     if(s[i]=="=")sum=sum-1;
  	  }
    System.out.println(sum);
 
  }
}