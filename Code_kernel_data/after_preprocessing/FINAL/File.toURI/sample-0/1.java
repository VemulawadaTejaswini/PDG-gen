public class func{
public void toFileList(File parent,List<String> names){
        for (String name : names) {
            result.add(new File(new File(parent, name).toURI().normalize()));
        }
}
}
