import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        
        boolean isWin = false;

        for (int j = 0; j < N; j++) {

            if ((H - A[j]) <= 0) {
                isWin = true;
                break;
            } else {
                H -= A[j];
                
            }
        }
        if (isWin) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}