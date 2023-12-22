import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final long S = Long.parseLong(sc.next());
        sc.close();

        for (int x1 = (int)Math.sqrt(S) + 1; x1>=0; x1--) {
            for (int y1 = (int)Math.sqrt(S) + 1; y1>=0; y1--) {
                for (int x2 = (int)Math.sqrt(S) + 1; x2>=0; x2--) {
                    for (int y2 = (int)Math.sqrt(S) + 1; y2>=0; y2--) {
                        if (x1>x2 & y1>y2) {
                            break;
                        } else {
                            if (S==(2*x1*y2-x1*y1-x2*y2-Math.abs((double)(x1-x2)*(y1-y2)))) {
                                System.out.println("0 0 " + x1 + " " + y1 + " " + x2 + " " + y2 + " ");
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
}