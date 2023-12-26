public class Main
{
    public static void main(String [] args)
    {
        Scanner scaanner = new Scanner(System.in);
        long num = scaanner.nextLong();
        long blue = scaanner.nextLong();
        long red = scaanner.nextLong();
        long divisible_group = (num / (blue+red));
        long indivisible_group = (num % (blue+red));
        long total =  divisible_group * blue;
        if (indivisible_group <= blue) {
            System.out.println(total+ indivisible_group);
        } else {
            System.out.println(total+ blue);
        }
    }
}
