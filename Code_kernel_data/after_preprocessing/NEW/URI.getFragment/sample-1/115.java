//115
public class func{
public void assertHasFragment(AssertionInfo info,URI actual,String expected){
    assertNotNull(info, actual);
    if (!areEqual(actual.getFragment(), expected)) throw failures.failure(info, shouldHaveFragment(actual, expected));
}
}
