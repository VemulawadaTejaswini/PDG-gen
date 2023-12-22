import java.io.*;
class Sample{
    public static void main(String args[])throws IOException{
    	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      			teihen = Integer.parseInt(br.readLine());
     			takasa = Integer.parseInt(br.readLine());
      			naname = Integer.parseInt(br.readLine());
      
       System.out.println((teihen*takasa)/2);
    }
}
