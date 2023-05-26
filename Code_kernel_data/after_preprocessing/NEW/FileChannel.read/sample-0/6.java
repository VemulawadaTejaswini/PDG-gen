//6
public class func{
public void isNextFrameValid(File seekFile,long filePointerCount,ByteBuffer bb,FileChannel fc){
        if (mp3FrameHeader.getFrameLength() > (FILE_BUFFER_SIZE - MIN_BUFFER_REMAINING_REQUIRED)) {
//            MP3AudioHeader.//logger.finer("Frame size is too large to be a frame:" + mp3FrameHeader.getFrameLength());
            return false;
        }
        if (bb.remaining() <= MIN_BUFFER_REMAINING_REQUIRED + mp3FrameHeader.getFrameLength()) {
//            MP3AudioHeader.//logger.finer("Buffer too small, need to reload, buffer size:" + bb.remaining());
            bb.clear();
            fc.position(filePointerCount);
            fc.read(bb, fc.position());
            bb.flip();
            //So now original buffer has been replaced, so set current position to start of buffer
            currentPosition = 0;
            //Not enough left
            if (bb.limit() <= MIN_BUFFER_REMAINING_REQUIRED) {
                //No mp3 exists
//                MP3AudioHeader.//logger.finer("Nearly at end of file, no header found:");
                return false;
            }

            //Still Not enough left for next alleged frame size so giving up
            if (bb.limit() <= MIN_BUFFER_REMAINING_REQUIRED + mp3FrameHeader.getFrameLength()) {
                //No mp3 exists
//                MP3AudioHeader.//logger.finer("Nearly at end of file, no room for next frame, no header found:");
                return false;
            }
        }
        bb.position(bb.position() + mp3FrameHeader.getFrameLength());
        if (MPEGFrameHeader.isMPEGFrame(bb)) {
            try {
                MPEGFrameHeader.parseMPEGHeader(bb);
//                MP3AudioHeader.//logger.finer("Check next frame confirms is an audio header ");
                result = true;
            } catch (InvalidAudioFrameException ex) {
//                MP3AudioHeader.//logger.finer("Check next frame has identified this is not an audio header");
                result = false;
            }
        } else {
//            MP3AudioHeader.//logger.finer("isMPEGFrame has identified this is not an audio header");
        }
        bb.position(currentPosition);
}
}
