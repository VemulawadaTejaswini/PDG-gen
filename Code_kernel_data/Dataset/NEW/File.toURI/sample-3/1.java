//1
public class func{
public void addPathFiles(Collection<File> paths){
        for ( File f : paths )
        {
            urls.add( f.toURI().toURL() );
            addPathFile( f );
        }
}
}
