public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int[] arr = {a, b, c};
        Arrays.sort(arr);
        System.out.println(String.format("%1$s %2$s %3$s", arr[0], arr[1], arr[2]));
    }
}
