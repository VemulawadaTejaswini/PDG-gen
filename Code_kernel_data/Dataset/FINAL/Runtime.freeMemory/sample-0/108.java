public class func{
public void checkAvailableMemory(int neededMemory,TestResult testResult){
        Runtime runtime = Runtime.getRuntime();
        long total = runtime.totalMemory();
        long free = runtime.freeMemory();
        addErrorMessage(testResult, errorMessage);
}
}
