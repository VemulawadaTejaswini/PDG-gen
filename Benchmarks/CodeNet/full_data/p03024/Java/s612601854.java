import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int o = 0;
        int x = 0;
        int k = str.length();
        for (int i=0 ; i<k ; i++){
            if (str.charAt(i) == 'o')
                o++;
            else if (str.charAt(i) == 'x')
                x++;
        }

        if (15-k == 8-x)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
