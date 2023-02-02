//124
public class func{
public void renameBuildFromReaderToWriter(String oldBuildName,String newBuildName,BufferedReader oldFileReader,FileWriter newFileWriter){
        while ( ( oldLine = oldFileReader.readLine() ) != null )
        {
            String newLine = oldLine.replaceAll( oldBuildName, newBuildName );
            newFileWriter.write( newLine );
        }
}
}
