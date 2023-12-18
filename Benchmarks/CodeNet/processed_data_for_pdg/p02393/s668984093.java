public class Main
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[3];
        for (int i = 0; i < 3; i++)
        {
            array[i] = sc.nextInt();
        }
        for (int j = 1; j < array.length; j++)
        {
            int key = array[j];
            int i = j - 1;
            while (i >= 0 && array[i] > key)
            {
                array[i + 1] = array[i];
                --i;
            }
            array[i + 1] = key;
        }
        System.out.println(array[0] + " " + array[1] + " " + array[2]);
    }
}
