//5
public class func{
public void isPatternFoundInClasspath(List<String> elements,Pattern pattern){
        if (elements != null) {
            for (String e : elements) {
                Matcher m = pattern.matcher(new File(e).toURI().toString());
                if (m.matches())
                    return true;
            }
        }
}
}
