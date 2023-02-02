//38
public class func{
public void createJVMView(BufferedReader reader){
    String name = StringUtil.unescape(reader.readLine());
    reader.readLine();
    JVMView newView = new JVMView(name, null);
    ReturnObject rObject = gateway.getReturnObject(newView);
    newView.setId(rObject.getName());
    return Protocol.getOutputCommand(rObject);
}
}
