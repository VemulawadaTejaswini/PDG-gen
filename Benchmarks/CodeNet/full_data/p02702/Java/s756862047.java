import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // input
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = 0;
        for(int i=0; i<s.length()-3; i++) {
            for(int j=i+2; j<=s.length(); j++) {
                double sum = 0;
                for(int k=i; k<j; k++) {
                    sum+= Integer.parseInt(String.valueOf(s.charAt(k)));
                }
                if (sum % 3 != 0) continue;
                if (Double.parseDouble(s.substring(i,j)) % 2019 == 0) ans++;
            }
        }
        System.out.println(ans);
    }
}
