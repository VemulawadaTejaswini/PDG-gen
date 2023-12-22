import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        String s = br.readLine();
        String[] sarr = s.split(" ");
        Long a = Long.parseLong(sarr[0]);
        Character op = sarr[1].charAt(0);
        Long b = Long.parseLong(sarr[2]);
        if(op=='+')
            System.out.println(a+b);
        else
            System.out.println(a-b);

    }

}
