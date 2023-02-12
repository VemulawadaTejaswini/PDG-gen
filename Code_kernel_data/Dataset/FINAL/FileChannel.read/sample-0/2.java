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
