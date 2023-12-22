import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str[] = {"SUN","7","MON","6","TUE","5","WED","4",
                "THU","3","FRI","2","SAT","1"};
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(s)){
                System.out.println(str[i+1]);
            }
        }
    }
}
