import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] s = sc.next().split("");
        ArrayList<String> list = new ArrayList<String>();

        for (int i=0; i<n-2; i++) {
            String[] str = {s[i], "", ""};
            for (int j=i+1; j<n-1; j++) {
                str[1] = s[j];
                for (int k=j+1; k<n; k++) {
                    str[2] = s[k];
                    if (!list.contains(String.join("", str))) list.add(String.join("", str));
                }
            }
        }

        System.out.println(list.toArray().length);
    }
}