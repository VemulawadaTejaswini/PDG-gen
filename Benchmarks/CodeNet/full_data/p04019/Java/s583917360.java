import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String next = sc.nextLine();
            int w=0,e=0,n=0,s=0;
            int i=1;
            for (char c : next.toCharArray()) {
                if (c == 'W')
                    w=1;
                else if (c == 'E')
                    e=1;
                else if (c == 'N')
                    n=1;
                else
                    s=1;
            }
            if ((w^e)==1 || (n^s)==1)
                System.out.println("No");
            else
                System.out.println("Yes");
        }
    }
}