import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String strSplit[] = br.readLine().split(" ");
            long a = Integer.parseInt(strSplit[0]);
            long b = Integer.parseInt(strSplit[1]);
            long c = Integer.parseInt(strSplit[2]);
            
            if(c-a-b > 0 && 4*a*b < (c-a-b)*(c-a-b)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}