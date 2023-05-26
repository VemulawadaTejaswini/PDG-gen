public class func{
public void slurpReader(Reader reader){
        int amountRead = r.read(chars, 0, SLURPBUFFSIZE);
        if (amountRead < 0) {
          break;
        }
        buff.append(chars, 0, amountRead);
      r.close();
}
}
