public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] array = new Integer[3];
        array[0] = sc.nextInt();
        array[1] = sc.nextInt();
        array[2] = sc.nextInt();
        java.util.Arrays.sort(array);
        System.out.println(array[0] + " " + array[1] + " " + array[2]);
    }
}
