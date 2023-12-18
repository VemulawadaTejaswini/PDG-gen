public class Main {
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] sort = new int[3];
        sort[0] = sc.nextInt();
        sort[1] = sc.nextInt();
        sort[2] = sc.nextInt();
        Arrays.sort(sort);
        System.out.println(sort[0] + " " + sort[1] + " " + sort[2]);
        sc.close();
    }
}
