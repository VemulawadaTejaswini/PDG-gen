import java.util.*;
 class Main {
    public static void main(String[] args) {
        String s = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit");
        int n = sc.nextInt();
        System.out.println("Enter word in small letters");
        s = sc.nextLine();
        
        while(s.length() != n) {
        System.out.println("Entered word length should be equal to digit. Enter again");
        s = sc.nextLine();
        }
        
        if((s.substring(0, n / 2).concat(s.substring(n / 2, n)).equals(s)))
            System.out.println("Yes");
        else
            System.out.println("No");
              
    }
}