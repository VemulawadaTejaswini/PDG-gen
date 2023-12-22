import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        //Scanner scanner = new Scanner(System.in);
        //String str = scanner.readLine();
        StringBuffer str = new StringBuffer(scanner.readLine());
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        Integer n = Integer.parseInt(scanner.readLine());
        boolean isR = false;
        for (int i = 0; i < n; i ++){
            String[] s1 = scanner.readLine().split(" ");
            if (s1[0].equals("1"))
                isR = !isR;
            else if (s1[0].equals("2")){
                if (s1[1].equals("1")){
                    if (isR)
                        str.append(s1[2]);
                    else
                        str.insert(0, s1[2]);
                }
                else if (s1[1].equals("2")){
                    if (isR)
                        str.insert(0, s1[2]);
                    else
                        str.append(s1[2]);
                }
            }
        }
        scanner.close();
        if (isR) out.println(new StringBuffer(str).reverse());
        else out.println(str);
        out.flush();
    }
}
