//59
public class func{
public void readHeaderValue(String s,BufferedReader br){
        br.mark(1);
        if (br.read() == ' ')
          s += br.readLine();
        else
          {
            br.reset();
            try_next = false;
          }
}
}
