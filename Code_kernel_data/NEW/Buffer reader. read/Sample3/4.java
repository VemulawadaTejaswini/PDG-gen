//3
public class func{
	public void getSourceText(Status status,CompilerMessageLogger messageLogger){
                int charsRead = sourceReader.read(inputBuffer);
                while(charsRead != -1) {
                    stringBuilder.append(inputBuffer, 0, charsRead);
                    charsRead = sourceReader.read(inputBuffer);
                }
}
}
