//8
public class func{
public void testApp(){
        File originalConfigFile = new File(appsDir, "capp1/conf/.test.config.orig");
        reader = new BufferedReader(new FileReader(originalConfigFile));
        assertThat(reader.readLine()).isEqualTo("Hello ${application.id}");
}
}
