public class func{
public void testRegexpHeaderURL(){
            createCheckConfig(RegexpHeaderCheck.class);
        URI uri = new File(getPath("regexp.header")).toURI();
        checkConfig.addAttribute("headerFile", uri.toString());
}
}
