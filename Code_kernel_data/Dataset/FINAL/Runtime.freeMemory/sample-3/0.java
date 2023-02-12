public class func{
public void logStats(final MavenSession session){
        Runtime r = Runtime.getRuntime();
        logger.info("Final Memory: " + (r.totalMemory() - r.freeMemory()) / MB + "M/" + r.totalMemory() / MB + "M"); // TODO: i18n
}
}
