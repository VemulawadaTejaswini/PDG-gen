//116
public class func{
public void writeProjectFile(File intoDir,String projectName,String sourcePath,String fileName){
    while ((line = bufferedReader.readLine()) != null) {
      writer.println(line.replace("{{projectName}}", projectName));
    }
    writer.close();
}
}
