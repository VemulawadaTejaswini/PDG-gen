import java.io.*;

public class Main {

    static final int N = 10000;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        int left=0;
        int right=str.length()-1;
        while(str.charAt(left)!='A'){ left++; }
        while(str.charAt(right)!='Z'){ right--; }
        System.out.println(right-left+1);
    }
    
}
