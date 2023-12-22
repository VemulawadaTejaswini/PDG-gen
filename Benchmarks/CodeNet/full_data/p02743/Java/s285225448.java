import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String strSplit[] = br.readLine().split(" ");
            int a = Integer.parseInt(strSplit[0]);
            int b = Integer.parseInt(strSplit[1]);
            int c = Integer.parseInt(strSplit[2]);
            
            if(Math.sqrt(a) + Math.sqrt(b) < Math.sqrt(c)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}