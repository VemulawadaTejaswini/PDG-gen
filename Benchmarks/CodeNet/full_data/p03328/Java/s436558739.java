public class Main {
    public static void main(String[] args) {
        int hoge = Integer.parseInt(args[0]);
        int hoga = Integer.parseInt(args[1]);
        int tower[] = new int[1000];
        int k = 0;
        for (int i = 1; i <= 999; i++) {
            k = k + i;
            tower[i] = k;
        }
        if (hoga - hoge == tower[hoga - hoge] - tower[hoga - hoge - 1]) {
            System.out.println(tower[hoga - hoge -1] - hoge);
        }
    }
}