public class func{
public void singleCopyDateFormat(final DateFormat dateFormat,final StringBuffer stringBuffer,final CharBuffer charBuffer,final FieldPosition fp,final Date date){
    stringBuffer.setLength( 0 );
    dateFormat.format( date, stringBuffer, fp );
}
}
