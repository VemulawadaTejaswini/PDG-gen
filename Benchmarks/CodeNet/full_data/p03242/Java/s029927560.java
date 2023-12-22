
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] c = sc.next().toCharArray();
        StringBuilder s = new StringBuilder();
        for (char cc:c){
            if(cc == '1') s.append(9);
            else s.append(1);
        }
        System.out.println(s);
    }


}



