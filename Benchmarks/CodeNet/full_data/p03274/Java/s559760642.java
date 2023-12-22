import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int K = sc.nextInt();

        final List<Long> posiArray = new ArrayList<Long>();
        final List<Long> negaArray = new ArrayList<Long>();
        long input;
        int count = 0;
        for (int i = 0; i < N; i++)
        {
            input = sc.nextInt();
            if (input < 0)
            {
                negaArray.add(input);
            } else if (input > 0)
            {
                posiArray.add(input);
            } else
            {
                count++;
            }

        }
        int posiIndex = 0;
        int negaIndex = negaArray.size() - 1;
        long distance = 0;
        for (int i = 0; i < N; i++)
        {
            if (posiArray.size() == 0 && negaArray.size() == 0)
            {
                distance = 0;
                break;
            } else if (posiArray.size() == 0)
            {
                distance = -negaArray.get(K - 1);
                break;
            } else if (negaArray.size() == 0)
            {
                distance = posiArray.get(K - 1);
                break;
            } else if (posiIndex < posiArray.size() && posiArray.get(posiIndex) < -2 * negaArray.get(negaIndex))
            {
                posiIndex++;
            } else if (negaIndex < negaArray.size() && posiArray.get(posiIndex) >= -2 * negaArray.get(negaIndex))
            {
                negaIndex--;
            }
            count++;
            if (count == K)
            {
                final long posiDis = posiArray.get(posiIndex - 1);
                final long negaDis = negaArray.get(negaIndex + 1);
                if (posiDis - 2 * negaDis > 2 * posiDis - negaDis)
                {
                    distance = 2 * posiDis - negaDis;
                } else
                {
                    distance = posiDis - 2 * negaDis;
                }
                break;
            }
        }
        System.out.println(distance);
    }
}