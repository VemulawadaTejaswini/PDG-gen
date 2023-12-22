import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean[] list = new boolean[1000000000];
        int sum = 0;
        for(int i = 0; i < n; i++) {
            int a = in.nextInt();
            if(list[a]) sum--;
            else        sum++;
            list[a] = !list[a];
            
        }
        System.out.println(sum);
    }
}
