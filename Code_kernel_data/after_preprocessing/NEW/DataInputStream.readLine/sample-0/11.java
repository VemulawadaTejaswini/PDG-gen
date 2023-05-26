//11
public class func{
public void readLatinOneFileLines(File file){
    new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
   while ((str = infile.readLine()) != null)
    lines.addElement(str);
   infile.close();
}
}
