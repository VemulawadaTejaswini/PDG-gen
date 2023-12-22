import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{

public static void main(String[] args) throws FileNotFoundException, IOException{
       Scanner s=new Scanner(System.in);
       BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=s.nextInt();
      // Stack<Integer>stk=new Stack<>();
       int res=-1,j=1;
       for(int i=0;i<n;i++){
       	int x=s.nextInt();
       	if(x==j){j++;}
       }
       if(j!=1) res=n-(j-1);
        out.write(res+"\n");
        out.flush();
  }
}
