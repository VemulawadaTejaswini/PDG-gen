public class func{
public void readStream(InputStream source,CompactCalendar startDate,ParserContext<GpxRoute> context){
        Process process = startBabel(source, getFormatName(), BABEL_INTERFACE_FORMAT_NAME, ROUTE_WAYPOINTS_TRACKS);
        Thread observer = observeProcess(process, getReadCommandExecutionTimeoutPreference());
        observer.start();
}
}
