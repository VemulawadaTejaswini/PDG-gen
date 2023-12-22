import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{

    public static void main(String[] args)  throws IOException {
        // write your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        String s = reader.readLine();
        String[] inp = s.split(" ");

        int[] arr= new int[n];

        for (int i = 0; i < inp.length; i++)
        {
            arr[i]=Integer.parseInt(inp[i]);
        }


        for (int i = 0; i < arr.length-1; i++) {

            if(arr[i]>arr[i+1])
            {
                arr[i]--;
            }
        }

        /*
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
         */


        int fn=0;
        for (int i=0;i<arr.length-1;i++)
        {
            if(arr[i]<=arr[i+1])
            {
                fn++;
            }
        }

        if(fn==arr.length-1)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}