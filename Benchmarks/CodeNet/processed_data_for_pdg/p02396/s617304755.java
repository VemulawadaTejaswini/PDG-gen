public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 1;
        if(a != 0)
            System.out.printf("Case %d: %d%n",cnt, a);
        while(a != 0){
            a = sc.nextInt();
            if(a == 0) break;
            cnt++;
            System.out.printf("Case %d: %d%n",cnt, a);
        }
        sc.close();
    }
}
