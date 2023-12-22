import java.util.Scanner;
public class Main {

  
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String data = sc.next();
        char C=data.charAt(0);
        int asc=(int)C;
        //System.out.println(asc);
        asc++;
        char D=(char)asc;
        System.out.println(D);
    }
}
