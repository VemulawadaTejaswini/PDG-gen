//0
public class func{
	public void fillBuffer(FileChannel channel,ByteBuffer buf){
    int bytesRead = channel.read(buf);
    if (bytesRead < 0) {
      //EOF
      return bytesRead;
    }
    while (buf.remaining() > 0) {
      int n = channel.read(buf);
      if (n < 0) {
        //EOF
        return bytesRead;
      }
      bytesRead += n;
    }
}
}
//1
public class func{
	public void performTransfer(FileChannel source,IoCallback callback){
            long pos = source.position();
            long size = source.size();
            while (size - pos > 0) {
                int ret = source.read(buffer);
                if (ret <= 0) {
                    break;
                }
                pos += ret;
                buffer.flip();
                if (!writeBuffer(buffer, callback)) {
                    return;
                }
                buffer.clear();
            }
            if (pos != size) {
                throw new EOFException("Unexpected EOF reading file");
            }
}
}
//2
public class func{
	public void load(String prvkey,String pubkey){
      fc = new FileInputStream(prvkey).getChannel();
      int i = 0, len = (int) fc.size();
      fc.read(ByteBuffer.wrap(buf = new byte[len]));
      fc.close();
      while( i < len ) {
        if( buf[i] == 'B' && buf[i + 1] == 'E' && buf[i + 2] == 'G' && buf[i + 3] == 'I' ) {
          i += 6;
          if( buf[i] == 'D' && buf[i + 1] == 'S' && buf[i + 2] == 'A' ) {
            type = KeyType.SSH_DSS;
          } else if( buf[i] == 'R' && buf[i + 1] == 'S' && buf[i + 2] == 'A' ) {
            type = KeyType.SSH_RSA;
          } else if( buf[i] == 'S' && buf[i + 1] == 'S' && buf[i + 2] == 'H' ) { // FSecure
            type = KeyType.UNKNOWN;
            vendor = VENDOR_FSECURE;
          } else {
            throw new JSchException("invalid privatekey: " + prvkey);
          }
          i += 3;
          continue;
        }
        if( buf[i] == 'C' && buf[i + 1] == 'B' && buf[i + 2] == 'C' && buf[i + 3] == ',' ) {
          i += 4;
          for( int ii = 0; ii < iv.length; ii++ ) {
            iv[ii] = (byte) (((DataUtil.a2b(buf[i++]) << 4) & 0xf0) + (DataUtil.a2b(buf[i++]) & 0xf));
          }
          continue;
        }
        if( buf[i] == 0x0d
            && i + 1 < buf.length && buf[i + 1] == 0x0a ) {
          i++;
          continue;
        }
        if( buf[i] == 0x0a && i + 1 < buf.length ) {
          if( buf[i + 1] == 0x0a ) {
            i += 2;
            break;
          }
          if( buf[i + 1] == 0x0d
              && i + 2 < buf.length && buf[i + 2] == 0x0a ) {
            i += 3;
            break;
          }
          boolean inheader = false;
          for( int j = i + 1; j < buf.length; j++ ) {
            if( buf[j] == 0x0a ) {
              break;
            }
            //if(buf[j]==0x0d) break;
            if( buf[j] == ':' ) {
              inheader = true;
              break;
            }
          }
          if( !inheader ) {
            i++;
            encrypted = false;    // no passphrase
            break;
          }
        }
        i++;
      }
}
}
//3
public class func{
	public void executeOnSlave(){
            long initPos = fileChannel.position();
            String key = Integer.toString(slaveState.getSlaveIndex()) + "-" + Long.toString(initPos);
            int bytesRead = fileChannel.read(buffer);
            if (bytesRead != -1) {
               while (bytesRead != valueSize) {
                  int readBytes = fileChannel.read(buffer);
                  if (readBytes == -1) {
                     break;
                  } else {
                     bytesRead += readBytes;
                  }
               }
               totalBytesRead += bytesRead;
               if (putCount % 5000 == 0) {
                  log.info("Writing " + bytesRead + " bytes to cache key: " + key + " at position "
                        + fileChannel.position());
               }
               buffer.rewind();
               long start = System.nanoTime();
               if (stringData) {
                  String cacheData = buffer.asCharBuffer().toString();
                  start = System.nanoTime();
                  cache.put(key, cacheData);
               } else {
                  cache.put(key, buffer.array());
               }
               if (printWriteStatistics) {
                  log.info("Put on slave-" + slaveState.getSlaveIndex() + " took "
                        + Utils.prettyPrintTime(System.nanoTime() - start, TimeUnit.NANOSECONDS));
               }
               putCount++;
               fileChannel.position(initPos + (valueSize * totalWriters));
               buffer.clear();
            } else {
               file.close();
               file = null;
               break;
            }
         return new ResultAck(slaveState, putCount, totalBytesRead);
}
}
//4
public class func{
	public void load(String prvkey,String pubkey){
      if( pubkey != null ) {
        try {
          fc = new FileInputStream(pubkey).getChannel();
          len = (int) fc.size();
          fc.read(ByteBuffer.wrap(buf = new byte[len]));
          fc.close();

          if( buf.length > 4 && // FSecure's public key
              buf[0] == '-' && buf[1] == '-' && buf[2] == '-' && buf[3] == '-' ) {

            boolean valid = true;
            i = 0;
            do {
              i++;
            } while( buf.length > i && buf[i] != 0x0a );
            if( buf.length <= i ) {
              valid = false;
            }

            while( valid ) {
              if( buf[i] == 0x0a ) {
                boolean inheader = false;
                for( int j = i + 1; j < buf.length; j++ ) {
                  if( buf[j] == 0x0a ) {
                    break;
                  }
                  if( buf[j] == ':' ) {
                    inheader = true;
                    break;
                  }
                }
                if( !inheader ) {
                  i++;
                  break;
                }
              }
              i++;
            }
            if( buf.length <= i ) {
              valid = false;
            }

            start = i;
            while( valid && i < len ) {
              if( buf[i] == 0x0a ) {
                System.arraycopy(buf, i + 1, buf, i, len - i - 1);
                len--;
                continue;
              }
              if( buf[i] == '-' ) {
                break;
              }
              i++;
            }
            if( valid ) {
              publickeyblob = Util.fromBase64(buf, start, i - start);
              if( type == KeyType.UNKNOWN ) {
                if( publickeyblob[8] == 'd' ) {
                  type = KeyType.SSH_DSS;
                } else if( publickeyblob[8] == 'r' ) {
                  type = KeyType.SSH_RSA;
                }
              }
            }
          } else {
            if( buf[0] == 's' && buf[1] == 's' && buf[2] == 'h' && buf[3] == '-' ) {
              i = 0;
              while( i < len ) {
                if( buf[i] == ' ' ) {
                  break;
                }
                i++;
              }
              i++;
              if( i < len ) {
                start = i;
                while( i < len ) {
                  if( buf[i] == ' ' ) {
                    break;
                  }
                  i++;
                }
                publickeyblob = Util.fromBase64(buf, start, i - start);
              }
            }
          }
        } catch(Exception ee) {
          // TODO Error handling???
        }
      }
}
}
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
//7
public class func{
	public void hashFiles(List<File> files){
    for (File file : files) {

      length += file.length();

      FileInputStream fis = new FileInputStream(file);
      FileChannel channel = fis.getChannel();
      int step = 10;

      try {
        while (channel.read(buffer) > 0) {
          if (buffer.remaining() == 0) {
            buffer.clear();
            results.add(executor.submit(new CallableChunkHasher(buffer)));
          }

          if (results.size() >= threads) {
            pieces += accumulateHashes(hashes, results);
          }

          if (channel.position() / (double)channel.size() * 100f > step) {
            step += 10;
          }
        }
      } finally {
        channel.close();
        fis.close();
      }
    }
}
}
//8
public class func{
	public void hashFiles(List<File> files,int pieceLenght){
      logger.info("Hashing data from {} with {} threads ({} pieces)...",
        new Object[] {
          file.getName(),
          threads,
          (int) (Math.ceil(
            (double)file.length() / pieceLenght))
        });
      length += file.length();
      FileInputStream fis = new FileInputStream(file);
      FileChannel channel = fis.getChannel();
        while (channel.read(buffer) > 0) {
          if (buffer.remaining() == 0) {
            buffer.clear();
            results.add(executor.submit(new CallableChunkHasher(buffer)));
          }

          if (results.size() >= threads) {
            pieces += accumulateHashes(hashes, results);
          }

          if (channel.position() / (double)channel.size() * 100f > step) {
            logger.info("  ... {}% complete", step);
            step += 10;
          }
        }
        channel.close();
}
}
//9
public class func{
	public void subsetObjectVector(File tabfile,int column,int varcount,int casecount,int columntype,boolean compatmode){
            bytesRead = fc.read(in);
            byte[] columnBytes = in.array();
            while (bytecount < bytesRead) {
                if (columnBytes[bytecount] == '\n') {
                    /*
                    String token = new String(columnBytes, byteoffset, bytecount-byteoffset, "UTF8");

                    if (leftover != null) {
                        String leftoverString = new String (leftover, "UTF8");
                        token = leftoverString + token;
                        leftover = null;
                    }
                    */
                    /* 
                     * Note that the way I was doing it at first - above - 
                     * was not quite the correct way - because I was creating UTF8
                     * strings from the leftover bytes, and the bytes in the 
                     * current buffer *separately*; which means, if a multi-byte
                     * UTF8 character got split in the middle between one buffer
                     * and the next, both chunks of it would become junk 
                     * characters, on each side!
                     * The correct way of doing it, of course, is to create a
                     * merged byte buffer, and then turn it into a UTF8 string. 
                     *      -- L.A. 4.0
                     */
                    String token = null; 
                    
                    if (leftover == null) {
                        token = new String(columnBytes, byteoffset, bytecount-byteoffset, "UTF8");
                    } else {
                        byte[] merged = new byte[leftover.length + bytecount-byteoffset];
                        
                        System.arraycopy(leftover, 0, merged, 0, leftover.length);
                        System.arraycopy(columnBytes, byteoffset, merged, leftover.length, bytecount-byteoffset);
                        token = new String (merged, "UTF8");
                        leftover = null;
                        merged = null; 
                    }
                    
                    if (isString) {
                        if ("".equals(token)) {
                            // An empty string is a string missing value!
                            // An empty string in quotes is an empty string!
                            retVector[caseindex] = null;
                        } else {
                            // Strip the outer quotes:
                            token = token.replaceFirst("^\\\"", "");
                            token = token.replaceFirst("\\\"$", "");
                            
                            // We need to restore the special characters that 
                            // are stored in tab files escaped - quotes, new lines 
                            // and tabs. Before we do that however, we need to 
                            // take care of any escaped backslashes stored in 
                            // the tab file. I.e., "foo\t" should be transformed 
                            // to "foo<TAB>"; but "foo\\t" should be transformed 
                            // to "foo\t". This way new lines and tabs that were
                            // already escaped in the original data are not 
                            // going to be transformed to unescaped tab and 
                            // new line characters!
                            
                            String[] splitTokens = token.split(Matcher.quoteReplacement("\\\\"), -2);
                            
                            // (note that it's important to use the 2-argument version 
                            // of String.split(), and set the limit argument to a
                            // negative value; otherwise any trailing backslashes 
                            // are lost.)
                            
                            for (int i = 0; i < splitTokens.length; i++) {
                                splitTokens[i] = splitTokens[i].replaceAll(Matcher.quoteReplacement("\\\""), "\"");
                                splitTokens[i] = splitTokens[i].replaceAll(Matcher.quoteReplacement("\\t"), "\t");
                                splitTokens[i] = splitTokens[i].replaceAll(Matcher.quoteReplacement("\\n"), "\n");
                                splitTokens[i] = splitTokens[i].replaceAll(Matcher.quoteReplacement("\\r"), "\r");
                            }
                            // TODO: 
                            // Make (some of?) the above optional; for ex., we 
                            // do need to restore the newlines when calculating UNFs;
                            // But if we are subsetting these vectors in order to 
                            // create a new tab-delimited file, they will 
                            // actually break things! -- L.A. Jul. 28 2014
                            
                            token = StringUtils.join(splitTokens, '\\');
                            
                            // "compatibility mode" - a hack, to be able to produce
                            // unfs identical to those produced by the "early" 
                            // unf5 jar; will be removed in production 4.0. 
                            // -- L.A. (TODO: ...)
                            if (compatmode && !"".equals(token)) {
                                if (token.length() > 128) {
                                    if ("".equals(token.trim())) {
                                        // don't ask... 
                                        token = token.substring(0, 129);
                                    } else {
                                        token = token.substring(0, 128);
                                        //token = String.format(loc, "%.128s", token);
                                        token = token.trim();
                                        //dbgLog.info("formatted and trimmed: "+token);
                                    }
                                } else {
                                    if ("".equals(token.trim())) {
                                        // again, don't ask; 
                                        // - this replicates some bugginness 
                                        // that happens inside unf5;
                                        token = "null";
                                    } else {
                                        token = token.trim();
                                    }
                                }
                            }
                            
                            retVector[caseindex] = token;
                        }
                    } else if (isDouble) {
                        try {
                            // TODO: verify that NaN and +-Inf are 
                            // handled correctly here! -- L.A.
                            // Verified: new Double("nan") works correctly, 
                            // resulting in Double.NaN;
                            // Double("[+-]Inf") doesn't work however; 
                            // (the constructor appears to be expecting it
                            // to be spelled as "Infinity", "-Infinity", etc. 
                            if ("inf".equalsIgnoreCase(token) || "+inf".equalsIgnoreCase(token)) {
                                retVector[caseindex] = java.lang.Double.POSITIVE_INFINITY;
                            } else if ("-inf".equalsIgnoreCase(token)) {
                                retVector[caseindex] = java.lang.Double.NEGATIVE_INFINITY;
                            } else if (token == null || token.equals("")) {
                                // missing value:
                                retVector[caseindex] = null;
                            } else {
                                retVector[caseindex] = new Double(token);
                            }
                        } catch (NumberFormatException ex) {
                            dbgLog.warning("NumberFormatException thrown for "+token+" as Double");

                            retVector[caseindex] = null; // missing value
                            // TODO: ?
                        }
                    } else if (isLong) {
                        try {
                            retVector[caseindex] = new Long(token);
                        } catch (NumberFormatException ex) {
                            retVector[caseindex] = null; // assume missing value
                        }
                    } else if (isFloat) {
                        try {
                            if ("inf".equalsIgnoreCase(token) || "+inf".equalsIgnoreCase(token)) {
                                retVector[caseindex] = java.lang.Float.POSITIVE_INFINITY;
                            } else if ("-inf".equalsIgnoreCase(token)) {
                                retVector[caseindex] = java.lang.Float.NEGATIVE_INFINITY;
                            } else if (token == null || token.equals("")) {
                                // missing value:
                                retVector[caseindex] = null;
                            } else {
                                retVector[caseindex] = new Float(token);
                            }
                        } catch (NumberFormatException ex) {
                            dbgLog.warning("NumberFormatException thrown for "+token+" as Float");
                            retVector[caseindex] = null; // assume missing value (TODO: ?)
                        }
                    }
                    caseindex++;
                    
                    if (bytecount == bytesRead - 1) {
                        byteoffset = 0;
                    } else {
                        byteoffset = bytecount + 1;
                    }
                } else {
                    if (bytecount == bytesRead - 1) {
                        // We've reached the end of the buffer; 
                        // This means we'll save whatever unused bytes left in 
                        // it - i.e., the bytes between the last new line 
                        // encountered and the end - in the leftover buffer. 
                        
                        // *EXCEPT*, there may be a case of a very long String
                        // that is actually longer than MAX_COLUMN_BUFFER, in 
                        // which case it is possible that we've read through
                        // an entire buffer of bytes without finding any 
                        // new lines... in this case we may need to add this
                        // entire byte buffer to an already existing leftover 
                        // buffer!
                        if (leftover == null) {
                            leftover = new byte[(int)bytesRead - byteoffset];
                            System.arraycopy(columnBytes, byteoffset, leftover, 0, (int)bytesRead - byteoffset);
                        } else {
                            if (byteoffset != 0) {
                                throw new IOException("Reached the end of the byte buffer, with some leftover left from the last read; yet the offset is not zero!");
                            }
                            byte[] merged = new byte[leftover.length + (int)bytesRead];

                            System.arraycopy(leftover, 0, merged, 0, leftover.length);
                            System.arraycopy(columnBytes, byteoffset, merged, leftover.length, (int)bytesRead);
                            //leftover = null;
                            leftover = merged;
                            merged = null;   
                        }
                        byteoffset = 0;

                    }
                }
                bytecount++;
            }
            in.clear();
            if (columnLength - bytesReadTotal < MAX_COLUMN_BUFFER) {
                in.limit((int)(columnLength - bytesReadTotal));
            }
        fc.close();
}
}
//10
public class func{
	public void fold_keys_hintfile(KeyIter<T> iter,T acc){
                ByteBuffer h = ByteBuffer.wrap(header);
                long read = ch.read(h);
                if (read != HINT_HEADER_SIZE)
                {
                    return acc;
                }
                h.rewind();
                int tstamp = h.getInt();
                int key_len = h.getChar();
                int entry_len = h.getInt();
                long entry_off = h.getLong();
                ByteBuffer key = ByteBuffer.wrap(k);
                read = ch.read(key);
                if (read != key_len)
                {
                    return acc;
                }
                acc = iter.each(ByteString.copyFrom(k), tstamp, entry_off, entry_len, acc);
}
}
//11
public class func{
	public void fold_keys_hintfile(KeyIter<T> iter,T acc){
        ByteBuffer h = ByteBuffer.wrap(header);
        long read = ch.read(h);
        if (read != HINT_HEADER_SIZE) {
          return acc;
        }
        h.rewind();
        int tstamp = h.getInt();
        int key_len = h.getChar();
        int entry_len = h.getInt();
        long entry_off = h.getLong();
        ByteBuffer key = ByteBuffer.wrap(k);
        read = ch.read(key);
        if (read != key_len) {
          return acc;
        }
        acc = iter.each(ByteString.copyFrom(k), tstamp, entry_off, entry_len, acc);
}
}
//12
public class func{
	public void drain(FileChannel channel,long position,long count){
                if (buffer == null) buffer = DRAIN_BUFFER.duplicate();
                if ((long) buffer.limit() > count) buffer.limit((int) count);
                ires = channel.read(buffer);
                buffer.clear();
                switch (ires) {
                    case -1: return total == 0L ? -1L : total;
                    case 0: return total;
                    default: total += (long) ires;
                }
}
}
//13
public class func{
	public void testFileChannelByLine(){
    do {
      int rd = in.read(buf);
      read += (rd < 0 ? 0 : rd); // rd == -1 if at end of stream.
      buf.flip();

      int start = buf.position();
      buf.mark();
      while (buf.hasRemaining()) {
        byte b = buf.get();
        if (b == '\n') {
          int end = buf.position();
          int sz = end - start;
          byte[] body = new byte[sz];
          buf.reset(); // go back to mark
          buf.get(body, 0, sz - 1); // read data
          buf.get(); // read '\n'
          buf.mark(); // new mark.
          start = buf.position();
          String s = new String(body);
          LOG.info("=> " + s);
        }
      }

      buf.clear();
      loops++;
    } while (!done.await(5, TimeUnit.MILLISECONDS));
    LOG.info("read " + read + " bytes in " + loops + " iterations");
    in.close();
    assertEquals(790, read);
}
}
//14
public class func{
	public void compress(String sourceDir){
                    while (!eof && buff.remaining() < 512 * 1024) {
                        int remaining = buff.remaining();
                        buff.compact();
                        buff.position(remaining);
                        int l = fc.read(buff);
                        if (l < 0) {
                            eof = true;
                        }
                        buff.flip();
                    }
                    if (buff.remaining() == 0) {
                        break;
                    }
                    int c = getChunkLength(buff.array(), buff.position(),
                            buff.limit()) - buff.position();
                    System.arraycopy(buff.array(), buff.position(), bytes, 0, c);
                    buff.position(buff.position() + c);
                    int[] key = getKey(bucket, bytes);
}
}
//15
public class func{
	public void fillBuffer(ByteBuffer buffer,File file,int rearOffset){
            fis = new FileInputStream(file);
            FileChannel fc = fis.getChannel();
            if(fc.size() >= buffer.capacity() + rearOffset) {
                fc.position(fc.size() - buffer.capacity() - rearOffset);
            } else {
                fc.position(0);
            }
            while(totalRead < buffer.capacity() && totalRead < fc.size()) {
                read = fc.read(buffer);
                totalRead += read;
                if(read == 0 || read == -1)
                    break;
            }
            buffer.limit(totalRead);
            IOUtils.close(fis);
}
}
//16
public class func{
	public void read(RandomAccessFile raf,DirectByteBuffer[] buffers,long offset){
      for (int i=0;i<bbs.length;i++){
        
        ByteBuffer bb = bbs[i] = buffers[i].getBuffer(DirectByteBuffer.SS_FILE);
        
        int  pos = original_positions[i] = bb.position();
        
        if ( pos != bb.limit()){
          
          last_bb  = bbs[i];
        }
      }
      if ( last_bb != null ){
                  
        int    loop      = 0;
        
          // we sometimes read off the end of the file (when rechecking) so
          // bail out if we've completed the read or got to file end
          // a "better" fix would be to prevent the over-read in the first
          // place, but hey, we're just about to release and there may be other
          // instances of this...

        while ( fc.position() < fc.size() && last_bb.hasRemaining()){
          
          long  read = fc.read( bbs );
                  
          if ( read > 0 ){
            
            loop  = 0;
            
          }else{
          
            loop++;
            
            if ( loop == READ_RETRY_LIMIT ){
              
              Debug.out( "FMFile::read: zero length read - abandoning" );
            
              throw( new FMFileManagerException( "read fails: retry limit exceeded"));
              
            }else{
              
              if ( DEBUG_VERBOSE ){
                
                Debug.out( "FMFile::read: zero length read - retrying" );
              }
              
              try{
                Thread.sleep( READ_RETRY_DELAY*loop );
                
              }catch( InterruptedException e ){
                
                throw( new FMFileManagerException( "read fails: interrupted" ));
              }
            }
          }            
        }
      }
        Debug.out( "Read failed: " + owner.getString() + ": raf open=" + raf.getChannel().isOpen() + ", len=" + raf.length() + ",off=" + offset );
}
}
//17
public class func{
	public void read(final long address,final int size){
                final long remainingInBlock = addressUp(address) - address;
                if (remainingInBlock < maxSize) {
                    maxSize = (int) remainingInBlock;
                }
                _readBuffer.limit(maxSize);
                while (_readBuffer.remaining() > 0) {
                    final int readSize = fc.read(_readBuffer, offset + address % _blockSize);
                    if (readSize < 0) {
                        break;
                    }
                    offset += readSize;
                }
                _readBuffer.flip();
                if (_readBuffer.remaining() < size) {
                    throw new CorruptJournalException("End of file at " + addressToString(address));
                }
}
}
//18
public class func{
	public void findHighIdBackwards(){
        for ( long i = highId; i > 0; i-- )
        {
            fileChannel.position( i * recordSize );
            if ( fileChannel.read( byteBuffer ) > 0 )
            {
                byteBuffer.flip();
                byte inUse = byteBuffer.get();
                byteBuffer.clear();
                if ( inUse != 0 )
                {
                    return i;
                }
            }
        }
}
}
//19
public class func{
	public void performTransfer(FileChannel source,IoCallback callback){
                long pos = source.position();
                long size = source.size();
                while (size - pos > 0) {
                    int ret = source.read(buffer);
                    if (ret <= 0) {
                        break;
                    }
                    pos += ret;
                    outputStream.write(buffer.array(), buffer.arrayOffset(), ret);
                    buffer.clear();
                }
                if (pos != size) {
                    throw new EOFException("Unexpected EOF reading file");
                }
}
}
//20
public class func{
	public void read(String name,ByteBuffer dst){
            checkAccess(file.getPathForPermissionCheck(), true, false);
        int fd = file.openForAttributeAccess(followLinks);
                int afd = openat(fd, nameAsBytes(file,name), (O_RDONLY|O_XATTR), 0);
                FileChannel fc = UnixChannelFactory.newFileChannel(afd, true, false);
                    if (fc.size() > dst.remaining())
                        throw new IOException("Extended attribute file too large");
                    while (dst.hasRemaining()) {
                        int n = fc.read(dst);
                        if (n < 0)
                            break;
                        total += n;
                    }
                    fc.close();
}
}
//21
public class func{
	public void read(String name,ByteBuffer dst){
            if (fc.size() > dst.remaining())
                throw new IOException("Stream too large");
            while (dst.hasRemaining()) {
                int n = fc.read(dst);
                if (n < 0)
                    break;
                total += n;
            }
            fc.close();
}
}
//22
public class func{
	public void run(){
                            int read = channel.read(buff.getByteBuffer(), offset);
                            if (read < 0) {
                                if (buff.position() > position) {
                                    buff.limit(buff.position());
                                    buff.position(position);
                                    buff.mark();
                                    list.add(buff);
                                } else {
                                    if (Debug.ENABLED)
                                        buff.lock(0);

                                    buff.recycle();
                                }

                                break;
                            } else if (buff.remaining() == 0) {
                                buff.position(position);
                                buff.mark();
                                list.add(buff);
                                buff = JVMBuff.getWithPosition(Buff.getLargestUnsplitable());
                                position = buff.position();
                            }
                        buffs = new JVMBuff[list.size()];
                        list.copyToFixed(buffs);
}
}
//23
public class func{
	public void write(OutputStream out){
            bb.clear();
            long bytesRead = channel.read(bb);
            if (bytesRead <= 0) {
              writeNothing();
              fos.close();
              break;
            }
            fos.writeInt((int) bytesRead);
            if (useChecksum) {
              checksum.reset();
              checksum.update(buf, 0, (int) bytesRead);
              fos.writeLong(checksum.getValue());
            }
}
}
//24
public class func{
	public void readBGZFBlock(final FileInputStream inputStream,final long blockAddress){
            inputBuffer.clear();
            inputBuffer.limit(BlockCompressedStreamConstants.BLOCK_HEADER_LENGTH);
            channel.read(inputBuffer);
            inputBuffer.flip();
            if(inputBuffer.remaining() != BlockCompressedStreamConstants.BLOCK_HEADER_LENGTH)
                throw new ReviewedGATKException("BUG: unable to read a the complete block header in one pass.");
            if(unpackUByte8(inputBuffer,0) != BlockCompressedStreamConstants.GZIP_ID1 ||
                    unpackUByte8(inputBuffer,1) != BlockCompressedStreamConstants.GZIP_ID2 ||
                    unpackUByte8(inputBuffer,3) != BlockCompressedStreamConstants.GZIP_FLG ||
                    unpackUInt16(inputBuffer,10) != BlockCompressedStreamConstants.GZIP_XLEN ||
                    unpackUByte8(inputBuffer,12) != BlockCompressedStreamConstants.BGZF_ID1 ||
                    unpackUByte8(inputBuffer,13) != BlockCompressedStreamConstants.BGZF_ID2) {
                throw new ReviewedGATKException("BUG: Started reading compressed block at incorrect position");
            }
            inputBuffer.position(BlockCompressedStreamConstants.BLOCK_LENGTH_OFFSET);
            bufferSize = unpackUInt16(inputBuffer,BlockCompressedStreamConstants.BLOCK_LENGTH_OFFSET)+1;
            inputBuffer.limit(bufferSize);
            inputBuffer.position(BlockCompressedStreamConstants.BLOCK_HEADER_LENGTH);
            channel.read(inputBuffer);
            uncompressedDataSize = inputBuffer.getInt(inputBuffer.limit()-4);
        inputBuffer.flip();
}
}
//25
public class func{
	public void readFull(ByteBuffer dstBuffer,FileChannel srcChannel,long position){
        while(dstBuffer.remaining() > 0) {
            if (srcChannel.read(dstBuffer,
                                    position + dstBuffer.position()) == -1) {
                throw new EOFException(
                    "Reached end of file while attempting to read a "
                    + "whole page.");
            }

            // (**) Sun Java NIO is weird: it can close the channel due to an
            // interrupt without throwing if bytes got transferred. Compensate,
            // so we can clean up.  Bug 6979009,
            // http://bugs.sun.com/view_bug.do?bug_id=6979009
            if (Thread.currentThread().isInterrupted() &&
                    !srcChannel.isOpen()) {
                throw new ClosedByInterruptException();
            }
        }
}
}
//26
public class func{
	public void fileCopy(String xmlpath,String newpath){
                if (inC.position() == inC.size()) {
                    inC.close();
                    outC.close();
                    return true;
                }
                if ((inC.size() - inC.position()) < length) {
                    length = (int) (inC.size() - inC.position());
                }
                b = ByteBuffer.allocateDirect(length);
                inC.read(b);
                b.flip();
                outC.write(b);
                outC.force(false);
}
}
//27
public class func{
	public void read(FileChannel ch,ByteBuffer bb,final long start_position){
        while (bb.hasRemaining())
        {

            int read = ch.read(bb, position);
            if (read >= 0)
            {
                position += read;

                if (read == 0)
                {
                    Thread.yield();
                }
            } else
            {
                return 0;
            }
        }
}
}
//28
public class func{
	public void read(FileChannel ch,ByteBuffer[] bb,final long start_position){
            while (buf.hasRemaining())
            {

                int read = ch.read(buf, position);
                if (read >= 0)
                {
                    position += read;

                    if (read == 0)
                    {
                        Thread.yield();
                    }
                } else
                {
                    return 0;
                }
            }
}
}
//29
public class func{
	public void read(FileChannel ch,ByteBuffer bb,final long start_position){
    while (bb.hasRemaining()) {

      int read = ch.read(bb, position);
      if (read >= 0) {
        position += read;

        if (read == 0) {
          Thread.yield();
        }
      } else {
        return 0;
      }
    }
}
}
//30
public class func{
	public void readFromFile(FileChannel fileChannel,int bytesToRead){
      ByteBuffer nioBuffer = ByteBuffer.wrap(rawBuffer);
      for (int bytesRead = 0; bytesRead < bytesToRead;) {
        int lastBytesRead = fileChannel.read(nioBuffer);

        // We always expect to read data.
        if (lastBytesRead < 0) {
          throw new OsmosisRuntimeException("Unexpectedly reached the end of the replication data file");
        }
        if (lastBytesRead == 0) {
          throw new OsmosisRuntimeException("Last read of the replication data file returned 0 bytes");
        }

        bytesRead += lastBytesRead;
      }
      return ChannelBuffers.wrappedBuffer(rawBuffer);
}
}
//31
public class func{
	public void read(FileChannel ch,ByteBuffer[] bb,final long start_position){
      while (buf.hasRemaining()) {

        int read = ch.read(buf, position);
        if (read >= 0) {
          position += read;

          if (read == 0) {
            Thread.yield();
          }
        } else {
          return 0;
        }
      }
}
}
//32
public class func{
	public void testFileChannel(){
    while (!done.await(5, TimeUnit.MILLISECONDS)) {
      int rd = in.read(buf);
      read += (rd < 0 ? 0 : rd); // rd == -1 if at end of stream.
      buf.flip();
      byte[] arr = new byte[buf.remaining()];
      buf.get(arr);
      String s = new String(arr);
      System.out.print(s);
      buf.clear();
      loops++;
    }
    LOG.info("read " + read + " bytes in " + loops + " iterations");
    in.close();
    assertEquals(790, read);
}
}
//33
public class func{
	public void genericTest(){
                int read = c.read(bleck, offset);
                if (read < 0)
                    throw new Exception("Read failed");
            newPosition = c.position();
            if (originalPosition != newPosition)
                throw new Exception("File position modified");
}
}
//34
public class func{
	public void isSameContent(File file,byte[] bytes,int length){
      ByteBuffer byteBuffer = ByteBuffer.wrap(buffer);
      while (((bufferLength = fileChannel.read(byteBuffer)) > 0) &&
           (bufferIndex < length)) {

        for (int i = 0; i < bufferLength; i++) {
          if (buffer[i] != bytes[bufferIndex++]) {
            return false;
          }
        }

        byteBuffer.clear();
      }
      if ((bufferIndex != length) || (bufferLength != -1)) {
        return false;
      }
      else {
        return true;
      }
}
}
//35
public class func{
	public void appendFile(FileChannel fc,String file,ByteBuffer bb){
      bb.rewind();
      int nr = fci.read(bb);
      bb.flip();
      if (nr > 0)
        fc.write(bb);
      if (nr < bb.capacity())
        break;
    fci.close();
}
}
//36
public class func{
	public void access(boolean read,long pos,long ptr,int length){
                        amt = channel.read(bb, pos);
                        if (amt < 0) {
                            throw new EOFException("Attempt to read past end of file: " + pos);
                        }
                        amt = channel.write(bb, pos);
                    if (length <= 0) {
                        break;
                    }
                yieldFile(file);
            throw rethrow(e, mCause);
}
}
//37
public class func{
	public void read(){
      if (size > buffer.getMemorySegment().size()) {
        throw new IllegalStateException("Buffer is too small for data: " + buffer.getMemorySegment().size() + " bytes available, but " + size + " needed. This is most likely due to an serialized event, which is larger than the buffer size.");
      }
      buffer.setSize(size);
      fileChannel.read(buffer.getNioBuffer());
      if (!isBuffer) {
        buffer.tagAsEvent();
      }
}
}
//38
public class func{
	public void speedTestNIO(int bufferSize,boolean direct){
        if (buf.remaining() < 4) {
          buf.compact();
          fs.read(buf);
          buf.flip();
        }
        if (buf.getInt() != valsLeft) {
          throw new IOException();
        }
}
}
//39
public class func{
	public void testFileChannelBlockRead(){
    do {
      int rd = in.read(buf);
      read += (rd < 0 ? 0 : rd); // rd == -1 if at end of stream.
      buf.flip();
      byte[] arr = new byte[buf.remaining()];
      buf.get(arr);
      String s = new String(arr);
      System.out.print(s);
      buf.clear();
      loops++;
    } while (!done.await(5, TimeUnit.MILLISECONDS));
    LOG.info("read " + read + " bytes in " + loops + " iterations");
    in.close();
    assertEquals(790, read);
}
}
//40
public class func{
	public void test2(){
        ByteBuffer bb = ByteBuffer.allocateDirect(10);
        fc.read(bb);
        bb.flip();
        if (bb.get() != 2)
            throw new RuntimeException("Write failure");
        if (bb.get() != 3)
            throw new RuntimeException("Write failure");
            bb.get();
}
}
//41
public class func{
	public void runTransfer(IProgressMonitor monitor){
      if(fileChannel.read(buffer) == -1)
        break;
      buffer.flip();
      while(buffer.remaining() > 0) {
        int n = socket.write(buffer);
        bytesSent += n;
        monitor.worked(n);
        monitor.setTaskName("Transfer Probe (" + numberToString(bytesSent) + " of " + 
            numberToString(probeSize) + ")");
      }
      buffer.clear();
}
}
//42
public class func{
	public void validate(String expected,String result){
      resultF.read(bResult);
      bResult.rewind();
      if (bExp.compareTo(bResult) != 0) {
        while (bExp.hasRemaining() || bResult.hasRemaining()) {
          char a = (char) bExp.get();
          char b = (char) bResult.get();
          if (a != b) {
            fail("Expected " + a + " but was " + b + " at position " + bExp.position());
          }
        }
      }
      fileInputStream.close();
}
}
//43
public class func{
	public void doTest(ApplicationContext ctx,String baseUrl,String contentUrl){
        HttpAlfrescoStore store = new HttpAlfrescoStore();
        store.setTransactionService(transactionService);
        store.setAuthenticationService(authenticationService);
        store.setBaseHttpUrl(baseUrl);
        ContentReader reader = store.getReader(contentUrl);
        boolean exists = reader.exists();
        if (!exists)
        {
            System.out.println(
                    "   Content doesn't exist: " + contentUrl);
            return;
        }
        else
        {
            System.out.println(
                    "   Content exists: " + contentUrl);
        }
        ContentData contentData = reader.getContentData();
        ByteBuffer buffer = ByteBuffer.allocate((int)reader.getSize());
        FileChannel channel = reader.getFileChannel();
            int count = channel.read(buffer);
            if (count != reader.getSize())
            {
                System.err.println("The number of bytes read was " + count + " but expected " + reader.getSize());
                return;
            }
            channel.close();
}
}
//44
public class func{
	public void storeFilesUpgradeable(File neoStoreFile){
        for ( String fileName : fileNamesToExpectedVersions.keySet() )
        {
            String expectedVersion = fileNamesToExpectedVersions.get( fileName );
            FileChannel fileChannel = null;
            byte[] expectedVersionBytes = UTF8.encode( expectedVersion );
            try
            {
                File storeFile = new File( storeDirectory, fileName );
                if (!storeFile.exists()) {
                    return false;
                }
                fileChannel = new RandomAccessFile( storeFile, "r" ).getChannel();
                fileChannel.position( fileChannel.size() - expectedVersionBytes.length );
                byte[] foundVersionBytes = new byte[expectedVersionBytes.length];
                fileChannel.read( ByteBuffer.wrap( foundVersionBytes ) );
                if ( !expectedVersion.equals( UTF8.decode( foundVersionBytes ) ) )
                {
                    return false;
                }
            } catch ( IOException e )
            {
                throw new RuntimeException( e );
            } finally
            {
                if ( fileChannel != null )
                {
                    try
                    {
                        fileChannel.close();
                    } catch ( IOException e )
                    {
                        // Ignore exception on close
                    }
                }
            }
        }
}
}
//45
public class func{
	public void get(String fn){
            bb.clear();
            if (fc.read(bb) < 0)
                throw new IOException("Could not read any bytes");
            bb.flip();
            int major = bb.getShort(6);
}
}
//46
public class func{
	public void loadClassBytes(String classFile){
    int i = fileC.read(buffer);
    if (i == 0 || i == -1) {
     break;
    }
    buffer.flip();
    outC.write(buffer);
    buffer.clear();
}
}
//47
public class func{
	public void testCreateIdGenerator(){
            assertEquals( (byte) 0, buffer.get() );
            assertEquals( 0l, buffer.getLong() );
            buffer.flip();
            int readCount = fileChannel.read( buffer );
            if ( readCount != -1 && readCount != 0 )
            {
                fail( "Id generator header not ok read 9 + " + readCount
                    + " bytes from file" );
            }
            fileChannel.close();
}
}
//48
public class func{
	public void write(OutputStream out){
            bb.clear();
            long bytesRead = channel.read(bb);
            if (bytesRead <= 0) {
              writeNothingAndFlush();
              fos.close();
              break;
            }
            fos.writeInt((int) bytesRead);
}
}
//49
public class func{
	public void main(String[] args){
        FileInputStream fis = new FileInputStream(blah);
        FileChannel fc = fis.getChannel();
        long bytesRead = fc.read(dstBuffers) ;
        if (bytesRead != 0)
            throw new RuntimeException("Nonzero return from read");
        fc.close();
}
}
//50
public class func{
	public void test3(){
        FileInputStream fis = new FileInputStream("/dev/zero");
        fc = fis.getChannel();
        long bytesRead = fc.read(dstBuffers);
        if (bytesRead <= Integer.MAX_VALUE)
            throw new RuntimeException("Test 3 failed "+bytesRead+" < "+Integer.MAX_VALUE);
        fc.close();
}
}
//51
public class func{
	public void readInFile(File file){
        buf.rewind();
        if ((read = fc.read(buf)) != -1) {
          buf.rewind();
          for (; read != 0; read--) {
            appender.append((char) buf.get());
          }
        }
        else {
          break;
        }
      fc.close();
}
}
//52
public class func{
	public void run(List<String> args){
          dataBuf.clear();
            dataRead = dataChannel.read(dataBuf);
            if (dataRead < 0) {
              break;
            }
                blockFile + "from disk at offset " + dataChannel.position() +
                ": " + StringUtils.stringifyException(e));
}
}
//53
public class func{
	public void readFully(final FileChannel src,final ByteBuffer dst,final long position){
        while(dst.remaining() > 0) {
            if(-1 == src.read(dst, position + dst.position())) {
                throw new EOFException();
            }
        }
}
}
//54
public class func{
	public void checkBytes(FileChannel fc,int off,int len,byte[] bytes){
        fc.position(off);
        if (fc.read(bb) != len)
            throw new IOException("Incomplete read");
        bb.flip();
}
}
//55
public class func{
	public void readFully(FileChannel file,long pos,ByteBuffer dst){
            do {
                int len = file.read(dst, pos);
                if (len < 0) {
                    throw new EOFException();
                }
                pos += len;
            } while (dst.remaining() > 0);
            dst.rewind();
}
}
//56
public class func{
	public void prependNewline(File file){
        FileChannel channel = raf.getChannel();
        channel.position(length - 1);
        if (channel.read(buffer) > 0) {
          buffer.rewind();
          prepend = buffer.get() != '\n';
        }
        raf.close();
}
}
//57
public class func{
	public void binDump(String filename){
                int x = ch.read(bb) ;
                if ( x < 0 )
                    break ;
                ByteBufferLib.print(bb) ;
                bb.clear() ;
}
}
//58
public class func{
	public void copy2null(FileChannel in,int buffersize){
      int n = in.read(buffer);
      if (n == -1) break;
      buffer.flip();
}
}
//59
public class func{
	public void transferFrom(final FileChannel src,final long position,final long count){
                final Pooled<ByteBuffer> pooled = exchange.getConnection().getBufferPool().allocate();
                ByteBuffer buffer = pooled.getResource();
                    int res = src.read(buffer);
                    if (res <= 0) {
                        return res;
                    }
                    buffer.flip();
                    return write(buffer);
                    pooled.free();
}
}
//60
public class func{
	public void readFully(FileChannel file,long pos,ByteBuffer dst){
            do {
                int len = file.read(dst, pos);
                if (len < 0) {
                    throw new EOFException();
                }
                pos += len;
            } while (dst.remaining() > 0);
}
}
//61
public class func{
	public void readFully(FileChannel channel,ByteBuffer dst){
        do {
            int r = channel.read(dst);
            if (r < 0) {
                throw new EOFException();
            }
        } while (dst.remaining() > 0);
}
}
//62
public class func{
	public void genericTest(){
                int read = c.read(bleck, offset);
                if (read < 0)
                    throw new Exception("Read failed");
            long newPosition = c.position();
}
}
//63
public class func{
	public void touch(FileChannel in,int buffersize){
      int n = in.read(buffer);
      if (n == -1) break;
      byte[] result = buffer.array();
}
}
//64
public class func{
	public void read(FileChannel fileChannel,ByteBuffer buffer,int length){
         int newRead = fileChannel.read(buffer);
         if (newRead < 0) {
            return false;
         }
}
}
//65
public class func{
	public void readSoup(String file,SoupReaderInterface proc){
        bb.rewind();
        int nr = fc.read(bb);
        if (nr < bufferSize)
          hasNext = false;
}
}
//66
public class func{
	public void readFileChannelFully(FileChannel fileChannel,ByteBuffer byteBuffer,int off,int len,boolean throwOnEof){
      int ret = fileChannel.read(byteBuffer);
      if ( ret < 0 ) {
        if (throwOnEof) {
          throw new IOException( "Premeture EOF from inputStream");
        } else {
          return dataRead;
        }
      }
}
}
//67
public class func{
	public void isFilePortionNull(int startByte,int endByte){
            fis = new FileInputStream(file);
            fc = fis.getChannel();
            fc.position(startByte);
            ByteBuffer bb = ByteBuffer.allocateDirect(endByte - startByte);
            fc.read(bb);
            while(bb.hasRemaining())
            {
                if(bb.get()!=0)
                {
                    return false;
                }
            }
}
}
//68
public class func{
	public void update(File inputFile,MetaFileReader mfr,RangeLoader rangeLoader,MakeContext mc,File newFile){
            log.trace("number of map entries: " + mc.fileMap.length);
            for (int i = 0; i < mc.fileMap.length; i++) {
                mc.fileOffset = mc.fileMap[i];
                if (mc.fileOffset != -1) {
                    log.trace("  read block from local file: " + mc.fileOffset);
                    rChannel.read(buffer, mc.fileOffset);
                    buffer.flip();
                    wChannel.write(buffer);
                    buffer.clear();
                } else {
                    log.trace("   read block from remote file");
                    if (!mc.rangeQueue) {
                        rangeList = rangeLookUp(i, mfr.getBlocksize(), mc);
                        range = rangeList.size();
                        data = rangeLoader.get(rangeList);
                        //System.out.println("got data length: " + data.length);
                    } else {
                        log.trace("     already have queued ranges: " + rangeList.size());
                    }
                    blockLength = calcBlockLength(i, mfr.getBlocksize(), (int) mfr.getLength());
                    int offset = (range - rangeList.size()) * mfr.getBlocksize();
                    //System.out.println("blockLength: " + blockLength + " data.length: " + data.length + "  offset: " + offset);
                    buffer.put(data, offset, blockLength);
                    buffer.flip();
                    wChannel.write(buffer);
                    buffer.clear();
                    rangeList.remove(0);
                    if (rangeList.isEmpty()) {
                        mc.rangeQueue = false;
                    }
                }
            }
}
}
//69
public class func{
	public void timeReadCD(String filename,Stat stat){
out:while (pos < fileSizeBytes) {
      file.seek( pos);
      int nelems = file.readInt();
      ByteBuffer bbuff = ByteBuffer.allocateDirect( nelems * 4);
      IntBuffer ibuff = bbuff.asIntBuffer();
      channel.read(bbuff);
      int[] data = new int[nelems]; // another copy !!
      ibuff.get(data);
      for (int j=0; j<nelems; j++) {
        if (data[j] != j) {
          System.out.println(" bad at pos "+pos+" file= "+filename);
          break out;
        }
      }
      pos += (nelems + 1) * 4;
      nreads++;
    }
    channel.close();
}
}
//70
public class func{
	public void read(){
      ByteBuffer buffer = ByteBuffer.allocateDirect((int) cacheFile.length());
      buffer.order(ByteOrder.BIG_ENDIAN);
      int j = channel.read(buffer);
      if (j != buffer.capacity())
        throw new IOException("Could not read index in one go, only "+j+" out of "+buffer.capacity()+" read");
      buffer.flip();
      header = new Header(buffer);
}
}
//71
public class func{
	public void readFailure(File failureFile){
            FileChannel channel = rwFile.getChannel();
            byte[] data = new byte[(int) channel.size()];
            int readData = channel.read( ByteBuffer.wrap( data ) );
            channel.close();
            return readData <= 0 ? "" : new String( withoutZeros( data ), "utf-8" );
}
}
//72
public class func{
	public void buildTree(RandomAccessFile raf,boolean closeExit){
                headerBuffer.clear();
                fc.read(headerBuffer);
                headerBuffer.rewind();
                    boxHeader.update(headerBuffer);
                    if (moovNode != null & mdatNode != null) {
                        NullPadding np = new NullPadding(fc.position() - Mp4BoxHeader.HEADER_LENGTH, fc.size());
                        DefaultMutableTreeNode trailingPaddingNode = new DefaultMutableTreeNode(np);
                        rootNode.add(trailingPaddingNode);
                        //logger.warning(ErrorMessage.NULL_PADDING_FOUND_AT_END_OF_MP4.getMsg(np.getFilePos()));
                        break;
                    } else {
                        //File appears invalid
                        throw ne;
                    }
}
}
//73
public class func{
	public void getIPBans(){
    if (!data.exists()) {
      return d;
    }
      fin = new FileInputStream(data.getPath());
      chan = fin.getChannel();
      long size = chan.size();
      buf = ByteBuffer.allocateDirect((int) size);
      chan.read(buf);
}
}
//74
public class func{
	public void setStatusFromFile(FileChannel channel){
                buffer = ByteBuffer.wrap(new byte[(int) channel.size()]);
                channel.read(buffer);
            buffer.position(0);
            long onDiskVersion = buffer.getLong();
            if (version != onDiskVersion)
            {
                CRC32 crc32 = new CRC32();
                crc32.update((int) (onDiskVersion >>> 32) & 0xFFFFFFFF);
                crc32.update((int) (onDiskVersion >>> 0) & 0xFFFFFFFF);
                int size = buffer.getInt();
                crc32.update(size);
                LinkedHashMap<String, IndexEntry> newIndexEntries = new LinkedHashMap<String, IndexEntry>();
                // Not all state is saved some is specific to this index so we
                // need to add the transient stuff.
                // Until things are committed they are not shared unless it is
                // prepared
                for (int i = 0; i < size; i++)
                {
                    String indexTypeString = readString(buffer, crc32);
                    IndexType indexType;
                    try
                    {
                        indexType = IndexType.valueOf(indexTypeString);
                    }
                    catch (IllegalArgumentException e)
                    {
                        throw new IOException("Invalid type " + indexTypeString);
                    }

                    String name = readString(buffer, crc32);

                    String parentName = readString(buffer, crc32);

                    String txStatus = readString(buffer, crc32);
                    TransactionStatus status;
                    try
                    {
                        status = TransactionStatus.valueOf(txStatus);
                    }
                    catch (IllegalArgumentException e)
                    {
                        throw new IOException("Invalid status " + txStatus);
                    }

                    String mergeId = readString(buffer, crc32);

                    long documentCount = buffer.getLong();
                    crc32.update((int) (documentCount >>> 32) & 0xFFFFFFFF);
                    crc32.update((int) (documentCount >>> 0) & 0xFFFFFFFF);

                    long deletions = buffer.getLong();
                    crc32.update((int) (deletions >>> 32) & 0xFFFFFFFF);
                    crc32.update((int) (deletions >>> 0) & 0xFFFFFFFF);

                    byte deleteOnlyNodesFlag = buffer.get();
                    crc32.update(deleteOnlyNodesFlag);
                    boolean isDeletOnlyNodes = deleteOnlyNodesFlag == 1;

                    if (!status.isTransient())
                    {
                        newIndexEntries.put(name, new IndexEntry(indexType, name, parentName, status, mergeId, documentCount, deletions, isDeletOnlyNodes));
                    }
                }
                long onDiskCRC32 = buffer.getLong();
                if (crc32.getValue() == onDiskCRC32)
                {
                    for (IndexEntry entry : indexEntries.values())
                    {
                        if (entry.getStatus().isTransient())
                        {
                            newIndexEntries.put(entry.getName(), entry);
                        }
                    }
                    version = onDiskVersion;
                    indexEntries = newIndexEntries;
                }
                else
                {
                    throw new IOException("Invalid file check sum");
                }
            }
}
}
//75
public class func{
	public void testRead_ReadableByteChannel(){
        final FileInputStream fileInputStream = new FileInputStream(m_testFile);
        final FileChannel input = fileInputStream.getChannel();
            assertEquals(FILE_SIZE, IOUtils.read(input, buffer));
            assertEquals(0, IOUtils.read(input, buffer));
            assertEquals(0, buffer.remaining());
            assertEquals(0, input.read(buffer));
            buffer.clear();
                IOUtils.readFully(input, buffer);
}
}
