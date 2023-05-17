//4
public class func{
public void format(final JSON json,final Context context,final Object src,final Object o,final OutputSource out){
    DateFormat f = context.getDateFormat();
    if (f != null) {
      StringFormatter.serialize(context, f.format(o), out);
    } else if (context.getMode() == Mode.SCRIPT) {
      out.append("new Date(");
      out.append(Long.toString(date.getTime()));
      out.append(")");
    } else {
      out.append(Long.toString(date.getTime()));
    }
}
}
