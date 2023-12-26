public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int Ans = 0;
        while((B-1) > (A-1)*Ans){
            Ans += 1;
        }
        System.out.println(Ans);
        sc.close();
    }
}
