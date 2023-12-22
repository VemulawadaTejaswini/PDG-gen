import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int len = S.length();

        String temp1 = new StringBuilder(S).reverse().toString();
        String sub1 = S.substring(0,(len-1)/2);
        String temp2 = new StringBuffer(sub1).reverse().toString();
        String sub2 = S.substring(((len+3)/2)-1, len);
        String temp3 = new StringBuffer(sub2).reverse().toString();

        if(S.equals(temp1) && sub1.equals(temp2) && sub2.equals(temp3)) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}