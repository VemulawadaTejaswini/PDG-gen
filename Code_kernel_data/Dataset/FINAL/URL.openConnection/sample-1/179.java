public class func{
public void retrieve(ModuleSpec module,ModuleVersion version){
        System.out.println( "Attempting to Jenkins download module " + module.getName() + " v" + version.getBuild() );
            URL website = new URL( "http:
            URLConnection con = website.openConnection();
            con.setConnectTimeout( 15000 );
            con.setReadTimeout( 15000 );
}
}
