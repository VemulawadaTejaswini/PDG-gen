import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();

        if(ch[2]==ch[3] && ch[4]==ch[5])
        	System.out.println("Yes");
        else
        	System.out.println("No");
      
        sc.close();
    }

}
