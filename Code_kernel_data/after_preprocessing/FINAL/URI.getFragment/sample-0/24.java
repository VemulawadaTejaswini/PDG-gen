public class func{
public void launch(final ILaunchConfiguration config,String mode,final ILaunch launch,IProgressMonitor m){
                    exeURI = new URI(exeURI.getScheme(), exeURI.getAuthority(), newExePath.toString(), exeURI.getQuery(), exeURI.getFragment());
                    exeFS = exeRFP.getResource(exeURI.getPath());
}
}
