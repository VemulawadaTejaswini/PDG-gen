public class func{
public void writeReport(final PrintWriter writer,ExceptionAnalysis analysis){
        Runtime runtime = Runtime.getRuntime();
        writer.printf("%n%nMemory:%n  %,15d bytes free%n  %,15d bytes total%n  %,15d bytes max%n",
                runtime.freeMemory(),
                runtime.totalMemory(),
                runtime.maxMemory());
}
}
