public class func{
public void defaultToConfWhenNoConfigFound(){
        assertThat(ctx.getConfigLocation(), equalTo(expected.toURI()));
}
}
