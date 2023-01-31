//13
public class func{
	public void readFromStream(InputStream is){
          int c = br.read();
          if ( c < 0 ) break;
          if ( c == ' ' )
          {
            if ( negative ) n = -n;
            short val = n < -250 ? Short.MIN_VALUE : (short)(n*4);

            eval_array[ (nrows-1-row)*ncols + col ] = val;
            if (++col == ncols )
            {
              col = 0;
              ++row;
            }
            n = 0;
            negative = false;
          }
          else if ( c >= '0' && c <= '9' )
          {
            n = 10*n + (c-'0');
          }
          else if ( c == '-' )
          {
            negative = true;
          }
}
}
