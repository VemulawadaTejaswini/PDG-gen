//9
public class func{
public void assertEquals(Calendar expected,Date actual){
        if (expected == null || actual == null) {
            assertEquals((Object) expected, (Object) actual);
        } else {
            assertEquals(expected.getTime(), actual);
        }
}
}
