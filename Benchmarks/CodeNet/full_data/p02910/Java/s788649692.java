import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] strings = new String[110];
        strings = s.split("");
        int jadge = 0;
        for (int i=0; i<s.length(); i ++) {
           if(i%2==0 && strings[i].equals("L")) {
             jadge = 1;
             break;
           }
           if(i%2!=0 && strings[i].equals("R")) {
             jadge = 1;
             break;
           }
        }
        if(jadge==0) System.out.println("Yes");
        else System.out.println("No");
    }
}

