//113
public class func{
public void checkDecoratedDateTime(){
        assertEquals("Date should be formatters to pattern dd.mm.yyyy",
                     sampleFormatter.format(now), formatter.format(now));
}
}
