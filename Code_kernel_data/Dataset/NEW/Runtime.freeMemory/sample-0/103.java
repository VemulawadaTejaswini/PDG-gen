//103
public class func{
public void updateStats(){
        Runtime runtime = Runtime.getRuntime();
        totalMem = runtime.totalMemory();
        long freeMem = runtime.freeMemory();
        if (convertToMeg(prevUsedMem) != convertToMeg(usedMem)) {
            prevUsedMem = usedMem;
            this.hasChanged = true;
        }
        if (prevTotalMem != totalMem) {
            prevTotalMem = totalMem;
            this.hasChanged = true;
        }
}
}
