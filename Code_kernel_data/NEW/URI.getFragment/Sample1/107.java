//106
public class func{
	public void runDebugScript(){
      String executable = Submitter.getExecutable(localJobConf);
      if ( executable != null) {
        try {
          program = new URI(executable).getFragment();
        } catch (URISyntaxException ur) {
          LOG.warn("Problem in the URI fragment for pipes executable");
        }     
      }
}
}
