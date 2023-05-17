//5
public class func{
public void doGetSystemProps(ReqState rs){
        Runtime rt = Runtime.getRuntime();
        pw.println("JVM Max Memory:   " + (rt.maxMemory() / 1024) / 1000. + " MB (JVM Maximum Allowable Heap)<br>");
        pw.println("JVM Total Memory: " + (rt.totalMemory() / 1024) / 1000. + " MB (JVM Heap size)<br>");
        pw.println("JVM Free Memory:  " + (rt.freeMemory() / 1024) / 1000. + " MB (Unused part of heap)<br>");
        pw.println("JVM Used Memory:  " + ((rt.totalMemory() - rt.freeMemory()) / 1024) / 1000. + " MB (Currently active memory)<br>");
        pw.println("</html>");
        pw.flush();
}
}
