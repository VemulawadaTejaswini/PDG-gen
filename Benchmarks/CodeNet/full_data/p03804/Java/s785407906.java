import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String args[]) {
        BufferedReader br = null;
 
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            String[] tmp = line.split(" ");
            int n = Integer.parseInt(tmp[0]);
            int m = Integer.parseInt(tmp[1]);
 
            String[] imageN = new String[n];
            for (int i = 0; i < n; i++) {
                line = br.readLine();
                imageN[i] = line;
            }
 
            String[] imageM = new String[m];
            for (int i = 0; i < m; i++) {
                line = br.readLine();
                imageM[i] = line;
            }
 
            //image n
            for (int i = 0; i <= n - m; i++) {
                int index = imageN[i].indexOf(imageM[0]);
                
                if (index >= 0) {
                    boolean found = true;
                    //image m
                    for (int j = 1; j < m; j++) {
                        if (imageN[i + j].indexOf(imageM[j]) != index) {
                            found = false;
                            break;
                        }
                    }
                    if (found) {
                        System.out.println("Yes");
                        return;
                    }
                }
            }
            System.out.println("No");
        } catch (Exception ex) {
            System.out.println("wrong input");
        }
    }
}