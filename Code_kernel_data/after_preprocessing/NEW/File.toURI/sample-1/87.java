//87
public class func{
public void guessedCssLocationExample2(){
    URI uri = (new File("src/sampleInput.less")).toURI();
    StringSource lessSource = new StringSource(".class { margin: 1 1 1 1; }", "sampleInput.less", uri);
}
}
