public class func{
public void isNextFrameValid(File seekFile,long filePointerCount,ByteBuffer bb,FileChannel fc){
        if (mp3FrameHeader.getFrameLength() > (FILE_BUFFER_SIZE - MIN_BUFFER_REMAINING_REQUIRED)) {
            return false;
        }
        if (bb.remaining() <= MIN_BUFFER_REMAINING_REQUIRED + mp3FrameHeader.getFrameLength()) {
            bb.clear();
            fc.position(filePointerCount);
            fc.read(bb, fc.position());
            bb.flip();
            currentPosition = 0;
            if (bb.limit() <= MIN_BUFFER_REMAINING_REQUIRED) {
                return false;
            }

            if (bb.limit() <= MIN_BUFFER_REMAINING_REQUIRED + mp3FrameHeader.getFrameLength()) {
                return false;
            }
        }
        bb.position(bb.position() + mp3FrameHeader.getFrameLength());
        if (MPEGFrameHeader.isMPEGFrame(bb)) {
            try {
                MPEGFrameHeader.parseMPEGHeader(bb);
                result = true;
            } catch (InvalidAudioFrameException ex) {
                result = false;
            }
        } else {
        }
        bb.position(currentPosition);
}
}
