
import java.util.*;
import java.io.*;

import static java.lang.Character.isUpperCase;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String S = in.next();
        for (int i = 0; i<S.length(); i++ )
        {

            char ch = S.charAt(i);
            if(ch !='z')
            {  ch++;
                System.out.println(ch);
            }



        }






        }







    }














