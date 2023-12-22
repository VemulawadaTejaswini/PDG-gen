import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{

public static void main(String[] args) throws FileNotFoundException, IOException{
       Scanner s=new Scanner(System.in);
       BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=s.nextInt();s.nextLine();
        String[] arr=s.nextLine().split(" ");
        for(int i=0;i<n;i++){
        	out.write(arr[0].charAt(i)+""+arr[1].charAt(i));
        }
       
        out.write("\n");
        out.flush();
  }
}
