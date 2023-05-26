public class func{
public void readFile(File file){
            LOG.debug("Read file:" + file.getAbsolutePath());
            BufferedReader br = new BufferedReader(new FileReader(file));
            return br.readLine();
}
}
