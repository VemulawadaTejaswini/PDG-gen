//108
public class func{
public void parseHeaderLines(BufferedReader r){
    while((line=r.readLine())!=null && line.startsWith("#"))
      {
      stack.add(line);
      if(line.startsWith("#CHROM\t")) break;
      }
}
}
