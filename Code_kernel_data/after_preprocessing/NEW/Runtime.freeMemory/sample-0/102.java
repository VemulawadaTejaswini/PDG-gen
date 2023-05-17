//102
public class func{
public void getContent(RunData rundata){
      Runtime jvm = Runtime.getRuntime();
      table.addElement(new TR().addElement(new TD("Free Memory (in bytes)"))
          .addElement(new TD(Long.toString(jvm.freeMemory()))));
      table.addElement(new TR().addElement(new TD("Total Memory (in bytes)"))
          .addElement(new TD(Long.toString(jvm.totalMemory()))));
}
}
