public class func{
public void readIndividualSections(Map entries,BufferedReader br){
    String s = br.readLine();
    while (s != null && (! s.equals("")))
      {
        Attributes attr = readSectionName(s, br, entries);
        read_attributes(attr, br);
        s = br.readLine();
      }
}
}
