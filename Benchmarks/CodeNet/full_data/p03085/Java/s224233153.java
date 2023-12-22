import java.io.PrintWriter;
import java.util.*;

public class Main{


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);

        char a=sc.next().charAt(0);
        if(a=='A')out.println('T');
        if(a=='T')out.println('A');
        if(a=='G')out.println('C');
        if(a=='C')out.println('G');

        out.close();
    }



}