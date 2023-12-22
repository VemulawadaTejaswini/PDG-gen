import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        ArrayList<Apple> apples = new ArrayList<>(a + b + c);

        for (int i = 0; i < a; i++) {
            if(i < x) {
                apples.add(new Apple(sc.nextLong(), Apple.RED));
            }else{
                sc.nextLong();
            }
        }
        for (int i = 0; i < b; i++) {
            if(i < y) {
                apples.add(new Apple(sc.nextLong(), Apple.BLUE));
            }else{
                sc.nextLong();
            }
        }
        for (int i = 0; i < c; i++) {
            apples.add(new Apple(sc.nextLong(), Apple.NONE));
        }

        Collections.sort(apples, (ap1, ap2) -> {
            return -Long.compare(ap1.tasty, ap2.tasty);
        });

        long totalTasty = 0;

        for (int i = 0 ; i < x+y ; i++) {
            totalTasty += apples.get(i).tasty;
        }

        System.out.println(totalTasty);
    }
}

class Apple {
    static final int RED = 0;
    static final int BLUE = 1;
    static final int NONE = 2;

    public long tasty;
    public int color;

    Apple(long tasty, int color) {
        this.tasty = tasty;
        this.color = color;
    }
}
