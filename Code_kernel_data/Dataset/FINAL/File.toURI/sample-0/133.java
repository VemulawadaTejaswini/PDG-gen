public class func{
public void OpenFileWithSystemEditor(IWorkbenchPage page,String filePath){
    OpenFileWithSystemEditor(page, new File(filePath).toURI());
}
}
