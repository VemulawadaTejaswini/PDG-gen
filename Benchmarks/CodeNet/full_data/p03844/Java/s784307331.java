import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int A = Integer.parseInt(input.substring(0, input.indexOf(" ")));
        input = input.substring(input.indexOf(" ")+1);
        String op = input.substring(0, input.indexOf(" "));
        boolean isPlus = op.equals("+");
        input = input.substring(input.indexOf(" ")+1);
        int B = Integer.parseInt(input);

        if(isPlus){
            System.out.println(A + B);
        }
        else{
            System.out.println(A - B);
        }
    }
}