public class func{
public void memoryReportStr(){
    sb.append(numFmt.format(rt.totalMemory() / 1024.0));
    sb.append("Kb total, ");
    sb.append(numFmt.format(rt.freeMemory() / 1024.0));
    sb.append("Kb free, ");
    sb.append(numFmt.format(rt.maxMemory() / 1024.0));
    sb.append("Kb max.");
    return sb.toString();
}
}
