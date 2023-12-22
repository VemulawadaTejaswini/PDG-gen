import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int x = Integer.parseInt(input);
        if(x==7||x==5||x==3){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}