import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int maxL = 0;
        int start;

        for (int i = 0; i < s.length(); i++) {
            
            int L = 0;

            if (s.charAt(i) == 'A') {
                start = i;
            }
            
            if (s.charAt(i) == 'Z') {
                L = i - start;
            }
            
            if (L >= maxL) {
                maxL = L;
            }

        }
        
        System.out.println(maxL);


    }


}