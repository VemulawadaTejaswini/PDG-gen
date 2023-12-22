import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        int abc[] = {a, b, c};
        Arrays.sort(abc);
        String ab = abc[2] + "" + abc[1];
        int cc = abc[0];
        System.out.println(Integer.parseInt(ab) + cc);
        inp.close();
    }
}
