public class func{
public void refreshTrace(ITrace traceModel){
      traceTime.setText(format.format(traceModel.getTraceTime()));
      analysisTime.setText(format.format(traceModel.getDataTime()));
      threadCount.setText(traceModel.getThreads().size() + "");
}
}
