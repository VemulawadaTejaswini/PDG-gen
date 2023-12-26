public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < k*2-1; i++){
            sb.append(x-k+1+i).append(' ');
        }
        System.out.println(sb);
    }
}
