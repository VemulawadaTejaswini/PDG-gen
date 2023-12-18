public class Main {
    public static void main(String[] args) {
        int i = 0;
        int[] Case = new int[10000];
        Scanner sc = new Scanner(System.in);
        while(true){
            int x = sc.nextInt();
            if (x == 0) break;
            System.out.println("Case " + (i+1) + ": " + x);
            i++;
        }
    }
}
