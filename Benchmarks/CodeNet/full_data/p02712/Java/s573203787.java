import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int input = Integer.parseInt(str);
        int sum = 0;
        for(int j = 0; j <= input; j++)
        {
            if(j % 3 != 0 && j % 5 != 0)sum += j;
        }
        System.out.println(sum);
    }
}
