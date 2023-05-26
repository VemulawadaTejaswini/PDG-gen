public class func{
public void create(@Nonnull File file){
        checkNotNull(file, "file cannot be null");
        return new IRI(file.toURI());
}
}
