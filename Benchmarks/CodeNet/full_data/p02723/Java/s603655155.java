import java.util.Map;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String N = scan.next();
        String M[]=new String [6];

        for(int i=0;i<6;i++)
        { M[i]=N.substring(i,i);}
        if(M[3].equals(M[4])&&M[5].equals(M[6])){System.out.println("Yes");}
       else{System.out.println("No");}