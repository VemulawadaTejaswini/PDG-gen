//94
public class func{
	public void audioPlay(File audioFile){
      AudioClip clip = Applet.newAudioClip(audioFile.toURI().toURL());
      clip.play();
}
}
