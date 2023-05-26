public class func{
public void toString(Object object,ConverterContext context){
            return _defaultFormat.format(((Calendar) object).getTime());
}
}
