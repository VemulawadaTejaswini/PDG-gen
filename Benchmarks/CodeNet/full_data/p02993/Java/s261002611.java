import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] c = s.toCharArray();
        boolean f = false;
        for(int i = 0; i < 3; i++){
            if(c[i+1] == c[i]){
                f =true;
            }
        }

        if(f){
            System.out.println("Bad");
        } else {
            System.out.println("Good");
        }
    }
}