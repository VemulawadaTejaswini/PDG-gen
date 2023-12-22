import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < S.length(); i++) {
            String temp = S.substring(i);
            if (i % 2 == 0) {
                if (temp.equals("0")) {
                    count1++;
                } else {
                    count2++;
                }
            } else {
                if (temp.equals("0")) {
                    count2++;
                } else {
                    count1++;
                }
            }
        }
        int result = count1 > count2 ? count2 : count1;
        System.out.println(result);
    }
}