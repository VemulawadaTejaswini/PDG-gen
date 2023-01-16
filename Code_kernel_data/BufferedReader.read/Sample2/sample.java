//0
public class func{
	public void parseAwfulCSV(BufferedReader reader,boolean header){
        if (ch == '\"') {
          insideQuote = true;

        } else if (ch == '\r' || ch == '\n') {
          if (ch == '\r') {
            // check to see if next is a '\n'
            reader.mark(1);
            if (reader.read() != '\n') {
              reader.reset();
            }
          }
          setString(row, col, new String(c, 0, count));
          count = 0;
          if (row == 0 && header) {
            // Use internal row removal (efficient because only one row).
            removeTitleRow();
            // Un-set the header variable so that next time around, we don't
            // just get stuck into a loop, removing the 0th row repeatedly.
            header = false;
          }
          row++;
          col = 0;

        } else if (ch == ',') {
          setString(row, col, new String(c, 0, count));
          count = 0;
          // starting a new column, make sure we have room
          col++;
          ensureColumn(col);

        } else {  // just a regular character, add it
          if (count == c.length) {
            c = PApplet.expand(c);
          }
          c[count++] = (char) ch;
        }
}
}
//1
public class func{
	public void readLines(InputStream is2,String encoding){
        int c= reader.read();
        if (c == -1)
          break;
        sb.append((char)c);
        if (c == '\r') {  // single CR or a CR followed by LF
          c= reader.read();
          if (c == -1)
            break;
          sb.append((char)c);
          if (c == '\n') {
            list.add(sb.toString());
            sb= new StringBuffer();
          }
        } else if (c == '\n') {  // a single LF
          list.add(sb.toString());
          sb= new StringBuffer();
        }
}
}
//2
public class func{
	public void readLines(final InputStream is2,final String encoding){
                int c = reader.read();
                if (c == -1) {
                    break;
                }
                sb.append((char) c);
                if (c == '\r') { // single CR or a CR followed by LF
                    c = reader.read();
                    if (c == -1) {
                        break;
                    }
                    sb.append((char) c);
                    if (c == '\n') {
                        list.add(sb.toString());
                        sb = new StringBuffer();
                    }
                } else if (c == '\n') { // a single LF
                    list.add(sb.toString());
                    sb = new StringBuffer();
                }
}
}
//3
public class func{
	public void readName(final BufferedReader r){
      r.mark(1);
      int c = r.read();
      if (c < 0) {
        throw new IOException("Unexpected end of config file.");
      } else if ('=' == c) {
        break;
      } else if (' ' == c || '\t' == c) {
        for (;;) {
          r.mark(1);
          c = r.read();
          if (c < 0) {
            throw new IOException("Unexpected end of config file.");
          } else if ('=' == c) {
            break;
          } else if (';' == c || '#' == c || '\n' == c) {
            r.reset();
            break;
          } else if (' ' == c || '\t' == c) {
            // Skipped...
          } else {
            throw new IOException("Bad entry delimiter.");
          }
        }
        break;
      } else if (Character.isLetterOrDigit((char) c) || c == '-') {
        // From the git-config man page:
        //     The variable names are case-insensitive and only
        //     alphanumeric characters and - are allowed.
        name.append((char) c);
      } else if ('\n' == c) {
        r.reset();
        name.append((char) c);
        break;
      } else {
        throw new IOException("Bad config entry name: " + name + (char) c);
      }
    return name.toString();
}
}
//4
public class func{
	public void getFromMetaData(Reader xml){
                if (ch == '<') {
                    ch = in.read();
                    if (ch == -1)
                        break read;
                }
            if (last2 == '<' && last == '!' && ch == '-') {
                comment = true;
                continue;
            }
            if (ch != '<')
                continue;
            ch = readThroughWhitespace(in);
            if (ch == '/' || ch == '!' || ch == '?')
                continue;
            token = readElementToken(ch, in);
            switch (token) {
                case TOKEN_EOF:
                    break read;
                case TOKEN_PACKAGE:
                    pkg = readAttribute(in, _packageAttr);
                    if (pkg == null)
                        break read;
                    break;
                case TOKEN_PACKAGE_NOATTR:
                    pkg = readElementText(in);
                    if (pkg == null)
                        break read;
                    ch = '<'; // reading element text reads to next '<'
                    break;
                case TOKEN_CLASS:
                    name = readAttribute(in, _classAttr);
                    if (name == null)
                        break read;
                    if (pkg.length() > 0 && name.indexOf('.') == -1)
                        names.add(pkg + "." + name);
                    else
                        names.add(name);
                    break;
                case TOKEN_CLASS_NOATTR:
                    name = readElementText(in);
                    if (name == null)
                        break read;
                    ch = '<'; // reading element text reads to next '<'
                    if (pkg.length() > 0 && name.indexOf('.') == -1)
                        names.add(pkg + "." + name);
                    else
                        names.add(name);
                    break;
            }
}
}
//5
public class func{
	public void run(){
                truc=br.read();
                if(truc!=-1){
                  if(((char)truc)!='\n'){
                    str+=(char)truc;
                  }else{
                    System.out.println(str);
                    str="";
                  }
                }
              while((truc=br.read())!=-1){
                if(truc!=10){
                  str+=(char)truc;
                }else{
                  System.out.println(str);
                  str="";
                }
              }
              br.close();
}
}
//6
public class func{
	public void readUntilDelimiter(final BufferedReader inputStream){
      ci = inputStream.read();
      if (ci == -1) {
        System.err.println("Socket already closed by server \n");
        inputStream.close();
        throw new IOException();
      } else {
        c = (char) ci;
        if (c == '#' && canc == false) { // Found first #
          response.append(c);
          canc = true;
        } else if (c == '#') { // Found second # command terminated
                    // correctly EXIT
          response.append(c);
          break;
        } else if (c != '#') { // Append char and start again finding
                    // the first #
          response.append(c);
          canc = false;
        }
      }
    return response.toString();
}
}
//7
public class func{
	public void parseMessage(BufferedReader reader){
            int ch = skipWhitespace(reader);
            while (ch != ']') {
                if (ch < 0) {
                    throw new InvalidMessageException("Unexpected end-of-message.");
                }

                if (ch == '[') {
                    ArrayList<TalkMessageEntry> childEntries = parseMessage(reader);
                    entries.add(new TalkMessageEntry(MessageEntryKind.ME_TALKMESSAGE,
                            new TalkMessage(childEntries)));
                } else if (ch == '\"' || ch == '\'') {
                    String stringValue = parseStringValue(reader, (char) ch);
                    entries.add(new TalkMessageEntry(MessageEntryKind.ME_STRING, stringValue));
                } else if (ch == ',') {
                    // blank entry
                    entries.add(new TalkMessageEntry(MessageEntryKind.ME_EMPTY, null));
                } else if (ch == 'n' || ch == 'N') { //'n' as in "null" or "Null":
                    // blank entry
                    ch=reader.read(); //'u'
                    ch=reader.read(); //'l'
                    ch=reader.read(); //'l'
                    entries.add(new TalkMessageEntry(MessageEntryKind.ME_EMPTY, null));
                } else {
                    // we assume it's a number
                    long numValue = parseNumberValue(reader, (char) ch);
                    entries.add(new TalkMessageEntry(MessageEntryKind.ME_NUMBER, numValue));
                }

                //We expect a comma next, or the end of the message
                if (ch != ',') {
                    ch = skipWhitespace(reader);
                }

                if (ch != ',' && ch != ']') {
                    throw new InvalidMessageException("Expected , or ], found "+((char) ch));
                } else if (ch == ',') {
                    ch = skipWhitespace(reader);
                }
            }
}
}
//8
public class func{
	public void getWordCounts(InputStream inputStream){
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while ((current = bufferedReader.read()) != -1) {
                wordCounts.byteCount++;
                wordCounts.charCount++;

                // line handling
                // if the previous read was a new line, skip the next newline feed
                boolean isSkipNewlineFeed = skipNextLineFeed && current == '\n';
                skipNextLineFeed = false;
                if (isSkipNewlineFeed) {
                    continue;
                }

                boolean eol = (current == '\n' || current == '\r');
                if (eol) {
                    wordCounts.lineCount++;
                    // store the state to skip the next newline feed if required
                    if (current == '\r') {
                        skipNextLineFeed = true;
                    }
                }

                // word handling
                boolean isCurrentWhitespace = Character.isWhitespace(current);
                if (!isCurrentWhitespace && previouslyWhitespace) {
                    wordCounts.wordCount++;
                }
                previouslyWhitespace = isCurrentWhitespace;
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
}
}
//9
public class func{
	public void readFileToString(String fileName){
        if (fileName.equals(ERROR_OUTPUT)) {
            return getErrorOutput();
        } else if (fileName.equals(NOTICE_OUTPUT)) {
            return getNoticeOutput();
        } else if (fileName.equals(WARNING_OUTPUT)) {
            return getWarningOutput();
        } else if (fileName.equals(STANDARD_OUTPUT)) {
            return getStandardOutput();
        }
            File file = new File(fileName);
            if ( !file.exists() ) {
                System.out.println("\n" + "FILE DOES NOT EXIST: " + fileName);
            }
            BufferedReader in = new BufferedReader(new FileReader(file));
            char[] allChars = new char[(int)file.length()];
            in.read(allChars, 0, (int)file.length());
            in.close();
}
}
//10
public class func{
	public void readSourceValues(BufferedReader reader,OpenIntIntHashMap sourceIndices){
        while ((ch = reader.read()) != -1)
        {
            if (Character.isWhitespace(ch))
            {
                if (r != 0)
                {
                    originalVarNames.put(r, r);
                    r = r * sign;
                    sourceValues.add(r);
                    
                    r = 0;
                    sign = 1;
                }
                continue;
            }
            if (ch == '0' && r == 0)
            {
                sourceValues.add(0);
                continue;
            }
            if (ch == '-')
            {
                sign = -1;
            }

            if ('0' <= ch && ch < '0' + 10)
            {
                r = r * 10 + ch - '0';
            } 
        }
}
}
//11
public class func{
	public void readName(final BufferedReader r){
          r.mark(1);
          c = r.read();
          if (c < 0) {
            throw new IOException("Unexpected end of config file.");
          } else if ('=' == c) {
            break;
          } else if (';' == c || '#' == c || '\n' == c) {
            r.reset();
            break;
          } else if (' ' == c || '\t' == c) {
            // Skipped...
          } else {
            throw new IOException("Bad entry delimiter.");
          }
}
}
//12
public class func{
	public void readQualifiers(final Reader in_stream,final EntryInformation entry_information){
      name = StreamQualifier.readName (buffered_reader);
      if (name == null) {
        // end of file/stream
        break;
      }
      buffered_reader.mark (1);
      final int next_char = buffered_reader.read ();
      if (next_char == -1) {
        value = null;
      } else {
        if (next_char == '=') {
          value = StreamQualifier.readValue (buffered_reader);
        } else {
          // this qualifier doesn't have a value
          value = null;
          buffered_reader.reset ();
        }
      }
      if (value == null) {
        new_qualifier = new Qualifier (name);
      } else {
        new_qualifier =
          StreamQualifier.makeStreamQualifier (name, value,
                                               entry_information);
      }
      return_vector.addQualifierValues (new_qualifier);
}
}
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
//15
public class func{
	public void readPostData(BufferedReader ir,BufferedWriter bw,String id){
          if (!ir.ready()) {
            try { Thread.sleep(1000); } catch( Exception e ) {}
            if ( !ir.ready() ) break;
          }
          int c = ir.read();
          if ( c == -1) break;
          bw.write( c );
}
}
//16
public class func{
	public void readLine(BufferedReader inReader2){
        if (inReader2.ready()) {
          int c = inReader2.read();
          if (c == '\n') {
            return str.toString();
          }
          if (c != '\r') {
            str.append((char)c);
          }
        } else {
          try {
            Thread.sleep(500);
          } catch (InterruptedException e) {
            throw new InterruptedIOException();
          }
        }
}
}
//17
public class func{
	public void fromRangeReader(BufferedReader rangeFile){
            if(rangeFile.read() == 'x') {
                rangeFile.readLine();    // pass the '\n' after 'x'
                String line = rangeFile.readLine();
                if (line == null) {
                    line = "";
                }
                StringTokenizer st = new StringTokenizer(line);
                double scaledLowerBound = Double.parseDouble(st.nextToken());
                double scaledUpperBound = Double.parseDouble(st.nextToken());
                if(scaledLowerBound != 0 || scaledUpperBound != 1) {
                    throw new RuntimeException("Feature lower bound and upper bound must"
                            + "be set in range file to resepctively 0 and 1");
                }
                String restore_line = null;
                List<FeatureLimits> limits = new ArrayList<FeatureLimits>();
                while((restore_line = rangeFile.readLine())!=null)
                {
                    StringTokenizer st2 = new StringTokenizer(restore_line);
                    st2.nextToken(); //discard feature index
                    feature_min = Double.parseDouble(st2.nextToken());
                    feature_max = Double.parseDouble(st2.nextToken());
                    FeatureLimits newLimit = new FeatureLimits(feature_min, feature_max);
                    limits.add(newLimit);
                }

                FeatureVectorScalerImpl scaler = new FeatureVectorScalerImpl(limits.size(), scaledLowerBound, scaledUpperBound);
                scaler.setStrategy(new LinearScaling());
                scaler.setFeatureLimits(limits);

                return scaler;
            } else {
                throw new RuntimeException("y scaling not supported");
            }
}
}
//18
public class func{
	public void checkFor(String str,BufferedReader b,BufferedWriter o){
      b.mark(str.length()+1);
      char[] buffer = new char[str.length()];
      int read = b.read(buffer);
      if (read == -1) {
        b.reset();
        return false;
      }
      if (new String(buffer, 0, read).toLowerCase().equals(str.toLowerCase())) {
        if (o != null) o.write(buffer, 0, read);
        return true;
      } else {
        b.reset();
        return false;
      }
        b.reset();
}
}
//19
public class func{
	public void getAnswer(BufferedReader in,PrintWriter out,String command){
        log(Level.TRACE, "status code: %d", statuscode);
        if((statuscode != 200 && statuscode != 500) || size < 1) {
            log(Level.ERROR, "communication error, code: %d, byte expected: %d", statuscode, size);
            return new BufferedReader(new CharArrayReader(new char[0]));
        }
        int readchar = in.read(cbuf);
        if( readchar != size ) {
            log(Level.ERROR, "read failed, not enough byte, got %d expected %d", readchar, size);
            return new BufferedReader(new CharArrayReader(new char[0]));
        }
        in.readLine();
        return new BufferedReader(new CharArrayReader(cbuf));
}
}
//20
public class func{
	public void compare(String file1,String file2,BufferedReader in1,BufferedReader in2){
      String s2 = in2.readLine();
      if (!s1.equals(s2)) {
        System.out.println(
          "Files [" + file1 + "] and [" + file2 + "] differ on line "
          + lineCounter);
        System.out.println("One reads:  [" + s1 + "].");
        System.out.println("Other reads:[" + s2 + "].");
        outputFile(file1);
        outputFile(file2);

        return false;
      }
    if (in2.read() != -1) {
      System.out.println(
        "File [" + file2 + "] longer than file [" + file1 + "].");
      outputFile(file1);
      outputFile(file2);

      return false;
    }
}
}
//21
public class func{
	public void findLineColumnOfOffset(String filepath,int offset){
        if (!bfr.ready())
          break;
        int ch = bfr.read();
        if (ch == 10) {
          line++;
          newlineOffset = count - 1;
        }
      bfr.close();
}
}
//22
public class func{
	public void readInputStreamToString(Socket socket){
        while ((line = bufferedReader.readLine()) != null) {
            if (line.startsWith("Content-Length")) {
                contentLength = Integer.parseInt(line.split(":")[1].trim());
            }
            if (line.length() == 0) {

                if (contentLength != null) {
                    result.append('\n');
                    for (int position = 0; position < contentLength; position++) {
                        result.append((char) bufferedReader.read());
                    }
                }
                break;
            }
            result.append(line).append('\n');
        }
}
}
//23
public class func{
	public void load(InputStreamReader isr){
      BufferedReader bin = new BufferedReader(isr);
      bin.mark(2);
      if (bin.read() == '\t') {
        bin.reset();
        loadHeader(bin);
      } else {
        bin.reset();
      }
      while ((fileLine = bin.readLine()) != null) {
        if (fileLine.length() > 0) {
          table = addSymbolTable(fileLine);
          table.load(bin);
        }
      }
      bin.close();
}
}
//24
public class func{
	public void updateConsoleLog(File dest,InputStream in,LineListener lineListener){
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            while ((hasRead = reader.read(data, offset, data.length - offset)) != -1) {
                end = offset + hasRead;
                overflowIndex = end;
                for (int i = end; i > 0; i--) {
                    int index = i - 1;
                    char c = data[index];
                    if ('\n' == c) {
                        break;
                    }
                    overflow[index] = data[index];
                    overflowIndex = index;
                }
                if (overflowIndex == 0) {
                    if (end == data.length) {//realloc if line is bigger than our buffer
                        data = realloc(data);
                        overflow = realloc(overflow);
                        offset = end;
                        continue;
                    } else {
                        overflowIndex = end;
                        offset = 0;
                    }
                }
                lineListener.copyLine(new CharArraySequence(data, 0, overflowIndex));
                writer.write(data, 0, overflowIndex);
                //place overflow back in data
                for (int i = overflowIndex; i < end; i++) {
                    data[i - overflowIndex] = overflow[i];
                }
                offset = end - overflowIndex;
            }
}
}
//25
public class func{
	public void readName(final BufferedReader buffered_reader){
    while ((current_char = buffered_reader.read ()) != -1 &&
           0 != current_char    // Kaffe 1.00 returns 0 at end of string
           ) {
      if (' ' == current_char ||
          '\n' == current_char ||
          '\r' == current_char ||
          '\t' == current_char) {
        // read a whitespace character so go back to the top of the loop
        continue;
      } else {
        if ('/' == current_char) {
          // we have found the start of the qualifier name
          break;
        } else {
          // if the character isn't a / or space then something is wrong
          throw new QualifierParseException ("failed to read a qualifier " +
                                             "name from this string: " +
                                             (char)current_char +
                                             buffered_reader.readLine ());
        }
      }
    }
    if (-1 == current_char ||
        0 == current_char       // Kaffe 1.00 returns 0 at end of string
        ) {
      // end of file
      return null;
    }
    buffered_reader.mark (1);
}
}
//26
public class func{
	public void accept(final File parentDir,final String fileName){
        final File descriptionFile = new File(parentDir, fileName);
        if (PCGFile.isPCGenListFile(descriptionFile))
        {
          BufferedReader descriptionReader = null;

          try
          {
            if (descriptionFile.exists())
            {
              final char[] inputLine;

              // final BufferedReader descriptionReader = new
              // BufferedReader(new FileReader(descriptionFile));
              descriptionReader = new BufferedReader(new InputStreamReader(new FileInputStream(
                  descriptionFile), "UTF-8"));

              final int length = (int) descriptionFile.length();
              inputLine = new char[length];
              descriptionReader.read(inputLine, 0, length);
              setDescriptionLst(getDescriptionLst() + new String(inputLine));
            }
          } catch (IOException exception)
          {
            Logging.errorPrint("IOException in PlayerCharacter.loadDescriptionFilesInDirectory", exception);
          } finally
          {
            if (descriptionReader != null)
            {
              try
              {
                descriptionReader.close();
              } catch (IOException e)
              {
                Logging.errorPrint(
                    "Couldn't close descriptionReader in PlayerCharacter.loadDescriptionFilesInDirectory",
                    e);

                // Not much to do...
              }
            }
          }
        } else if (parentDir.isDirectory())
        {
          loadDescriptionFilesInDirectory(parentDir.getPath() + File.separator + fileName);
        }
}
}
//27
public class func{
	public void createStatistics(BufferedReader br,ArrayList<Integer> file){
            if (tmp == (char) 0 || tmp >= 256) {
                out.close();
                throw new InvalidCharacterException();
            }
            tmp = br.read();
            if (tmp == -1) {
                charStats[0]++;
                file.add(0);
            } else
                file.add(tmp);
}
}
//28
public class func{
	public void tokenize(final Reader reader){
            while (br.read(buffer) == 1)
            {
                final char c = buffer[0];

                //
                if (!this.isTokenMember(c))
                {
                    if (text.length() > 0)
                    {
                        result.add(new DefaultToken(text.toString(), start));
                        text = new StringBuilder();
                    }

                    start = index + 1;
                }
                else
                {
                    // This is a part of the current token, so add it.
                    text.append(c);
                }

                index++;
            }
            if (text.length() > 0)
            {
                result.add(new DefaultToken(text.toString(), start));
            }
}
}
//29
public class func{
	public void CalculatePercent(String inputFile,PrintWriter pw){
            while ((inRead = bfr.read()) != -1) {
                fRead = (char) inRead;
                if ((!(fRead == 'A' || fRead == 'T' || fRead == 'C' || fRead == 'G' || fRead == 'N'))
                        && (!(fRead == 'a' || fRead == 't' || fRead == 'c' || fRead == 'g' || fRead == 'n'))) continue;

                sequenceWindow.add(fRead);
                if (sequenceWindow.size() == windowSize) {
                    inWindow = 0;
                    for (char aSequenceWindow : sequenceWindow) {
                        if (aSequenceWindow == 'G' || aSequenceWindow == 'C') inWindow++;
                    }
                    if (inWindow == 0) {
                        pw.println("0.0");
                    } else {
                        result = ((double) inWindow / (double) windowSize) * 100;
                        pw.println(String.format("%.2f", result));
                    }
                    for (int i = 0; i < windowStep; i++)
                        sequenceWindow.remove();
                }
            }
}
}
//30
public class func{
	public void getContent(HttpURLConnection connection,StringBuilder builder){
            do
            {
                wasRead = reader.read(buffer, 0, 1024);
                if (wasRead > 0)
                    builder.append(buffer, 0, wasRead);
            }
            while (wasRead > -1);
            if (reader != null) {
                reader.close();
            }
}
}
//31
public class func{
	public void determineEncoding(String filename){
            int c = br.read();
            if (c == -1) {
                throw new IllegalStateException("No XML declaration found in file " + filename);
            }
            sb.append((char) c);
            if (c == '>') {
                break;
            }
        br.close();
}
}
//32
public class func{
	public void init(){
                    int ch = reader.read();
                    if ((ch < 0) || (ch == '\n'))
                        break;
                    buffer.append((char) ch);
                String line = buffer.toString();
                if (line.length() < 1)
                    break;
                for (int i = 0; i < tokens.length; i++)
                    tokens[i] = null;
                while (n < tokens.length) {
                    String token = null;
                    int colon = line.indexOf(':');
                    if (colon >= 0) {
                        token = line.substring(0, colon);
                        line = line.substring(colon + 1);
                    } else {
                        token = line;
                        line = "";
                    }
                    tokens[n++] = token;
                }
}
}
//33
public class func{
	public void readDocumentsRaw(String fn){
        ch = br.read(); // preserving linebreaks
        if (ch > -1) text.append((char)ch);
        if (ch > -1 && ch != '\n') continue;
}
}
//34
public class func{
	public void readErrorPage(HttpURLConnection connection){
          int chars = reader.read(cbuf);
          if (chars == -1) {
            break;
          }
          sb.append(cbuf, 0, chars);
          if (sb.length()== 0) {
            return null;
          }
      return sb.toString();
}
}
//35
public class func{
	public void readEmbedding(BufferedReader reader,int size){
        ch = reader.read();
        if (ch == -1) return null;
        if (CharUtils.isWhiteSpace((char)ch)) break;
        else buffer[b++] = ch;
}
}
//36
public class func{
	public void readWholeFile(String file){
                cnt = br.read(buf, 0, 65535);
                if (cnt == -1)
                    break;
                if (cnt > 0) {
                    strBuf.append(buf, 0, cnt);
                }
}
}
//37
public class func{
	public void consumeHeader(final BufferedReader reader){
            reader.mark(READ_AHEAD_LIMIT);
            int character = reader.read();
            if (character >= 0) {
                if (character == '<') {
                    reader.reset();
                    logger.info("readHeader() Complete");
                    break;
                }
            } else {
                break;
            }
}
}
//38
public class func{
	public void parseAwfulCSV(BufferedReader reader,boolean header){
        if (ch == '\"') {
          // this is either the end of a quoted entry, or a quote character
          reader.mark(1);
          if (reader.read() == '\"') {
            // it's "", which means a quote character
            if (count == c.length) {
              c = PApplet.expand(c);
            }
            c[count++] = '\"';
          } else {
            // nope, just the end of a quoted csv entry
            reader.reset();
            insideQuote = false;
            // TODO nothing here that prevents bad csv data from showing up
            // after the quote and before the comma...
//            set(row, col, new String(c, 0, count));
//            count = 0;
//            col++;
//            insideQuote = false;
          }
        } else {  // inside a quote, but the character isn't a quote
          if (count == c.length) {
            c = PApplet.expand(c);
          }
          c[count++] = (char) ch;
        }
}
}
//39
public class func{
	public void read(String path){
        int length = reader.read(data, offset, size - offset);
        if (length == -1) {
          break;
        }
        if (length == 0) {
          char[] newData = new char[size * 2];
          System.arraycopy(data, 0, newData, 0, size);
          data = newData;
        } else {
          offset += length;
        }
}
}
//40
public class func{
	public void loadModel(Reader inputReader){
                    int ch = reader.read();
                    if (ch == -1) {
                        throw new EOFException("unexpected EOF");
                    }
                    if (ch == ' ') {
                        model.w[i * nr_w + j] = atof(new String(buffer, 0, b));
                        break;
                    } else {
                        buffer[b++] = ch;
                    }
}
}
//41
public class func{
	public void getInputStreamAsCharArray(InputStream stream,int length,String encoding){
        int current = reader.read();
        if (current < 0) break;
        amountRequested = Math.max(stream.available(), DEFAULT_READING_SIZE);  // read at least 8K
        if (totalRead + 1 + amountRequested > contents.length)
          System.arraycopy(contents,   0,   contents = new char[totalRead + 1 + amountRequested], 0, totalRead);
}
}
//42
public class func{
	public void getWordsFromInput(String inputFile){
            BufferedReader input = new BufferedReader(new FileReader(inputFile));
            for (int charByte = input.read(); charByte >= 0; charByte = input.read()) {
                char readChar = (char)charByte;

                if (readChar == '\r') { // ignore \r
                } else if (readFirstLine) {
                    lines.append(readChar);
                } else {
                    if (readChar == '\n') {
                        readFirstLine = true;
                        continue;
                    }

                    firstLine.append(readChar);
                }
            }
            input.close();
}
}
//43
public class func{
	public void getMediaType(BufferedReader br){
                br.mark(READ_AHEAD_LIMIT);
                    for (int i = 0; c != -1 && i < READ_AHEAD_LIMIT; i++) {
                        c = (char) br.read();
                        if (c == '[' || c == '{') {
                            return Constants.APPLICATION_JSON;
                        }else if (c == '<'){
                    return Constants.APPLICATION_XML;
                        }

                    }
                        br.reset();
}
}
//44
public class func{
	public void getFromMetaData(Reader xml){
        BufferedReader in = new BufferedReader(xml);
        for (int ch = 0, last = 0, last2 = 0;
            ch == '<' || (ch = in.read()) != -1; last2 = last, last = ch) {
            // handle comments
            if (comment && last2 == '-' && last == '-' && ch == '>') {
                comment = false;
                continue;
            }
            if (comment) {
                if (ch == '<') {
                    ch = in.read();
                    if (ch == -1)
                        break read;
                }
                continue;
            }
            if (last2 == '<' && last == '!' && ch == '-') {
                comment = true;
                continue;
            }

            // if not an element start, skip it
            if (ch != '<')
                continue;
            token = TOKEN_NONE; // reset token
            last = ch; // update needed for comment detection
            ch = readThroughWhitespace(in);
            if (ch == '/' || ch == '!' || ch == '?')
                continue;

            // read element name; look for packages and classes
            token = readElementToken(ch, in);
            switch (token) {
                case TOKEN_EOF:
                    break read;
                case TOKEN_PACKAGE:
                    pkg = readAttribute(in, _packageAttr);
                    if (pkg == null)
                        break read;
                    break;
                case TOKEN_PACKAGE_NOATTR:
                    pkg = readElementText(in);
                    if (pkg == null)
                        break read;
                    ch = '<'; // reading element text reads to next '<'
                    break;
                case TOKEN_CLASS:
                    name = readAttribute(in, _classAttr);
                    if (name == null)
                        break read;
                    if (pkg.length() > 0 && name.indexOf('.') == -1)
                        names.add(pkg + "." + name);
                    else
                        names.add(name);
                    break;
                case TOKEN_CLASS_NOATTR:
                    name = readElementText(in);
                    if (name == null)
                        break read;
                    ch = '<'; // reading element text reads to next '<'
                    if (pkg.length() > 0 && name.indexOf('.') == -1)
                        names.add(pkg + "." + name);
                    else
                        names.add(name);
                    break;
            }
        }
}
}
//45
public class func{
	public void readTextFile(File file){
      do {
        c = in.read();
        if (c != -1) {
          text.append((char) c);
        }
      } while (c != -1);
      in.close();
}
}
//46
public class func{
	public void update(){
            BufferedReader reader = new BufferedReader(new InputStreamReader(in, charset));
            reader.mark(1);
            if (reader.read() != UTF8_BOM) {
                reader.reset();
            }
            ScriptReader r = new ScriptReader(reader);
}
}
//47
public class func{
	public void isWindowsScript(File file){
      BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
      int readLength = reader.read(buffer);
      if (readLength >= 2 && buffer[0] == '#' && buffer[1] == '!') {
        for(int i=2; i<readLength; ++i) {
          switch(buffer[i]) {
          case '\r':
            return true;
          case '\n':
            return false;
          }
        }
      }
}
}
//48
public class func{
	public void isWindowsScript(File file){
      reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
      int readLength = reader.read(buffer);
      if (readLength >= 2 && buffer[0] == '#' && buffer[1] == '!') {
        for(int i=2; i<readLength; ++i) {
          switch(buffer[i]) {
          case '\r':
            return true;
          case '\n':
            return false;
          }
        }
      }
}
}
//49
public class func{
	public void main(String[] args){
        reader = new BufferedReader(new
                BoundedReader(strings[3][0]), strings[3][0].length());
        reader.readLine();
        if (reader.read() != 'M')
            throw new RuntimeException("Read() failed");
        reader = new BufferedReader(new
                BoundedReader(strings[3][0]), strings[3][0].length());
}
}
//50
public class func{
	public void doPost(HttpServletRequest req,HttpServletResponse rsp){
    String query = req.getQueryString();
    if (query != null) {
      if (query.equals("sendHappyHtml")) {
        rsp.getWriter().write("<html><body><div id=':)'></div></body></html>");
        return;
      }
    }
    BufferedReader reader = req.getReader();
    reader.read(buf, 0, req.getContentLength());
}
}
//51
public class func{
	public void getGMetric(String metricName){
        Socket gangliaXMLSocket = new Socket("localhost", 8649);
        BufferedReader in = new BufferedReader(new InputStreamReader(
                gangliaXMLSocket.getInputStream()));
        int in_buff = in.read(charBuff, 0, buffSize);
        if (in_buff != -1) {
            System.out.println("End of file");
        }
        CharArrayReader car = new CharArrayReader(charBuff, 0, in_buff); // these two lines have to be here.
        BufferedReader br_car = new BufferedReader(car);
}
}
//52
public class func{
	public void readString(FSDataInputStream inputStream){
    BufferedReader reader = new BufferedReader(new InputStreamReader(
        inputStream));
    int count = reader.read(buffer, 0, BUFFER_SIZE);
    if (count > BUFFER_SIZE) {
      throw new IOException("Exceeded buffer size");
    }
    inputStream.close();
    return new String(buffer, 0, count);
}
}
//53
public class func{
	public void run(){
                            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                            BufferedReader in = new BufferedReader(new InputStreamReader( socket.getInputStream()));
                                int read = in.read(buffer);
                                if (read == TOKEN_SIZE) {
                                    inputLine = new String(buffer);
                                    if (inputLine.equals(getAccessToken())) {
                                        log.debug("Client authorized");
                                        out.println(getSystemInfo());
                                        log.debug("SystemInfo returned");
                                        setAccessToken(); // regenerate
                                     }
                                    else {
                                        log.debug("Invalid token recieved");
                                        out.println("Bye!");
                                    }
                                }
                                else {
                                    log.debug("Invalid token recieved");
                                    out.println("Bye!");
                                }
}
}
//54
public class func{
	public void pressKeyToContinue(){
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int ch = stdin.read();
        if (ch == 'y' ||
            ch == 'Y') {
            return true;
        }
}
}
//55
public class func{
	public void query(boolean longOutput,String username){
                read = input.read(__buffer, 0, __buffer.length);
                if (read <= 0) {
                    break;
                }
                result.append(__buffer, 0, read);
            input.close();
}
}
//56
public class func{
	public void slurpReader(Reader reader){
        int amountRead = r.read(chars, 0, SLURP_BUFFER_SIZE);
        if (amountRead < 0) {
          break;
        }
        buff.append(chars, 0, amountRead);
      r.close();
}
}
//57
public class func{
	public void readString(InputStream in){
      do
      {
         wasRead = reader.read(buffer, 0, 1024);
         if (wasRead > 0)
         {
            builder.append(buffer, 0, wasRead);
         }
      }
      while (wasRead > -1);
      return builder.toString();
}
}
//58
public class func{
	public void readString(InputStream in){
      do
      {
         wasRead = reader.read(buffer, 0, 1024);
         if (wasRead > 0)
         {
            builder.append(buffer, 0, wasRead);
         }
      }
      while (wasRead > -1);
      return builder.toString();
}
}
//59
public class func{
	public void readHeaderValue(String s,BufferedReader br){
        br.mark(1);
        if (br.read() == ' ')
          s += br.readLine();
        else
          {
            br.reset();
            try_next = false;
          }
}
}
//60
public class func{
	public void TagComparator(BufferedReader in){
            int result = in.read();
            if (result >= 0) {
                sb.append((char) result);
            } else {
                generateAtoms(sb.toString());
                allRead = true;
            }
}
}
//61
public class func{
	public void getReader(String alias,boolean recycle,boolean firstLineIsNames){
                    reader.mark(1);
                    int peek = reader.read();
                    if (peek == -1) { // already at EOF
                        reader.close();
                        reader = createBufferedReader(fileEntry);
                        fileEntry.inputOutputObject = reader;
                        if (firstLineIsNames) {
                            // read first line and forget
                            reader.readLine();
                        }                
                    } else { // OK, we still have some data, restore it
                        reader.reset();
                    }
}
}
//62
public class func{
	public void read(InputStream stream){
        int chars = reader.read(cbuf);
        if (chars == -1) {
          break;
        }
        sb.append(cbuf, 0, chars);
      return sb.toString();
}
}
//63
public class func{
	public void slurpReader(Reader reader){
        int amountRead = r.read(chars, 0, SLURPBUFFSIZE);
        if (amountRead < 0) {
          break;
        }
        buff.append(chars, 0, amountRead);
      r.close();
}
}
//64
public class func{
	public void convertStreamToString(InputStream is){
        int count = reader.read(buf);
        if (count<0) break;
        sb.append(buf, 0, count);
      is.close();
}
}
//65
public class func{
	public void parse(String head,BufferedReader reader){
    int length = Integer.parseInt(head.substring(1, head.length()));
    if(length == -1)
      throw new NullReplyException("NULL Bulk Reply");
    reader.read(value);
    reader.readLine();
}
}
//66
public class func{
	public void getBadgerFishReader(Reader reader){
         do
         {
            wasRead = bufferedReader.read(buffer, 0, 100);
            if (wasRead > 0) buf.append(buffer, 0, wasRead);
         } while (wasRead > -1);
         badger = new BadgerFishXMLStreamReader(new JSONObject(new JSONTokener(buf.toString())));
}
}
//67
public class func{
	public void getLines(File file,boolean keepDuplicates){
        int current = InputReader.read();
        if (current == -1 || current == '\n') {
          if (keepDuplicates || !list.contains(line))
            list.add(line);
          line = "";
          if (current == -1)
            break; // EOF
        } else
          line += (char) current;
}
}
//68
public class func{
	public void compress(InputStream input){
            int i = reader.read();
            if (i == -1) break;
            c = (char) i;
}
}
//69
public class func{
	public void parseForm(InputStream entityStream){
      do
      {
         wasRead = reader.read(buffer, 0, 100);
         if (wasRead > 0) buf.append(buffer, 0, wasRead);
      } while (wasRead > -1);
      String form = buf.toString();
}
}
//70
public class func{
	public void Request(StringBuffer urlFormat){
                readBytes = in.read(buffer, 0, bufferlen);
                if (readBytes < 0) {
                        break;
                }
        in.close();
}
}
//71
public class func{
	public void updateLanguage(LanguageInfo info){
                reader.mark(1);
                if (reader.read() != '\uFEFF')
                    reader.reset(); /* was not a leading BOM */
}
}
//72
public class func{
	public void getTime(){
            read = reader.read(__buffer, 0, __buffer.length);
            if (read <= 0)
                break;
            result.append(__buffer, 0, read);
        return result.toString();
}
}
//73
public class func{
	public void readAll(Reader reader){
                int charsRead = br.read(buffer);
                if (charsRead == -1) break;
                buf.append(buffer, 0, charsRead);
            return buf.toString();
}
}
//74
public class func{
	public void run(){
                    if (reader.ready()) {
                        bytes = reader.read(buffer, 0, mMaxNMEABuffer);
                        Message msg = mHandler.obtainMessage(
                                BTGpsLocationProvider.GPS_DATA_AVAILABLE,buffer);
                        lastActivity = System.currentTimeMillis();
                        msg.arg1 = bytes;
                        mHandler.sendMessage(msg);
                    }
}
}
//75
public class func{
	public void readCharNonBlocking(BufferedReader reader){
      if (reader.ready()) {
        return reader.read();
      } else {
        return -1;
      }
}
}
//76
public class func{
	public void readCharNonBlocking(BufferedReader reader){
      if (reader.ready()) {
        return reader.read();
      } else {
        return -1;
      }
}
}
//77
public class func{
	public void testPrefix(BufferedReader b,String pfx){
            int c = b.read();
            if (c < 0) {
                rv = -1;
                break;
            } else if (c != pfx.charAt(i)) {
                rv = 0;
                break;
            } else {
                rv = 1;
            }
        b.reset();
}
}
//78
public class func{
	public void createStatistics(BufferedReader br,ArrayList<Integer> file){
        tmp = br.read();
        if (tmp == -1) {
            charStats[0]++;
            file.add(0);
        } else
            file.add(tmp);
        while (tmp != -1) {
            if (tmp == (char) 0 || tmp >= 256) {
                out.close();
                throw new InvalidCharacterException();
            }
            charStats[tmp]++;
            tmp = br.read();

            if (tmp == -1) {
                charStats[0]++;
                file.add(0);
            } else
                file.add(tmp);
        }
}
}
//79
public class func{
	public void handle(String path,final Request request,HttpServletRequest httpRequest,final HttpServletResponse httpResponse){
                int c=in.read();
                if (c<0)
                    break;
                out.write(c);
            out.println();
}
}
//80
public class func{
	public void appendUserPreferences(PrintWriter writer){
                int read = reader.read(chars);
                if (read <= 0) {
          break;
        }
                writer.write(chars, 0, read);
}
}
//81
public class func{
	public void sample(Entry arg0){
        int c = reader.read(buffer);
        if (c == -1) {
          break;
        }
        bufferedWriter.write(buffer);
}
}
//82
public class func{
	public void handle(String target,Request baseRequest,HttpServletRequest request,HttpServletResponse response){
            if (reader.read()>=0)
                throw new IllegalStateException("Not closed");
}
}
//83
public class func{
	public void getInputStreamAsCharArray(InputStream stream,int length,String encoding){
      int amountRead = reader.read(contents, totalRead, amountRequested);
      if (amountRead < 0) break;
}
}
//84
public class func{
	public void handle(String target,Request baseRequest,HttpServletRequest request,HttpServletResponse response){
        if (reader.read() >= 0)
            throw new IllegalStateException("Not closed");
}
}
//85
public class func{
	public void inputStreamToString(InputStream is){
            int n = br.read(c, 0, c.length);
            if (n < 0) break;
            sw.write(c, 0, n);
        isr.close();
}
}
//86
public class func{
	public void checkForLineBreak(){
          int read = reader.read();
          if (read != 'q') {
            break;
          } else {
            _finished = true;
            break;
          }
}
}
//87
public class func{
	public void handle(String target,HttpServletRequest request,HttpServletResponse response,int dispatch){
            if (reader.read()>=0)
                throw new IllegalStateException("Not closed");
}
}
//88
public class func{
	public void readResponse(BufferedReader reader){
            while ((line = reader.readLine()) != null)
            {
                if ("0".equals(line))
                {
                    line = reader.readLine();
                    assertEquals("", line);
                    break;
                }

                int length = Integer.parseInt(line, 16);
                for (int i = 0; i < length; ++i)
                {
                    char c = (char)reader.read();
                    body.append(c);
                }
                line = reader.readLine();
                assertEquals("", line);
            }
}
}
//89
public class func{
	public void successTest(String className,String expectedOutput){
            Runtime rt = Runtime.getRuntime();
            Process p = rt.exec("java -Xmx128m -cp testbin "+rewriterPackage+"."+className);
            InputStreamReader esr = new InputStreamReader(p.getErrorStream());
            BufferedReader ebr = new BufferedReader(esr);
            String line = ebr.readLine();
            if (line != null) {
                fail(line);
            }
            InputStreamReader isr = new InputStreamReader(p.getInputStream());
            BufferedReader br = new BufferedReader(isr);
            assertEquals(expectedOutput, br.readLine());
            assertEquals(-1, br.read());
            assertEquals(0, p.waitFor());
}
}
//90
public class func{
	public void readURLToString(URL url){
          String line = reader.readLine();
          if (line == null) break;
          sb.append(line);
          sb.append((char)reader.read());
      return sb.toString();
}
}
//91
public class func{
	public void readTextFromFile(String fileName){
    final File aFile = new File(fileName);
    if (!aFile.exists())
    {
      Logging.errorPrint("Could not find license at " + fileName);
      aString = LanguageBundle.getString("in_licNoInfo"); //$NON-NLS-1$

      return aString;
    }
      BufferedReader theReader = new BufferedReader(new InputStreamReader(new FileInputStream(aFile), "UTF-8"));
      final int length = (int) aFile.length();
      theReader.read(inputLine, 0, length);
      theReader.close();
}
}
//92
public class func{
	public void readFileToString(String filename){
            File file = new File(filename);
            if ( !file.exists() ) {
                System.out.println("\nFILE DOES NOT EXIST: " + filename);
            }
            BufferedReader in = new BufferedReader(new FileReader(file));
            char[] allChars = new char[(int)file.length()];
            in.read(allChars, 0, (int)file.length());
            in.close();
}
}
//93
public class func{
	public void main(String[] args){
        reader = new BufferedReader(new
                BoundedReader(strings[3][0]), strings[3][0].length());
        reader.readLine();
        reader.read(buf, 0, 9);
        String newStr = new String(buf);
        if (!newStr.equals(strings[3][1]))
            throw new RuntimeException("Read(char[],int,int) failed");
}
}
//94
public class func{
	public void Sync(EmaActivityHelper helper,DropboxWrapper api){
    mLocalDir = mHelper.getDal().Dir();
    File syncMetadataFile = new File(mLocalDir, METADATA_FILE);
    if (!syncMetadataFile.exists()) {
      mSyncMetadata = new JSONObject();
      return;
    }
      br = new BufferedReader(new FileReader(syncMetadataFile), 4096);
      char[] buffer = new char[(int) syncMetadataFile.length()];
      br.read(buffer);
      mSyncMetadata = new JSONObject(new String(buffer));
}
}
//95
public class func{
	public void drainBuffer(BufferedReader br,StringBuffer storageBuf,int maxLength,int bytesRead,boolean readAll){
        if (br.ready()) {
            char[] buf = new char[1024];
            do {
                int bReadCurrent = br.read(buf, 0, 1024);
                if (storageBuf != null && bytesRead < maxLength) {
                    storageBuf.append(buf, 0, bReadCurrent);
                }
                bReadSession += bReadCurrent;
            } while (br.ready() && readAll);
        }
}
}
