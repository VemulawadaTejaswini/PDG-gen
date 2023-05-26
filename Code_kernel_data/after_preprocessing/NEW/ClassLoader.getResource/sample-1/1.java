//1
public class func{
public void initialize(){
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            URL dataUrl = classLoader.getResource("org/richfaces/renderkit/countries.xml");
            Countries cntr = (Countries) unmarshaller.unmarshal(dataUrl);
            countries = cntr.getCountries();
}
}
