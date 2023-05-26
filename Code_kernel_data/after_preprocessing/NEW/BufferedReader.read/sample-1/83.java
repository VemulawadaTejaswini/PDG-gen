//83
public class func{
public void generateUTF8OutFile(File FinalOutFile){
          while ((c = inFile.read()) != -1)
            bw.write(c);
          bw.flush();
          bw.close();
}
}
