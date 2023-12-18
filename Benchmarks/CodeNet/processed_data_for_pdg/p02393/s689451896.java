public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[]{a,b,c};
        Arrays.sort(arr);
        System.out.printf("%d %d %d\n",arr[0],arr[1],arr[2]);
        sc.close();
    }
}
