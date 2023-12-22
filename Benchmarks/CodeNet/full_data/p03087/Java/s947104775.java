import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str=new String(in.readLine());
      String[] temp=str.split(" ");
      int N=Integer.parseInt(temp[0]);
      int M=Integer.parseInt(temp[1]);
      str=new String(in.readLine());
      for(int i=0;i<M;i++){
        String[] inp=new String(in.readLine()).split(" ");
        int start=Integer.parseInt(inp[0]);
        int finish=Integer.parseInt(inp[1]);
        String cut=str.substring(start-1,finish);
        System.out.println(cut);
        int count=0;
        for(int j=0;j<cut.length()-1;j++){
        	if(cut.charAt(j)=='A'&&cut.charAt(j+1)=='C')count++;
        }
        System.out.println(count);
      }
    }
}