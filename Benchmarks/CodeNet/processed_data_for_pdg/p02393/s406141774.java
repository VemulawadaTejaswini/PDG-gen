public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int[] array = {a, b, c};
        Arrays.sort(array);
        System.out.println(array[0] + " " + array[1] + " " + array[2]);
    }
}
