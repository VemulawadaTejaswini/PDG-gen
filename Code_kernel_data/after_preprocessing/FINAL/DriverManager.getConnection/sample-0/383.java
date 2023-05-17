public class func{
public void singleSpan(){
        Connection conn = DriverManager.getConnection(getUrl(), props);
        sink.initForTesting(conn);
                createAndFlush(sink, traceid, Span.ROOT_SPAN_ID, 10, "root", 12, 13,
                    "host-name.value", "test annotation for a span");
        validateTraces(Collections.singletonList(record), conn, traceid);
}
}
