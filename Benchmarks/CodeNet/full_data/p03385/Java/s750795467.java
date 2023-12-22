import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextInt();
        String s2 = s+s;
        System.out.println(s2.contains(s)?"Yes":"No");
    }
}