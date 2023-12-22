import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        String n = inp.next();
        inp.close();
        if (n.contains("111")) System.out.println("Yes");
        else if (n.contains("222")) System.out.println("Yes");
        else if (n.contains("333")) System.out.println("Yes");
        else if (n.contains("444")) System.out.println("Yes");
        else if (n.contains("555")) System.out.println("Yes");
        else if (n.contains("666")) System.out.println("Yes");
        else if (n.contains("777")) System.out.println("Yes");
        else if (n.contains("888")) System.out.println("Yes");
        else if (n.contains("999")) System.out.println("Yes");
        else System.out.println("No");
    }
}