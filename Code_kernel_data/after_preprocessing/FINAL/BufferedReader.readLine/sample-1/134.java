public class func{
public void readLsfile(File lsFile){
    while((line = br.readLine()) != null) 
      readLsLine(line, fileContents);
}
}
