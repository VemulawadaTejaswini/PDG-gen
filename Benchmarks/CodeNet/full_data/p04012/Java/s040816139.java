import java.util.Scanner;
public class Main{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String s = scanner.next();
        int charCount = 0, flag = 0;
        for(char c = 'a'; c<='z'; c++){
            for(int i=0; i<s.length(); i++){
                if(c == s.charAt(i))
                    charCount++;
            }
            if(charCount % 2 != 0){
                flag = 1;
                break;
            }
        }
        if(flag == 1)
            System.out.println("No");
        else
            System.out.println("Yes");
    }
}