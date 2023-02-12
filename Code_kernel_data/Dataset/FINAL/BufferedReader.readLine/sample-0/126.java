public class func{
public void resolvePath(Path other){
        BufferedReader reader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/" + FILE_BASEDIR)));
            return Paths.get(reader.readLine()).resolve(other);
}
}
