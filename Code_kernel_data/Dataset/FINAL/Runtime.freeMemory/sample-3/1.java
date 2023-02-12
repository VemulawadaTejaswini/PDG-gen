public class func{
public void logStats(MavenSession session){
        Runtime r = Runtime.getRuntime();
        logger.info( "Final Memory: " + ( r.totalMemory() - r.freeMemory() ) / mb + "M/" + r.totalMemory() / mb + "M" );
}
}
