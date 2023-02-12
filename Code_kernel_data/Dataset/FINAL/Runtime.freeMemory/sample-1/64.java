public class func{
public void eval(Sequence[] args,Sequence contextSequence){
      memory = rt.maxMemory();
      memory = rt.totalMemory();
      memory = rt.freeMemory();
    return new IntegerValue(memory, Type.LONG);
}
}
