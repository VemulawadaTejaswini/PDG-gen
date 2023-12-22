import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        if(s1.length()>s2.length()) {
            System.out.println("GREATER");
            return;
        }

        if(s1.length()<s2.length()) {
            System.out.println("LESS");
            return;
        }


        if(s1.compareTo(s2)>0) {
            System.out.println("GREATER");
        }
        else if(s1.compareTo(s2)<0){
            System.out.println("LESS");
        }else {
            System.out.println("EQUAL");
        }
    }
}