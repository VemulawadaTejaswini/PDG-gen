import java.util.Arrays; 


public class Traveling
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int[] input = new int[2];
        for(int i = 0; i < 2; i++)
        {
            input[i] = keyboard.nextInt();
        }
        int length = input[1];
        int[] houses = new int[length];
        int sum = 0;
        for(int j =0; j< length; j++)
        {
            houses[j] = keyboard.nextInt();
            

        }
        Arrays.sort(houses);
        for (int k =0; k<length-1; k++)
        {
                sum = sum + (houses[k+1] - houses[k]);
        }
        if(sum > input[0])
            System.out.println(input[0]);
        else
            System.out.println(sum);
    }
}
      