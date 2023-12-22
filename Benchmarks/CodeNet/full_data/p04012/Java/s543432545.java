import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        sc.close();

        int count = 0;
        String ans = "Yes";

        for(int i = 0; i < w.length(); i++){
            for(int j = 0; j < w.length(); j++){
                if(w.charAt(i) == w.charAt(j)){
                    count++;
                }
            }
            if(count % 2 == 1) {
                ans = "No";
            }
        }
        System.out.println(ans);
    }
}