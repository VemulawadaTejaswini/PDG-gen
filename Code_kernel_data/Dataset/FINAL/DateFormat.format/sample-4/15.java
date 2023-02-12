public class func{
public void format(Object data,Locale locale){
        DateFormat dateFormat = DateFormat.getDateTimeInstance(m_dateStyle, m_timeStyle);
        return dateFormat.format(data);
}
}
