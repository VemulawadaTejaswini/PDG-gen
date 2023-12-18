public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[100000];
        int i = 0;
        while(true) {
            num[i] = scan.nextInt();
            if(num[i] == 0) {
                break;
            }
            i++;
        }
        for(int j = 0 ; j < i ; j++) {
            System.out.println("Case " + (j + 1) + ": " + num[j]);
        }
        scan.close();
    }
}
