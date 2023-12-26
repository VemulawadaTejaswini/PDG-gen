public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int[]B = new int[A]; 
        for (int i = 0 ; i< A; i++){
            B[i]  = sc.nextInt();
        }
        sc.close();
        int ans = 0;
        for (int i = 0;i<A-1;i++){        
            int cnt = 0;
            for (int j = i;j < A;j++){
                if (j == A-1){
                    break;
                }
                if (B[j] >=B[j+1]){
                    cnt++;
                } else{
                    break;
                }
            }
            if (ans < cnt){
                ans = cnt;
            }
            if (ans >= A-i){
                break;
            }
        }
        System.out.println(ans);
    }
}       
