import java.util.Scanner;

public class Main{
    public static void main(String args[] ) {

        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();

        
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i)=='A')
                count1++;
            if(str.charAt(i)=='B')
                count2++;

            // System.out.println(str.charAt(i));
        }
        if(count1>=1 && count2>=1)
            System.out.println("Yes");
        else
            System.out.println("No");

        sc.close();
    }
}
