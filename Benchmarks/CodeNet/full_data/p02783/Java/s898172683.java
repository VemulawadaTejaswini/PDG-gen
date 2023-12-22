
import java.util.*;
import java.io.*;

import static java.lang.Character.isUpperCase;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        int A = in.nextInt();
        if(H%A==0)
        {
            System.out.println(H/A);
        }
        else
            {
                System.out.println(H/A+1);
            }


    }


 }










