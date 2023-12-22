import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int yen = scanner.nextInt();
        int sum = 0;
        int x1 = -1;
        int y1 = -1;
        int z1 = -1;

        for(int x = 0;x <= n;x++){
            for(int y = 0;y <= n;y++){
                for(int z = 0;z <= n;z++){
                    sum = 10000 * x + 5000 * y + 1000 * z;
                    if(sum == yen && x + y + z == n){
                        x1 = x;
                        y1 = y;
                        z1 = z;
                    }
                    sum = 0;
                }
            }
        }

        System.out.println(x1+" "+y1+" "+z1);
    }
}