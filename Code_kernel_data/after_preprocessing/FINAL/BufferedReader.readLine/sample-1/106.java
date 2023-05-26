public class func{
public void readURLFile(Reader reader){
    while ((line = in.readLine()) != null) {
      if (line.length() != 0) {
        list.add(new FilteredURL(line));
      }
    }
    return (FilteredURL[]) list.toArray(new FilteredURL[list.size()]);
}
}
