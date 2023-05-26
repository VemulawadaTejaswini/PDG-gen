//179
public class func{
public void retrieve(ModuleSpec module,ModuleVersion version){
        System.out.println( "Attempting to Jenkins download module " + module.getName() + " v" + version.getBuild() );
            URL website = new URL( "http://ci.md-5.net/job/BungeeCord/" + version.getBuild() + "/artifact/module/" + module.getName().replace( '_', '-' ) + "/target/" + module.getName() + ".jar" );
            URLConnection con = website.openConnection();
            con.setConnectTimeout( 15000 );
            con.setReadTimeout( 15000 );
}
}
