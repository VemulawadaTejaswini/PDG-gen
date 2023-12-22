import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int march[] = new int[5];
//        int m = 0;
//        int a = 0;
//        int r = 0;
//        int c = 0;
//        int h = 0;
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            char ch = str.charAt(0);
            switch(ch) {
            case 'M' :
//                m++;
                march[0]++;
                break;
            case 'A' :
//                a++;
                march[1]++;
                break;
            case 'R' :
//                r++;
                march[2]++;
                break;
            case 'C' :
//                c++;
                march[3]++;
                break;
            case 'H' :
//                h++;
                march[4]++;
                break;
            }
        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println(march[i]);
//        }
//
//        System.out.println("---------------------------------");

        long ans = 0;

        for (int i = 0; i <= 2; i++) {
            for (int j = i+1; j <=3 ; j++) {
                for (int k = j+1; k <=4 ; k++) {
                    ans += count(march[i], march[j], march[k]);
//                    System.out.println(i + "/"+ j + "/" + k + ":" + count(march[i], march[j], march[k]));
                }
            }
        }

        System.out.println(ans);
        sc.close();
    }

    static int count(int a, int b, int c) {
        return a * b * c;
    }

}
