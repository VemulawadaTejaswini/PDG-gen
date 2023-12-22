import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        number =input.nextInt();
        int sum=0;
        int max=0,temp;
        String s=input.next();
        for(int i=0;i<number;i++)
        {
            if(s.charAt(i)=='I')
            {
                sum++;
                if(max<sum)
                {
                    max=sum;
                }
            }
            else {
                sum--;
                if (max<sum)
                    max=sum;
            }
        }
        System.out.println(max);
    }
    
}
