import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String strSplit[] = br.readLine().split("/");
            StringBuffer sb = new StringBuffer();
            sb.append("2018/").append(strSplit[1]).append("/").append(strSplit[2]);
            
            System.out.println(sb);
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}