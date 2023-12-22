import java.util.Scanner;
class Restaurant {
    int number;
    String city;
    int point;
    Restaurant(int n, String s, int p) {
        this.number = n;
        this.city = s;
        this.point = p;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Restaurant[] res = new Restaurant[n];
        for (int i = 0; i < n; i++) {
            res[i] = new Restaurant(i + 1, sc.next(), sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (res[j].point < res[j + 1].point) {
                    Restaurant memo = res[j];
                    res[j] = res[j + 1];
                    res[j + 1] = memo;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (res[j].city.compareTo(res[j + 1].city) > 0) {
                    Restaurant memo = res[j];
                    res[j] = res[j + 1];
                    res[j + 1] = memo;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(res[i].number);
        }
        sc.close();
    }
}