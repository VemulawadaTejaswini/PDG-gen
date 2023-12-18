public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ans = sc.nextInt();
        int cnt = 0;
        while(ans != 0) {
            cnt ++;
            System.out.println("Case " + cnt + ": " + ans);
            ans = sc.nextInt();
        }
        sc.close();
    }
}
