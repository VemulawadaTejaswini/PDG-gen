import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        int l1 = (s.length()-1)/2;
        int l2 = (s.length()+3)/2;
        String a = s.substring(0, l1);
        String b = s.substring(l2-1);

        if(palindorme(s) && palindorme(a) && palindorme(b)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    private static boolean palindorme(String s) {
        int l = 0;
        int h = s.length()-1;

        while(l < h)
        {
            if(s.charAt(l) == s.charAt(h))
            {
                l++;
                h--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}