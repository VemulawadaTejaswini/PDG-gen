public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[3]; 
        num[0] = scan.nextInt();
        num[1] = scan.nextInt();
        num[2] = scan.nextInt();
        Arrays.sort(num);
        System.out.println(num[0] + " " + num[1] + " " + num[2]);
        scan.close();
    }
}
