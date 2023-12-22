import java.io.*;

public class Main {
    public static void main(String[] args){

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{
            String str = reader.readLine();
            StringBuilder sb = new StringBuilder(str);

            for(int i = 0; i < Math.pow(10,10000) ;i++){
            int index = sb.indexOf("ST");
            if(index == -1)
                break;
            sb.delete(index,index+2);
            }

            System.out.println( sb.length() );

        }catch (IOException e){
            System.out.println(e);
        }
    }
}

