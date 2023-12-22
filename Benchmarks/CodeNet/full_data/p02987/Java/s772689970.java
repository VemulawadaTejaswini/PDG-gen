
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char []S;
        int count=0;
        S=input.next().toCharArray();
        for(int i=0;i<3;i++)
        {
            for(int j=i+1;j<4;j++)
            {
                if(S[i]==S[j])
                {
                    count++;
                }
            }
        }
        if(count==2)
        {
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}
