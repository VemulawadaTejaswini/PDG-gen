public class func{
public void outputDir(){
            Date today = Calendar.getInstance().getTime();
            outputDir = new File(path, "metrics-" + df.format(today));
}
}
