public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int[] a = new int [N];
        for(int i = 0;i<N;i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        int[] ans = new int [N];
        for (int i = 0;i<N;i++){
            ans[a[i]-1] = i + 1; 
        }
        for (int answer:ans){
            System.out.println(answer);
        }
    }
}
