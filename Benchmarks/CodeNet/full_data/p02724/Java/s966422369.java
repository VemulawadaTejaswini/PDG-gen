import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        String inputStr = myObj.nextLine();
        int money = Integer.parseInt(inputStr);

        int ans = 0;
        int happy1000 = 0;
        int happy500 = 0;

        while (money >= 500)
        {
            happy1000 += 1000;
            money -= 500;
        }
        while (money >= 5)
        {
            happy500 += 5;
            money -= 5;
        }
        ans = happy500 + happy1000;
        System.out.print(ans);
    }
}