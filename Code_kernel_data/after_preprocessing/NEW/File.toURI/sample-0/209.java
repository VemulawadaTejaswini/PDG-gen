//209
public class func{
public void main(final String[] args){
        final File file = new File(CONFIG);
        Configurator.initialize("LogTest", LogRolloverTest.class.getClassLoader(), file.toURI());
}
}
