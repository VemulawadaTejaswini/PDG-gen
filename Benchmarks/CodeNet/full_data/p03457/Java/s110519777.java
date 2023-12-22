import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int preT = 0;
        int preX = 0;
        int preY = 0;


        for(int i = 0; i < N; i++){
            int currentT = sc.nextInt();
            int currentX = sc.nextInt();
            int currentY = sc.nextInt();

            int diff = currentT - preT;
            int distance = Math.abs(currentX - preX) + Math.abs(currentY - preY);

            if((diff < distance) || ((distance - diff) % 2 != 0)){
                System.out.println("No");
                return;
            }
            preT = currentT;
            preX = currentX;
            preY = currentY;

        }

        System.out.println("Yes");
    }
}