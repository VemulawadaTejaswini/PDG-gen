import java.io.*;

class Main
{
    public static void main(String args[])
    {
        int num;
        String buf;
        try {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        buf = br.readLine();
        
        char[] work = new char[buf.length()];

        for(int i = 0; i < text.length(); i++){
            num = Integer.parseInt(work[i] );
            if ( num % 7 == 0){
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