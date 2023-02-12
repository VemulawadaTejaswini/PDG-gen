public class func{
public void read(){
            while (ch != '\r' && ch != '\n')
            {
                ch = (char) reader.read ();
                if (ch != (char) -1 && ch != '\r' && ch != '\n')
                {
                    buff.append (ch);
                }
            }
}
}
