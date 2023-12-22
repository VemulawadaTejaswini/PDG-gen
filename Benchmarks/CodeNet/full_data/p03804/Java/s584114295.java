import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String st = br.readLine();
            String[] s = st.split(" ",0);
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int c = n - m +1;
            String[] A = new String[n];
            String[] B = new String[m];
            for(int i = 0; i<n;i++){
                A[i]=br.readLine();
            }
            for(int i = 0; i<m;i++){
                B[i]=br.readLine();
            }
            int not = 0;
            for(int i = 0;i<c;i++){
                int match = 0;
                for(int j = 0;j<m;j++){
                    String strn = A[i/m+j].substring(i%c,i%c+m);
                    String strm = B[j];
                    if(strn.equals(strm)){
                    }else{
                        break;
                    }
                    match++;
                }
                if(match==m){
                    System.out.println("Yes");
                    not++;
                    break;
                }
            }
            if(not==0){
                System.out.println("No");
            }
        }catch(Exception ex){
            System.exit(0);
        }
    }
}