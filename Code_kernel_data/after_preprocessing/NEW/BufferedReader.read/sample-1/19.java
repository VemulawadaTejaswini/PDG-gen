//19
public class func{
public void read(BufferedReader inFile){
      while ((len = inFile.read(buff)) >= 0)
        strb.append(buff, 0, len);
      inFile.close();
}
}
