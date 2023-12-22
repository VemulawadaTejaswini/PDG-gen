import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] str_list = new String[n];

        String temp = sc.nextLine();

        for (int i = 0; i < n; i++) {
            str_list[i] = sc.nextLine();
            if (i != 0) {
                for (int j = 0; j < i - 1; j++) {

                    if (str_list[i].equals(str_list[j])) {
                        System.out.println("No");
                        return;
                    }

                }

                if(str_list[i].charAt(0) != str_list[i-1].charAt(str_list[i-1].length()-1)){
                    System.out.println("No");
                    return;
                }
            }
        }

        System.out.println("Yes");

    }
}