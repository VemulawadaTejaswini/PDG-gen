import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Lucky7 {

    public static void main(String[] args) throws IOException {
        // write your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        int flag=0;
        while (n>0)
        {
            int r = n%10;

            if(r==7)
            {
                flag=1;
                break;
            }

            n=n/10;
        }

        if(flag==1)
            System.out.println("YES");
        else
            System.out.println("NO");

    }

}
