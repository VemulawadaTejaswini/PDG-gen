import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader ( 
            new InputStreamReader( System.in));

        int a = Integer.parseInt( br.readLine());
        int b = Integer.parseInt( br.readLine());

        String juge = ( (a * b) % 2 == 0 ) ? "Even" : "Odd"; 
        System.out.println( juge );
    }
}