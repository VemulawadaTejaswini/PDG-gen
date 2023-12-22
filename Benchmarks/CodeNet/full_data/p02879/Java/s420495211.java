import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a, b, answer;
        
        a = sc.nextInt();
        b = sc.nextInt();
        

        if(a>9||b>9)
            answer = -1;
        else
            answer = a*b;
        
        System.out.println(answer);
    }
}