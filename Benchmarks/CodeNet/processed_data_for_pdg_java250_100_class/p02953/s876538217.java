public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int high = 0;
        int[] poyo = new int[n];
        poyo[0] = sc.nextInt();
        for(int i = 1;i < n;i++){
            poyo[i] = sc.nextInt();
        }
        for(int i = n-1;i > 1;i--){
            if(poyo[i] < poyo[i-1])poyo[i-1]--;
        }
        for(int i = 1;i < n;i++){
            if(poyo[i-1]>poyo[i]){
                System.out.print("No");
                return;
            }
        }
        System.out.print("Yes");
    }
}
