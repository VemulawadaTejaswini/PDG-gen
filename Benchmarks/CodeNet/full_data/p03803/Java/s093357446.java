import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if(a==b)
            System.out.println("Draw");
        else{
            if (a==1)
                System.out.println("Alice");
            else if (b==1)
                System.out.println("Bob");
            else if(a>b)
                System.out.println("Alice");
            else
                System.out.println("Bob");

        }
    }


}
