//3
public class func{
public void renameToBak(File file){
        if (file.exists() && !file.renameTo(new File(file.getAbsolutePath() + "." + fmt.format(new Date()) + ".bak")))
            exit("Failed to rename file '" + file.getPath() + "'.", null);
}
}
