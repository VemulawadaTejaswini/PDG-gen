//109
public class func{
public void testEscapeResolvedUrl(){
  String escaped = RealCDXExtractorOutput.resolve(context, spec);
  assertTrue(escaped.indexOf(" ") < 0);
  URI parsed = new URI(escaped);
  assertEquals("Ã¤nchor", parsed.getFragment());
}
}
