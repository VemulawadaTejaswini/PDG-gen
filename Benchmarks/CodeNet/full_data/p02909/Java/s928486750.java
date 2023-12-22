import java.util.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        String ret = "";
        if (s.equals("Sunny")) {
            ret = "Cloudy";
        } else if (s.equals("Cloudy")) {
            ret = "Rainy";
        } else {
            ret = "Sunny";
        }
        System.out.println(ret);
    }
}
