import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int board = input.nextInt(),
            player1 = input.nextInt(),
            player2 = input.nextInt();
        
        while(true)
        {
            if((player1 + 1) != player2)
                player1++;
            else
                player1--;
            if(player1 < 1)
            {
                System.out.println("Borys");
                break;
            }
            
            if((player2 - 1) != player1)
                player2--;
            else
                player2++;
            if(player2 > board)
            {
                System.out.println("Alice");
                break;
            }
        }
    }
}