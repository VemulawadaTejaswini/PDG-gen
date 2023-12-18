public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] data = new int[3];
        data[0] = sc.nextInt();
        data[1] = sc.nextInt();
        data[2] = sc.nextInt();
        int n = 0;
        if (data[0] > data[1]) {
            n = data[0];
            data[0] = data[1];
            data[1] = n;
        }
        if (data[0] > data[2]) {
            n = data[0];
            data[0] = data[2];
            data[2] = n;
        }
        if (data[1] > data[2]) {
            n = data[1];
            data[1] = data[2];
            data[2] = n;
        }
        System.out.println(data[0] + " " + data[1] + " " + data[2]);
        sc.close();
    }
}
