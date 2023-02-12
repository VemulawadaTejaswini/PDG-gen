public class func{
public void start(String mrl){
        String fileName = dir.getAbsolutePath() + "/Capture-" + df.format(new Date()) + ".mpg";
        mediaPlayer.playMedia(mrl, options);
}
}
