import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<Integer>();
        for(int i = 0; i<3; i++)
        {
            input.add(sc.nextInt());
        }

        Collections.sort(input);

        System.out.println(input.get(0)+input.get(1));
    }
}