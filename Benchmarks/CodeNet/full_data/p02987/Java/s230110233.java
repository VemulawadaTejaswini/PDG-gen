import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
      	String str = sc.nextString();
        
        if ((str[0].equals(str[1] && str[2].equals(str[3]) && !str[1].equals(str[2]))
           || (str[0].equals(str[2] && str[1].equals(str[3]) && !str[0].equals(str[1]))
           || (str[0].equals(str[3] && str[1].equals(str[2]) && !str[0].equals(str[1]))) {
            System.out.print("Yes");
        else {
            System.out.print("No");
        } 
    }
}