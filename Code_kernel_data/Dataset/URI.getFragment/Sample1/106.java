//105
public class func{
	public void taskFinished(){
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
