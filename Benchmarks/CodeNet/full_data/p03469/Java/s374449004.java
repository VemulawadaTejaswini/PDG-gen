import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String strSplit[] = br.readLine().split("/");
            strSplit[0] = "2018";
            
            System.out.println(strSplit[0] + "/" + strSplit[1] + "/" + strSplit[2]);
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}