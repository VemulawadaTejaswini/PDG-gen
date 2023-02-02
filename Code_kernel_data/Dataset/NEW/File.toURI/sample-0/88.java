//88
public class func{
public void messageSource(){
        File file = new File(System.getProperty("user.dir"), "src/main/webapp/WEB-INF/messages");
        messageSource.setBasename(file.toURI().toString());
}
}
