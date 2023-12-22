import java.util.Scanner;

class aa
{
    static boolean isPalindrome(char []str)
    {
        int len = str.length;
        if (len == 1)
            return true;
        char ptr1 = str[0];
        char ptr2 = str[len-1];

        while (ptr2 > ptr1)
        {
            if (ptr1 != ptr2)
                return false;
            ptr1++;
            ptr2--;
        }

        return true;
    }
    static int noOfAppends(String s)
    {
        if (isPalindrome(s.toCharArray()))
            return 0;
        s=s.substring(1);

        return 1 + noOfAppends(s);
    }
    public static void main(String arr[])
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.printf("%d\n", noOfAppends(s));
    }
}

