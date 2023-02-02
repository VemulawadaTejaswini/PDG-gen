//0
public class func{
public void test_getContentType(){
        URL u = copyAndOpenResourceStream("lf.jar", "");
        assertEquals("Returned incorrect type for jar file", "x-java/jar",
                u.openConnection().getContentType());
        u = copyAndOpenResourceStream("lf.jar", "plus.bmp");
        assertEquals("Returned incorrect type for the entry with known type",
                "image/x-ms-bmp", u.openConnection().getContentType());
        u = copyAndOpenResourceStream("lf.jar", "Manifest.mf");
        assertEquals("Returned incorrect type for the entry with known type",
                "content/unknown", u.openConnection().getContentType());
}
}
