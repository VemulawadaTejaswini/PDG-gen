public class func{
public void actionPerformed(ActionEvent e){
            Runtime jvm = Runtime.getRuntime();
            long totalMemory = jvm.totalMemory();
            long usedMemory = totalMemory-jvm.freeMemory();
}
}
