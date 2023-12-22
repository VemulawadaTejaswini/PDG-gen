import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int prize = 0;
        if(x == 3)
            prize = 100000;
        else if(x == 2)
            prize = 200000;
        else if(x == 1)
            prize = 300000;
        if(y == 3)
            prize += 100000;
        else if(y == 2)
            prize += 200000;
        if(y == 1)
            prize += 300000;
        if(x == 1 && y == 1)
            prize += 400000;
        System.out.println(prize);
        sc.close();
    }
}