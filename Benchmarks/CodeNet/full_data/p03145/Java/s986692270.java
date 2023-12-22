import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        int abc[] = {a, b, c};
        Arrays.sort(abc);
        System.out.println(abc[0] * abc[1] / 2);
        inp.close();
    }
}
