//65
public class func{
public void getCodeFromIFile(IFile file){
    while ((line = br.readLine()) != null) {
      code.append(line);
      code.append('\n');
    }
    br.close();
}
}
