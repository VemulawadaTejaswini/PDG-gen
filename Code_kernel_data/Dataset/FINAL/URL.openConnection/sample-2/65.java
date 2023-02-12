public class func{
public void resolveFromNested(){
    assertThat(resource.openConnection().getInputStream().read(), equalTo(3));
}
}
