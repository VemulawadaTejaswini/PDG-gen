//21
public class func{
public void loadFromUri(URI uri,URI base,Object validator){
        if (base != null) {
            fullUri = base.resolve(uri);
        }
        if (!fullUri.getSchemeSpecificPart().endsWith(SUFFIX)) {            
            fullUri =
                new URI(fullUri.getScheme(), fullUri.getAuthority(), fullUri.getPath() + SUFFIX, fullUri.getQuery(),
                    fullUri.getFragment());
        }
        Reader sourceReader = scriptSourceProvider.getScriptSource(fullUri);
        if (sourceReader == null) {
            return null;
        } else {
            return new ModuleSource(sourceReader, null, uri, base, validator);
        }
}
}
