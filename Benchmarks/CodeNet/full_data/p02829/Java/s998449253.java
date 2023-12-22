import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{

public static void main(String[] args) throws FileNotFoundException, IOException{
       Scanner s=new Scanner(System.in);
       BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=s.nextInt(),b=s.nextInt();

        out.write(6-n-b+"\n");
        out.flush();
  }
}
