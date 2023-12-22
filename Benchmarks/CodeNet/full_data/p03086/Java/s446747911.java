import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ar = sc.nextLine();

        int cnt = 0;

        for(int i = 0 ; i < 10 ; i++) {

            for(int j = i ; j <= 10 ; j++) {
                String str =ar.substring(i, j);
                if(str.matches("([ATCG])+")) {
                    if(cnt<str.length()) {
                        cnt = str.length();
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}
