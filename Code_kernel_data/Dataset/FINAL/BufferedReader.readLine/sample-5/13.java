public class func{
public void testApp(){
        File configFile = new File(appsDir, "capp1/conf/test");
        BufferedReader reader = new BufferedReader(new FileReader(configFile));
        assertThat(reader.readLine()).isEqualTo("Hello capp1");
}
}
