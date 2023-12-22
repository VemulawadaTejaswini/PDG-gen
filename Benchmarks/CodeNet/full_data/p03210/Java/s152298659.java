import java.io.*;

class A_753{
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        String input = a.readLine();
        int x = Integer.parseInt(input);
        if(x==3 || x==5 || x==7){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}