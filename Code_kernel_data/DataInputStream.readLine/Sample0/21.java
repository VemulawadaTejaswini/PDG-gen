//20
public class func{
	public void main(String[] args){
    FileInputStream inputFile = new FileInputStream(kms.filename);
    while ((n = inputFile.read(b)) != -1) {
      for (int i = 0; i < n; i++) {
        if (b[i] == '\n')
          numObjects++;
      }
    }
    inputFile.close();
    inputFile = new FileInputStream(kms.filename);
    if((line = new DataInputStream(inputFile).readLine()) != null) {
      int index = 0;
      boolean prevWhiteSpace = true;
      while(index < line.length()) {
        char c = line.charAt(index++);
        boolean currWhiteSpace = Character.isWhitespace(c);
        if(prevWhiteSpace && !currWhiteSpace){
          numAttributes++;
        }   
        prevWhiteSpace = currWhiteSpace;
      }   
    }   
    inputFile.close();
    KMeans.readFromFile(inputFile, kms.filename, buf, MAX_LINE_LENGTH);
}
}
