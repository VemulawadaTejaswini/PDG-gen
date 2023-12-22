import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());

        int num1 = N%500;
        int out2 = num1/1;
        String j;
        if(out2 <= A){
            j = "Yes";
        }else{
            j = "No";
        }
        System.out.println(j);

    }
}
