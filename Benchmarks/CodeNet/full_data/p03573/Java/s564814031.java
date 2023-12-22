import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(" ");
                int a = Integer.parseInt(tokens[0]);
                int b = Integer.parseInt(tokens[1]);
                int c = Integer.parseInt(tokens[2]);
                if(a==b){
                    System.out.println(c);
                }else if(b==c){
                    System.out.println(a);
                }else if(a==c){
                    System.out.println(b);
                }
            }
        }
    }
}
