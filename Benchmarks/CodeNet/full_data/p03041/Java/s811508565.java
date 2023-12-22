import java.io.*;
public class Main
{
    public static void main(String []args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String []tokens = line.split(" ");
        int n = Integer.parseInt(tokens[0]);
        int K = Integer.parseInt(tokens[1]);
        String S=br.readLine();
        int p=S.charAt(K-1);
        char x=(char)(p+32);
System.out.print(S.substring(0,(K-1))+x+S.substring(K));
}
}
