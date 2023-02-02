//56
public class func{
public void slurpReader(Reader reader){
        int amountRead = r.read(chars, 0, SLURP_BUFFER_SIZE);
        if (amountRead < 0) {
          break;
        }
        buff.append(chars, 0, amountRead);
      r.close();
}
}
