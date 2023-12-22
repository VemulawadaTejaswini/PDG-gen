import java.io.*;

class Main
{
    public static void main(String args[])
    {
        String buf;
        int num;
        int ans;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            buf = br.readLine();
            num = Integer.parseInt(buf);
            for(int i = 1; i < =num; i++){
            if (num % 3 == 0 || num % 5 == 0){
                continue;
            }else{
                ans += i;
            }
            System.out.println(Integer.toString(ans));
        } catch(Exception e) {}
  }
}