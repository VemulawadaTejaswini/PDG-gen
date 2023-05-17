//16
public class func{
public void dumpPWInfoFile(File infoFile){
        BufferedReader bf = new BufferedReader(new FileReader(infoFile));
        while (( line = bf.readLine()) != null) {
            System.out.println(line);
        }
        bf.close();
}
}
