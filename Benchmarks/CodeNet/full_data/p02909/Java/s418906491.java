import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] s1 = new String[3];
        s1[0] = "Sunny";
        s1[1] = "Cloudy";
        s1[2] = "Rainy";
        String s2 = sc.next();
        
        int jadge = 0;
        if(s2.equals(s1[0])) jadge = 1;
        if(s2.equals(s1[1])) jadge = 2;
        if(s2.equals(s1[2])) jadge = 0;
        System.out.println(s1[jadge]);
    }
}

