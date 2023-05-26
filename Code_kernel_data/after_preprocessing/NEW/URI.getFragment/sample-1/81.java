//81
public class func{
public void isFilePartOfConfList(Path path){
        String fragmentName = new URI(path.toString()).getFragment();
        String fileName = fragmentName == null ? path.getName() : fragmentName;
        return actionConfSet.contains(fileName);
}
}
