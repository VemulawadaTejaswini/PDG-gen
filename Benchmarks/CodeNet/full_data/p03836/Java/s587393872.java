public class Main {
    public static void main(String[] args) {
        int sx, sy, tx, ty;

        Scanner s = new Scanner(System.in);
        sx = s.nextInt();
        sy = s.nextInt();
        tx = s.nextInt();
        ty = s.nextInt();

        int i;
        for (i = 0; i < ty - sy; i++) {
            System.out.print("U");
        }
        for (i = 0; i < tx - sx; i++) {
            System.out.print("R");
        }
        for (i = 0; i < ty - sy; i++) {
            System.out.print("D");
        }
        for (i = 0; i < tx - sx; i++) {
            System.out.print("L");
        }
        System.out.print("L");
        for (i = 0; i <= ty - sy; i++) {
            System.out.print("U");
        }
        for (i = 0; i <= tx - sx; i++) {
            System.out.print("R");
        }
        System.out.print("DR");
        for (i = 0; i <= ty - sy; i++) {
            System.out.print("D");
        }
        for (i = 0; i <= tx - sx; i++) {
            System.out.print("L");
        }
        System.out.print("U");
    }

}