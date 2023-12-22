
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String buffer[] = new String[3];
        for (int ct = 0; ct < 3; ct++) {
            buffer[ct] = br.readLine();
        }
        System.out.println(buffer[0].charAt(0) +""+ buffer[1].charAt(1) +""+ buffer[2].charAt(2));
    }
    
}
