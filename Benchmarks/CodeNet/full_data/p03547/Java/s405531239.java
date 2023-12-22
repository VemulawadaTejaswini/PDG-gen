import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String a,b;

        a = sc.next();
        b = sc.next();
        int a2,b2;
        if(a=="A") a2 = 10;
        else if(a=="B") a2 =11;
        else if(a=="C") a2 = 12;
        else if(a=="D") a2=13;
        else if(a=="E") a2=14;
        else a2 =15;
        if(b=="A") b2 = 10;
        else if(b=="B") b2 =11;
        else if(b=="C") b2 = 12;
        else if(b=="D") b2=13;
        else if(b=="E") b2=14;
        else b2 =15;

        if(a2>b2) System.out.println(">");
        else if(a2<b2) System.out.println("<");
        else System.out.println("=");
    }
}