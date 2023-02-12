public class func{
public void createTemplateArguments(){
    args.put("datetime", formatter.format(new Date()));
    formatter = new SimpleDateFormat("MMMM d, yyyy", Locale.US);
}
}
