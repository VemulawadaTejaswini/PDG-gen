import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int n = s.length();
        int count=0;

        if(s.charAt(0) != 'A') {
            System.out.println("WA");
            return;
        }

        if(Character.isUpperCase(s.charAt(1))) {
            System.out.println("WA");
            return;
        }

        if(Character.isUpperCase(s.charAt(n-1))) {
            System.out.println("WA");
            return;
        }


        for(int i = 2;i < n-1;i++){
           // System.out.println(s.charAt(i));
            if(Character.isUpperCase(s.charAt(i))) {
                if (s.charAt(i) == 'C')
                    count++;
                else {
                    System.out.println("WA");
                    return;
                }
            }

        }

        System.out.println(count==1?"AC":"WA");


    }
}