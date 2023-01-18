//0
public class func{
	public void readContent(InputStream stream,String charset){
      int n = reader.read(readBuffer);
      while (n > 0)
      {
        buffer.append(readBuffer, 0, n);
        n = reader.read(readBuffer);
      }
}
}
//1
public class func{
	public void extractReaderContents(BufferedReader bufferedReader){
      int readCharacterCount = bufferedReader.read(readInCharacters);
      while (readCharacterCount > -1) {
        contents.append(String.valueOf(readInCharacters));
        readCharacterCount = bufferedReader.read(readInCharacters);
      }
      bufferedReader.close();
}
}
//2
public class func{
	public void getText(InputStream stream,String charset){
        int numRead = reader.read(chars);
        while (numRead != -1)
        {
          sw.write(chars, 0, numRead);
          numRead = reader.read(chars);
        }
        reader.close();
}
}
//3
public class func{
	public void loadPlotData(TownBlock townBlock){
            plotBlockData.setVersion(version);
            plotBlockData.setHeight(fin.read());
          while ((value = fin.read()) >= 0) {
            IntArr.add(value);  
          }
}
}
//4
public class func{
	public void rewriteHeader(){
        while ((line = br.readLine()) != null) {
            if (descriptionLinePattern.matcher(line).matches()) {
                wr.write("DESCRIPTION \"");
                wr.write(description);
                wr.write("\"\n");
                descriptionWritten = true;
            } else if(platformLinePattern.matcher(line).matches()) {
                wr.write("PLATFORM ");
                wr.write(platform);
                wr.write("\n");
                platformWritten = true;
            } else if(line.startsWith("(")) {
                if(!descriptionWritten) {
                    wr.write("DESCRIPTION \"");
                    wr.write(description);
                    wr.write("\"\n");
                }

                if(!platformWritten) {
                    wr.write("PLATFORM ");
                    wr.write(platform);
                    wr.write("\n");
                }

                wr.write(line);
                wr.append('\n');
                break;
            /* Write all other lines */
            } else {
                wr.write(line);
                wr.append('\n');
            }
        }
        while ((len = br.read(buff, 0, 4096)) > 0) {
            wr.write(buff, 0, len);
        }
        wr.close();
}
}
//5
public class func{
	public void readFile(String fileName,boolean showExceptions){
      inFile = reader(fileName, false, showExceptions);
      if (inFile == null) return "";
      while ((len = inFile.read(buff)) >= 0)
        strb.append(buff, 0, len);
      inFile.close();
}
}
//6
public class func{
	public void read(BufferedReader requestReader,HttpServletRequest req){
        while (-1 != (c = requestReader.read())) {
            output.append((char) c);
        }
        requestReader.close();
}
}
//7
public class func{
	public void readFrom(Class arg0,Type arg1,Annotation[] arg2,MediaType arg3,MultivaluedMap arg4,InputStream is){
        while ((ch = br.read()) > -1) {
            sb.append((char) ch);
        }
        br.close();
}
}
//8
public class func{
	public void getFileContents(InputStream in){
      while ((read= br.read()) != -1)
        sb.append((char) read);
      br.close();
}
}
//9
public class func{
	public void runConsole(String sCmd){
        while ((read = reader.read(buffer)) > 0) {
            output.append(buffer, 0, read);
        }
        reader.close();
}
}
//10
public class func{
	public void getContents(InputStream in){
            while ((read= br.read()) != -1)
                sb.append((char) read);
            br.close();
}
}
//11
public class func{
	public void exec(String command){
            while ((read = reader.read(buffer)) > 0) {
                output.append(buffer, 0, read);
            }
            reader.close();
}
}
//12
public class func{
	public void doHttpCall(String methodName,String marshaledData){
        while ((ch = br.read()) > -1) {
            sb.append((char) ch);
        }
        br.close();
}
}
//13
public class func{
	public void parse(String rulename,File file,boolean trace){
    while ((ch = in.read()) != -1)
      out.append((char)ch);
    in.close();
}
}
//14
public class func{
	public void getContents(IStorage file){
            while ((read= br.read()) != -1)
                sb.append((char) read);
            br.close();
}
}
//15
public class func{
	public void getFileAsString(File file,String charEncoding){
    while ((ch = in.read()) > -1) {
      sb.append((char)ch);
    }
    in.close();
}
}
//16
public class func{
	public void readUTF8FromFile(File file){
    while ((ch = in.read()) > -1) {
      sb.append((char)ch);
    }
    in.close();
}
}
//17
public class func{
	public void executeCommand(String command){
        while ((read = reader.read(buffer)) > 0) {
          output.append(buffer, 0, read);
        }
        reader.close();
}
}
//18
public class func{
	public void executeCommand(String command){
        while ((read = reader2.read(buffer)) > 0) {
          output2.append(buffer, 0, read);
        }
        reader2.close();
}
}
//19
public class func{
	public void read(BufferedReader inFile){
      while ((len = inFile.read(buff)) >= 0)
        strb.append(buff, 0, len);
      inFile.close();
}
}
//20
public class func{
	public void getStringFromFile(String path){
            while ((numRead = reader.read(buf)) != -1) {
                String readData = String.valueOf(buf, 0, numRead);
                fileData.append(readData);
                buf = new char[1024];
            }
            reader.close();
}
}
//21
public class func{
	public void processFile(String src,String dst){
      while ((ch = in.read()) != -1)
        out.append((char)ch);
      out.append("\n"); //fix for the bug than .end method ends by EOF but not CRLF
      in.close();
}
}
//22
public class func{
	public void showFileInfo(String filename){
      while ((read = br.read(buffer)) > 0) {
        output.append(buffer, 0, read);
      }
      br.close();
}
}
//23
public class func{
	public void deleteCacheDirectory(Context context){
            while ((read = reader.read(buffer)) > 0) {
                output.append(buffer, 0, read);
            }
            reader.close();
}
}
//24
public class func{
	public void getSchemaAsString(BufferedReader reader,int available){
        StringBuffer sb = new StringBuffer(available);
            while( (numRead = reader.read(chars)) > -1){
                sb.append(String.valueOf(chars));
            }
            reader.close();
}
}
//25
public class func{
	public void getFile(String url){
        while ((read = in.read(str)) >= 0) {
            sw.write(str, 0, read);
            if (fw != null) {
                fw.write(str, 0, read);
            }
        }
        in.close();
}
}
//26
public class func{
	public void gzips(String zipFileName,String mDestFile){
        while ((c = in.read()) != -1) {

            out.write(String.valueOf((char) c).getBytes("UTF-8"));
        }
        in.close();
}
}
//27
public class func{
	public void readIntoBuffer(BufferedReader br,StringBuffer buffer){
    while ((bytesRead = br.read(bytes)) > 0) {
      if (bytesRead == bufferSize) {
        buffer.append(bytes);
      }
      else {
        buffer.append(bytes, 0, bytesRead);
      }
    }
}
}
//28
public class func{
	public void readJson(){
      while ((num = input.read(buffer)) > 0) {
        content.append(buffer, 0, num);
      }
      MyObject myobj = JsonHelper.parseGson(content.toString());
      if (myobj != null) {
        // Update ui
        if (jsonView != null)
          jsonView.setText(myobj.toString());
          Log.i(TAG,myobj.toString());
      }
}
}
//29
public class func{
	public void getUrlContent(String urlAddress,Map requestProperties,Map requestParameters,String encoding,int timeout){
      while ((i = buffer.read()) != -1)
        strbuf.append((char)i);
      String readData = strbuf.toString();   
}
}
//30
public class func{
	public void decode(){
        while ((readLen = br.read(readBuf)) > 0) {
          tempMessage.append(readBuf, 0, readLen);
        }
        message = tempMessage.toString();
        if (message.startsWith("\n"))
          message = message.substring(1);
}
}
//31
public class func{
	public void getLogContents(String logfile){
    while((numRead = reader.read(buf)) !=-1) {
      String readData = String.valueOf(buf, 0,numRead);
      fileData.append(readData);
      buf = new char[1024];
    }
    return fileData.toString();
}
}
//32
public class func{
	public void getResource(String name){
        while ((i = br.read()) != -1) {
            sb.append((char) i);
        }
        return sb.toString();
}
}
//33
public class func{
	public void readRawBytes(String fileName){
    while ((c = in.read()) >= 0)
      buf.append((char) c);
    mRawBuffer = buf.toString();
}
}
//34
public class func{
	public void loadTemplate(){
            while((c = reader.read()) != -1) {
                buffer.append((char)c);
            }
            template = buffer.toString();
}
}
//35
public class func{
	public void readPackageList(InputStream input,String path,boolean relative){
            while ((c = in.read()) >= 0) {
                char ch = (char)c;
                if (ch == '\n' || ch == '\r') {
                    if (strbuf.length() > 0) {
                        String packname = strbuf.toString();
                        String packpath = path +
                                      packname.replace('.', '/') + '/';
                        new Item(packname, packpath, relative);
                        strbuf.setLength(0);
                    }
                } else {
                    strbuf.append(ch);
                }
            }
            input.close();
}
}
//36
public class func{
	public void testHappyPath(){
      while ((c = in.read()) != -1) {
        str.append((char) c);
      }
      String response = str.toString();
      assertEquals(sourceMessage, response);
}
}
//37
public class func{
	public void getContent(DataSource ds){
      while ((ch = is.read()) != -1)
        sb.append((char)ch);
      return sb.toString();
}
}
//38
public class func{
	public void doGetReaderTest(String testString){
        br = wrapper.getReader();
        while ((c = br.read()) != -1) {
            buff.append((char) c);
        }
        assertEquals(buff.toString(), testString);
}
}
//39
public class func{
	public void getDataSet(){
    while ((c = is.read()) != -1) {
      txtStr.append((char) c);
    }
    newInst[0] = (double) data.attribute(0).addStringValue(txtStr.toString());
}
}
//40
public class func{
	public void readBody(final BufferedReader r){
    while (r.ready()) 
    {
      int charsRead = r.read(buffer);
      if (charsRead == -1) 
      {
        break;
      }
      b.append(buffer, 0, charsRead);
    }
    return b.toString();    
}
}
//41
public class func{
	public void testOpenBufferedStream(){
    while ((read = reader.read(buf)) != -1) {
      writer.write(buf, 0, read);
    }
    reader.close();
}
}
//42
public class func{
	public void readFrom(IInteger socketId){
      while (in.ready()) {
        line.append((char)in.read());
      }
      return vf.string(line.toString());
}
}
//43
public class func{
	public void transferData(Reader source,Writer dest,int tz){
        BufferedWriter out = new BufferedWriter(dest, tz);
        while ((read = in.read(bridge, 0, tz)) != -1) {
            out.write(bridge, 0, read);
            total += read;
        }
        in.close();
}
}
//44
public class func{
	public void readUrl(String urlString){
        while ((read = reader.read(chars)) != -1)
            buffer.append(chars, 0, read); 
        return buffer.toString();
}
}
//45
public class func{
	public void ReadProcessOutput(BufferedReader stdInput){
        while ((bytesRead = stdInput.read(readBuf)) > 0) {
            r.append(readBuf, 0, bytesRead);
        }
        return r.toString();
}
}
//46
public class func{
	public void inputStreamToString(final InputStream in){
      while ((reader.read(buffer)) != -1) {
        buf.append(buffer);
      }
      return buf.toString();
}
}
//47
public class func{
	public void readUrl(String urlString,String userAgent,String accept,String cookies){
          while ((read = reader.read(chars)) != -1)
              buffer.append(chars, 0, read); 
          return buffer.toString();
}
}
//48
public class func{
	public void testOpenBufferedStream(){
    while ((read = reader.read(buf)) != -1) {
      writer.write(buf, 0, read);
    }
    reader.close();
}
}
//49
public class func{
	public void InputStreamToString(InputStream in){
            while ((charOut = reader.read()) != -1) {
                myStrBuf.append(String.valueOf((char) charOut));
            }
}
}
//50
public class func{
	public void doInBackground(Void... arg0){
          File file = new File(path.toString());
          if(!file.canRead()){
            /*
             * READS THE FILE UNDER PROTECTED DIRECTORY...SYSTEM FILES WITH NO READ PERMISSION
             */
            BufferedReader re = LinuxShell.execute("cat "+file.getPath());
            while((read = re.read(buffer,0,1000))!=-1)
              rea.append(buffer,0,read);
            re.close();
            openFile(path, rea);
            return null;
          }
          FileReader reader = new FileReader(new File(path.toString()));
}
}
//51
public class func{
	public void InputStreamToString(InputStream in){
            while ((charOut = reader.read()) != -1) {
                myStrBuf.append(String.valueOf((char) charOut));
            }
}
}
//52
public class func{
	public void getPayloadAsString(final HttpServletRequest request){
    int b = reader.read( buffer );
    while ( b > 0 ) {
      stringBuffer.append( buffer, 0, b );
    }
    return stringBuffer.toString();
}
}
//53
public class func{
	public void getText(String filename,Class source){
            while ((nb = reader.read(buffer, 0, 1024)) >= 0) {
                res.append(buffer, 0, nb);
            }
            return res.toString();
}
}
//54
public class func{
	public void extractMessageContents(Message m){
        while ((c = reader.read(ch)) != -1) {
          sb.append(ch, 0, c);
        }
        this.messageContents = sb.toString();
}
}
//55
public class func{
	public void getJSONObject(URL jsonURL){
    while((read = reader.read(buff)) > 0) {
      buffer.append(buff, 0, read);
    }
    DynamicCloudsDaemon.LOG.info("Read " + buffer.length() + " bytes");
    Object res = JSON.parse(buffer.toString());
}
}
//56
public class func{
	public void transferData(Reader src,Writer dest,long charsToCopy){
        BufferedWriter out = new BufferedWriter(dest, BUFFER_SIZE);
        while ((read = in.read(bridge, 0, (int)Math.min(charsLeft, BUFFER_SIZE))) > 0) {
            out.write(bridge, 0, read);
            charsLeft -= read;
        }
        in.close();
}
}
//57
public class func{
	public void readXMLFile(String filePath){
    while ((n = bufferReader.read(buf)) > 0) {
      w.write(buf, 0, n);
    }
    bufferReader.close();
}
}
//58
public class func{
	public void streamToString(InputStream in){
            while ((len = reader.read(buffer)) > 0) {
                sb.append(buffer, 0, len);
            }
}
}
//59
public class func{
	public void main(String[] args){
            while ((charsRead = r.read(cbuf, 0, 10240)) != -1) 
                sb.append(cbuf, 0, charsRead);
}
}
//60
public class func{
	public void loadFile(File file){
            while ((read = br.read(buffer)) != -1) {
                str.append(buffer, 0, read);
            }
            fr.close();
}
}
//61
public class func{
	public void getFileContents(IFile file){
    while ((read= reader.read(part)) != -1)
      buffer.append(part, 0, read);
    reader.close();
}
}
//62
public class func{
	public void readContent(InputStream input){
      while ((charsRead = reader.read(charBuff)) > -1) {
        strBuff.append(charBuff, 0, charsRead);
      }
      reader.close();
}
}
//63
public class func{
	public void fileToString(FileSystem fs,Path path){
    while((read = br.read(buff)) != -1) {
      sb.append(buff, 0, read);
    }
    br.close();
}
}
//64
public class func{
	public void runDiff(){
        while (reader.read(part) != -1) {
            sbExpDiff.append(part);
        }
        reader.close();
}
}
//65
public class func{
	public void compressFileToGzip(String inFilename){
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            in.close();
}
}
//66
public class func{
	public void unGZipBytes(byte[] bytes){
      while((c = br.read()) != -1) {
        baos.write(c);
      }
      br.close();
}
}
//67
public class func{
	public void getEntireResponse(final BufferedReader in){
            while ((chars = in.read(cbuf, 0, 1024)) != -1) {
                response.append(cbuf, 0, chars);
            }
}
}
//68
public class func{
	public void getValue(){
            while ((len = r.read(buf)) != -1) {
                b.append(buf, 0, len);
            }
            r.close();
}
}
//69
public class func{
	public void initTemplateContentsFromInputStream(InputStream templateStream){
        StringBuilder builder = new StringBuilder(BUFFER_SIZE);
            while ((nRead = reader.read(cbuf, 0, BUFFER_SIZE)) > 0) {
                builder.append(cbuf, 0, nRead);
            }
            reader.close();
}
}
//70
public class func{
	public void getFileContent(String fileName){
    while ((read = in.read(buffer)) >= 0) {
      sb.append(buffer, 0, read);
    }
    in.close();
}
}
//71
public class func{
	public void readFileAsString(File file){
            while((numRead=reader.read(buf)) != -1){
                fileData.append(buf, 0, numRead);
            }
            reader.close();
}
}
//72
public class func{
	public void zipCompress(String filename){
    while ((c = in.read()) != -1)
      out.write(c);
    in.close();
}
}
//73
public class func{
	public void createCharSequence(Reader reader0){
      while((chars = reader.read(buff)) != -1) {
        result.write(buff, 0, chars);
      }
      reader.close();
}
}
//74
public class func{
	public void main(String[] args){
        while ((n = in.read(buf)) != -1) {
            out.write(buf, 0, n);
            System.err.print(" " + n);
        }
        in.close();
}
}
//75
public class func{
	public void copyStreamToString(InputStream input,int approxStringLength){
    while ((charsRead = reader.read(buffer)) != -1) {
      w.write(buffer, 0, charsRead);
    }
    return w.toString();
}
}
//76
public class func{
	public void getFileFromPackage(String filename){
                while ((c = in.read()) > -1) {
                    s.write(c);
                }
                return s.toString();
}
}
//77
public class func{
	public void loadContents(@Nonnull File file,@Nonnull Charset charset){
      while ((c = reader.read()) != -1) {
        writer.write(c);
      }
      return checkNotNull(writer.toString());
      closeQuietly(reader);
}
}
//78
public class func{
	public void getContents(File root,String file){
    while ((read = br.read(buffer)) != -1) {
      capture.write(buffer, 0, read);
    }
    return capture.toString();
}
}
//79
public class func{
	public void readResource(URL resourceUrl){
      while ((iRead = resourceBr.read(buffer)) != -1) {
        sw.write(buffer, 0, iRead);
      }
      result = sw.toString();
}
}
//80
public class func{
	public void loadContents(File file,Charset charset){
      while ((c = reader.read()) != -1) {
        writer.write(c);
      }
      return writer.toString();
}
}
//81
public class func{
	public void loadContents(InputStream stream,Charset charset){
      while ((c = reader.read()) != -1) {
        writer.write(c);
      }
      return writer.toString();
}
}
//82
public class func{
	public void convertFileFromUtf16ToUtf8(File inputFile,File outputFile){
        while ((c = reader.read()) != -1) {
          writer.write(c);
        }
        writer.close();
}
}
//83
public class func{
	public void generateUTF8OutFile(File FinalOutFile){
          while ((c = inFile.read()) != -1)
            bw.write(c);
          bw.flush();
          bw.close();
}
}
//84
public class func{
	public void writeInputStreamToFile(String fileName,BufferedReader bufferedReader){
      while ((len = bufferedReader.read(buf)) > 0)
        out.write(buf, 0, len);
      out.close();
}
}
//85
public class func{
	public void visitFile(AstNode astNode){
      BufferedReader reader = Files.newReader(getContext().getFile(), charset);
      while ((c = reader.read()) != -1) {

        if (c == '\r' || c == '\u2028' || c == '\u2029') {
          getContext().createFileViolation(this, "Replace all non line feed end of line characters in this file \"{0}\" by LF.",
            getContext().getFile().getName());
          break;
        }
      }
      LOG.error("Unable to process check S1779 on file: {}", getContext().getFile().getName(), e);
}
}
//86
public class func{
	public void getLineNumber(File file,String encoding){
      while ((ch = bis.read()) != -1) {
        if (ch == '\r' || ch == '\n') {
          if (!isline) {
            isline = true;
            count++;
          }
        } else {
          isline = false;
        }
      }
}
}
//87
public class func{
	public void process(Reader unbufferedReader){
      while ((length = bufferedReader.read(content)) > -1) {
        processEvents(decoderInstance.decodeEvents(String.valueOf(content,
            0, length)));
      }
}
}
//88
public class func{
	public void process(Reader unbufferedReader){
            while ((length = bufferedReader.read(content)) > -1) {
                processEvents(decoderInstance.decodeEvents(String.valueOf(content, 0, length)));
            }
}
}
//89
public class func{
	public void execute(){
            while ((n = reader.read(buf)) > 0) {
                w.write(buf, 0, n);
            }
}
}
//90
public class func{
	public void main(String[] args){
            while(bufInputReader.read(array) != -1) {
                charArrayWriter.write(array); 
            }
       
}
}
//91
public class func{
	public void addStringToZip(String text,String entryName,ZipOutputStream zOut){
    while((i = reader.read()) != -1) {
      zOut.write(i);
    }
    zOut.closeEntry();
}
}
//92
public class func{
	public void copyFiles(File outDir,String suppFiles){
                    while ((c = inFile.read()) != -1)
                        pw.write(c);
                    pw.flush();
                    pw.close();
}
}
//93
public class func{
	public void parseAwfulCSV(BufferedReader reader,boolean header){
    while ((ch = reader.read()) != -1) {
      if (insideQuote) {
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
      } else {  // not inside a quote
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
}
}
//94
public class func{
	public void run(){
            while((read = br.read(buff)) != -1) {

                SessionOutputUtil.addToOutput(sessionOutput.getSessionId(), sessionOutput.getInstanceId(), buff,0,read);
                Thread.sleep(50);
            }
}
}
//95
public class func{
	public void parseExecResult(BufferedReader lines){
      while ( (nRead = lines.read(buf, 0, buf.length)) > 0 ) {
        output.append(buf, 0, nRead);
      }
}
}
//96
public class func{
	public void loadData(Cache<String,String> cache){
            CharBuffer cbuf = CharBuffer.allocate(1024 * chunkSize);
            while (bufferedReader.read(cbuf) >= 0) {
                Buffer buffer = cbuf.flip();
                String textChunk = buffer.toString();
                cache.put(textFileName + (chunkId++), textChunk);
                cbuf.clear();
                if (chunkId % 100 == 0)
                    System.out.printf("  Inserted %s chunks from %s into grid%n", chunkId, textFileName);
            }
}
}
//97
public class func{
	public void GetPage(URL url,RequestSettings settings){
      while((r = in.read()) != -1){
        out.write(r);
      }
        out.close();
}
}
//98
public class func{
	public void SqlFileBuilder(BufferedReader reader){
            while (-1 != (c = reader.read())) {
                stack.eat(c);
            }
}
}
//99
public class func{
	public void testFetchLargeClobOneByOneCharBaseline(){
            while (bufferedContent.read() != -1) {
                remaining--;
            }
            content.close();
}
}
//100
public class func{
	public void handlePut(final HttpServletRequest request,final ServletResponse response){
    while ((i = reader.read()) != -1) {
      out.write(i);
    }
    out.close();
}
}
//101
public class func{
	public void readerLoop(){
    while (!this.isStopping && read != -1) {
      read= bufferedInput.read();
    }
}
}
//102
public class func{
	public void parse(InputStream in){
        while ((len = reader.read(mReadBuf)) != -1) {
            mStringBuf.append(mReadBuf, 0, len);
        }
}
}
//103
public class func{
	public void getLineOffset(int lineNumber,IFile file){
      while ((lineCount < lineNumber - 1) && (ch != -1)) {
        try {
          ch = in.read();
        } catch (IOException e1) {
          OcamlPlugin.logError("Error in 2 OcamlBuilder:getLineOffset()", e1);
        }
        if (ch != -1) {
          charCount++;
          if (ch == '\n') {
            lineCount++;
          }
        }
      }
}
}
//104
public class func{
	public void fetch(BufferedReader reader){
    while (actual != -1) {
      writer.write(baf, 0, actual);
      actual = reader.read(baf, 0, BUFFER_SIZE);
    }
}
}
