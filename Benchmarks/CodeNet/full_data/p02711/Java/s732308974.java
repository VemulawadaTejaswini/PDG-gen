import java.io.*;

class Main
{
    public static void main(String args[])
    {
        String buf;
        try {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        buf = br.readLine();
        
        char[] work = new char[buf.length()];

        for(int i = 0; i < buf.length(); i++){
            if ( work[i]  == "7"){
                System.out.println("Yes");
                break;
            }else if( i == 3 ){
                System.out.println("No");
                break;
            }
        }
    } catch(Exception e) {}
  }
}