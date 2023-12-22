
import java.io.*;

public class Main{
        public static void main(String[] args)throws IOException{
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                String line = br.readLine();
                String inf[] = line.split("/",0);
                if(inf[0].equals("2017")){
                        inf[0] = "2018";
                }   
                System.out.print(inf[0]+"/"+inf[1]+"/"+inf[2]);
                return;
        }   
}
