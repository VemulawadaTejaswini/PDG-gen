public class func{
public void shouldSetHeadersAndBaseDirectory(){
        assertThat(resourceHandler.getResourceBase(), isSameFileAs(new File("WEB-INF/rails.root/public/assets").toURI().toString()));
}
}
