import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a;
        int[] order = new int[n];
        for(int i = 0; i < n; i ++){
            a = scanner.nextInt();
            order[a-1] = i+1;
        }
        for(int syusseki : order){
            System.out.println(syusseki);
        }
    }
}