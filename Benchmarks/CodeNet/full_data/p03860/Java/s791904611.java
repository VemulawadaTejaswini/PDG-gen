import java.io.*;

public class AtCodersContest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        String s = br.readLine();
        String s1 = s.toLowerCase();
        String s2 = s1.substring(0,1).toUpperCase() + s1.substring(1);
      
       
        System.out.println("A"+s2.charAt(0)+"C");
        
    }
}
