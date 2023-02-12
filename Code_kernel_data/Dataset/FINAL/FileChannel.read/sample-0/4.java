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
        }
      }
}
}
