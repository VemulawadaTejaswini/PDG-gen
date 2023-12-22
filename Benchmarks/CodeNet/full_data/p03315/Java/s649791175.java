import java.io.*;

class Main{

    public static void main (String[] args) throws IOException{
        InputStreamReader is = new InputStreamReader(System.in);       
        BufferedReader br = new BufferedReader(is);                    

        System.out.println("何か入力してください.");

        String str = br.readLine();                                    

        System.out.println(str + "が入力されました.");
    }
}