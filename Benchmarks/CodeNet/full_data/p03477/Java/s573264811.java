import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int L = A+B;
        int R = C+D;
        String j;
        if(R > L){
            j = "Right";
        }else if(R<L){
            j = "Left";
        }else{
            j = "Balanced";
        }
        System.out.println(j);

    }
}