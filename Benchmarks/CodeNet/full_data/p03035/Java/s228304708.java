import java.util.Scanner;

public class main {
    public void main(String[] args)
    {
        Scanner r=new Scanner(System.in);
        int A=r.nextInt();
        int B=r.nextInt();
        if(A>=13)
        {
            System.out.println(B);
        }else if(A>=6 && A<=12)
        {
            System.out.println(B/2);
        }
        else
        {
            System.out.println(0);
        }
    }
}