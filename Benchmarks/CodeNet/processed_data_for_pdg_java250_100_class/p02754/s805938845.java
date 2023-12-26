public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        long count = scanner.nextLong();
        long blue = scanner.nextLong();
        long red = scanner.nextLong();
        long balls = 0;
        long bcount = 0;
        if (count <= blue) {
            bcount = count;
        } else {
            long set = (long) (count / (blue + red));
            bcount = set * blue;
            balls = set * (blue + red);
            if (count - balls >= blue) {
                bcount += blue;
            } else {
                bcount += (count - balls);
            }
        }
        System.out.println(bcount);
    }
}
