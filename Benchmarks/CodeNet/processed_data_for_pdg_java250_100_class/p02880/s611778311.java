public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "No";
        for (int i = 1; i<=9; i++){
            for (int j = 1; j<=9; j++){
                if (i*j == n){
                    s = "Yes";
                    break;
                }
            }
        }
        System.out.println(s);
    }
}
