//14
public class func{
public void maltSVMFormat2OriginalSVMFormat(InputStreamReader isr,OutputStreamWriter osw,int[] cardinalities){
        c = in.read();
        if (c == -1) {
          break;
        }
        if (c == '\t' || c == '|') {
          if (j == 0) {
            out.write(Integer.toString(code));
            j++;
          } else {
            if (code != -1) {
              out.write(' ');
              out.write(Integer.toString(code+offset));
              out.write(":1");
            }
            if (c == '\t') {
              offset += cardinalities[j-1];
              j++;
            }
          }
          code = 0;
        } else if (c == '\n') {
          j = 0;
          offset = 1;
          out.write('\n');
          code = 0;
        } else if (c == '-') {
          code = -1;
        } else if (code != -1) {
          if (c > 47 && c < 58) {
            code = code * 10 + (c-48);
          } else {
            throw new CheaterException("The instance file contain a non-integer value, when converting the Malt SVM format into Liblinear format.");
          }
        }  
}
}
