import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        inp.nextInt();inp.nextInt();inp.nextInt();
        int e = inp.nextInt();
        int k = inp.nextInt();
        if (e - a <= k) System.out.println("Yay!");
        else System.out.println(":(");
        inp.close();
    }
}
