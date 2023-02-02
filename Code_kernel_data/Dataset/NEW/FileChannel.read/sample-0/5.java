//5
public class func{
public void seek(final File seekFile,long startByte){
                if (bb.remaining() <= MIN_BUFFER_REMAINING_REQUIRED) {
                    bb.clear();
                    fc.position(filePointerCount);
                    fc.read(bb, fc.position());
                    bb.flip();
                    if (bb.limit() <= MIN_BUFFER_REMAINING_REQUIRED) {
                        //No mp3 exists
                        return false;
                    }
                }
                if (MPEGFrameHeader.isMPEGFrame(bb)) {
                    try {
//                        if (MP3AudioHeader.//logger.isLoggable(Level.FINEST))
//                        {
//                            MP3AudioHeader.//logger.finest("Found Possible header at:" + filePointerCount);
//                        }

                        mp3FrameHeader = MPEGFrameHeader.parseMPEGHeader(bb);
                        syncFound = true;
                        //if(2==1) use this line when you want to test getting the next frame without using xing
                        if (XingFrame.isXingFrame(bb, mp3FrameHeader)) {
//                            if (MP3AudioHeader.//logger.isLoggable(Level.FINEST))
//                            {
//                                MP3AudioHeader.//logger.finest("Found Possible XingHeader");
//                            }
                            try {
                                //Parses Xing frame without modifying position of main buffer
                                mp3XingFrame = XingFrame.parseXingFrame();
                            } catch (InvalidAudioFrameException ex) {
                                // We Ignore because even if Xing Header is corrupted
                                //doesn't mean file is corrupted
                            }
                            break;
                        } else if (VbriFrame.isVbriFrame(bb, mp3FrameHeader)) {
//                            if (MP3AudioHeader.//logger.isLoggable(Level.FINEST))
//                            {
//                                MP3AudioHeader.//logger.finest("Found Possible VbriHeader");
//                            }
                            try {
                                //Parses Vbri frame without modifying position of main buffer
                                mp3VbriFrame = VbriFrame.parseVBRIFrame();
                            } catch (InvalidAudioFrameException ex) {
                                // We Ignore because even if Vbri Header is corrupted
                                //doesn't mean file is corrupted
                            }
                            break;
                        }
                        // There is a small but real chance that an unsynchronised ID3 Frame could fool the MPEG
                        // Parser into thinking it was an MPEG Header. If this happens the chances of the next bytes
                        // forming a Xing frame header are very remote. On the basis that  most files these days have
                        // Xing headers we do an additional check for when an apparent frame header has been found
                        // but is not followed by a Xing Header:We check the next header this wont impose a large
                        // overhead because wont apply to most Mpegs anyway ( Most likely to occur if audio
                        // has an  APIC frame which should have been unsynchronised but has not been) , or if the frame
                        // has been encoded with as Unicode LE because these have a BOM of 0xFF 0xFE
                        else {
                            syncFound = isNextFrameValid(seekFile, filePointerCount, bb, fc);
                            if (syncFound) {
                                break;
                            }
                        }

                    } catch (InvalidAudioFrameException ex) {
                        // We Ignore because likely to be incorrect sync bits ,
                        // will just continue in loop
                    }
                }
                bb.position(bb.position() + 1);
}
}
