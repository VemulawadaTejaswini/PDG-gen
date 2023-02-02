//60
public class func{
public void loadFile(File file){
            while ((read = br.read(buffer)) != -1) {
                str.append(buffer, 0, read);
            }
            fr.close();
}
}
