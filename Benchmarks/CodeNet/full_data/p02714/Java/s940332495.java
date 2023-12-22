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
            num = Integer.parseInt( br.readLine() );
            char[] work = new char[buf.length()];
            char r = 'R';
            char g = 'G':
            char b = 'B':
            ans = 0;

            for(int i = 0; i < buf.length(); i++){
                work[i] = text.charAt(i);
            }
            for(int i = 0; i < buf.length(); i++){
                if (work[i] == r){
                    for(int j = i + 1; j < buf.length(); j++){
                        if (work[j] == g){
                            for(int k = j + 1; k < buf.length(); k++){
                                if (work[k] == b && j - i != k-j){
                                    ans += 1;
                                }
                            }
                        }
                    }
                }
            }
            
            System.out.println(Integer.toString(ans));
        } catch(Exception e) {}
  }
}