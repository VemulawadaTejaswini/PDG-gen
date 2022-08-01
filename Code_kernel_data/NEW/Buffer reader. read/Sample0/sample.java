//0
public class func{
	public void getExistingFileContents(){
            if (fileEncoding == null) {
                isr = new InputStreamReader(fis);
            } else {
                isr = new InputStreamReader(fis, fileEncoding);
            }
            BufferedReader br = new BufferedReader(isr);
            int returnedBytes = br.read(buffer);
            while (returnedBytes != -1) {
                sb.append(buffer, 0, returnedBytes);
                returnedBytes = br.read(buffer);
            }
            br.close();
}
}
//1
public class func{
	public void getSource(IFile file){
      in= file.getContents();
        if (encoding != null) {
            br= new BufferedReader(new InputStreamReader(in, encoding));  
        } else {
            br= new BufferedReader(new InputStreamReader(in));
        }
      while ((read= br.read()) != -1) {
        sb.append((char) read);
      }
      br.close();
}
}
//2
public class func{
	public void readText(InputStream is,String charset){
    if (charset==null||charset.isEmpty()||charset.equalsIgnoreCase("tika")) {
      reader = new BufferedReader(new InputStreamReader(is));
    } else {
      reader = new BufferedReader(new InputStreamReader(is,charset));
    }
    while ((c = reader.
}
}
//3
public class func{
	public void getFileContent(String filePath){
                in = new BufferedReader(new InputStreamReader(getClass().getClassLoader().getResourceAsStream(filePath)));
                int ch = in.read();
                while (ch > -1) {
                    sb.append((char)ch);
                    ch = in.read();
                }
}
}
//4
public class func{
	public void main(String[] args){
        BufferedReader r = new BufferedReader(new StringReader("12"));
        r.read();
        r.mark(2);
        while (r.read() != -1);
        r.reset();
        while (r.read() != -1) {
            count++;
        }
}
}
//5
public class func{
	public void getGrammarFileLines(String filename){
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "UTF-8"));
            int c = reader.read();
            while (c != -1) {
                sb.append((char)c);
                c = reader.read();
            }
}
}
//6
public class func{
	public void getStreamText(InputStream stream){
        InputStreamReader isr = new InputStreamReader(stream);
        BufferedReader reader = new BufferedReader(isr);
        int numRead = reader.read(buf);
        while (numRead != -1)
        {
          // output temp buffer to output buffer
          sw.write(buf, 0, numRead);

          // fill buffer
          numRead = reader.read(buf);
        }
        if (stream != null)
        {
          stream.close();
        }
}
}
//7
public class func{
	public void getResourceText(String name){
        InputStreamReader isr = new InputStreamReader(stream);
        BufferedReader reader = new BufferedReader(isr);
        int numRead = reader.read(buf);
        while (numRead != -1)
        {
          // output temp buffer to output buffer
          sw.write(buf, 0, numRead);

          // fill buffer
          numRead = reader.read(buf);
        }
        if (stream != null)
        {
          stream.close();
        }
}
}
//8
public class func{
	public void execCmd(File wd,String[] cmdWithArguments,StringBuffer out){
    Reader reader = new InputStreamReader(p.getInputStream());
    BufferedReader input = new BufferedReader(reader);
    while ((readChar = input.read()) != -1) {
      out.append((char) readChar);
    }
    input.close();
}
}
//9
public class func{
	public void execMysqlCmd(String cmd,String sourceFile,boolean includeDB){
      Reader reader = new InputStreamReader(p.getInputStream());
      BufferedReader input = new BufferedReader(reader);
      while ((readChar = input.read()) != -1) {
        out.append((char) readChar);
      }
      input.close();
}
}
//10
public class func{
	public void execCmd(File wd,String[] cmdWithArguments,StringBuffer out){
    reader = new InputStreamReader(p.getErrorStream());
    input = new BufferedReader(reader);
    while ((readChar = input.read()) != -1) {
      out.append((char) readChar);
    }
    input.close();
}
}
//11
public class func{
	public void execMysqlCmd(String cmd,String sourceFile,boolean includeDB){
      reader = new InputStreamReader(p.getErrorStream());
      input = new BufferedReader(reader);
      while ((readChar = input.read()) != -1) {
        out.append((char) readChar);
      }
      input.close();
}
}
//12
public class func{
	public void readStream(final InputStream is){
      final BufferedReader reader = new BufferedReader(
          new InputStreamReader(is));
      while ((numRead = reader.read(chars)) > -1) {
        sb.append(new String(chars, 0, numRead));
      }
      reader.close();
}
}
//13
public class func{
	public void getOutput(int limitBytes){
      BufferedReader stdout = new BufferedReader(new InputStreamReader(
          objdump.getInputStream()));
      while ((len = stdout.read(buf, 0, buf.length)) != -1) {
        if (limitBytes > 0 && buffer.length() + len >= limitBytes) {
          buffer.append(buf, 0, Math.min(len, limitBytes - buffer.length()));
          break;
        }
        buffer.append(buf, 0, len);
      }
        stdout.close();
      return buffer.toString().getBytes();
}
}
//14
public class func{
	public void toString(Reader reader){
                BufferedReader br = (reader instanceof BufferedReader) ? (BufferedReader) reader
                        : new BufferedReader(reader, BUFFER_SIZE);
                int charsRead = br.read(buffer);
                while (charsRead != -1) {
                    sb.append(buffer, 0, charsRead);
                    charsRead = br.read(buffer);
                }
                br.close();
}
}
//15
public class func{
	public void getOutput(){
    BufferedReader stdout = new BufferedReader(new InputStreamReader(objdump.getInputStream()));
    while ((len = stdout.read(buf, 0, buf.length)) != -1) {
      buffer.append(buf, 0, len);
    }
    stdout.close();
}
}
//16
public class func{
	public void read(String filename){
    final BufferedReader reader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream(filename)));
    while ((numRead = reader.read(buf)) != -1) {
      final String readData = String.valueOf(buf, 0, numRead);
      fileData.append(readData);
      buf = new char[1024];
    }
    reader.close();
}
}
//17
public class func{
	public void read(InputStream is){
      BufferedReader inFile = new BufferedReader(new InputStreamReader(is));
      while ((len = inFile.read(buff)) >= 0)
        strb.append(buff, 0, len);
      inFile.close();
}
}
//18
public class func{
	public void readResource(String resource){
            InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream(resource);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            while ((numRead = reader.read(buf)) != -1) {
                String readData = String.valueOf(buf, 0, numRead);
                fileData.append(readData);
            }
            reader.close();
}
}
//19
public class func{
	public void loadTheaterData(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                DummyDataProvider.class.getResourceAsStream("cities.txt")));
            while ((numRead = reader.read(buf)) != -1) {
                String readData = String.valueOf(buf, 0, numRead);
                fileData.append(readData);
                buf = new char[1024];
            }
            reader.close();
}
}
//20
public class func{
	public void readFileAsString(){
      reader = new BufferedReader(new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream(this.scriptFilePath)));
      while ((numRead = reader.read(buf)) != -1) {
        String readData = String.valueOf(buf, 0, numRead);
        fileData.append(readData);
      }
      reader.close();
}
}
//21
public class func{
	public void fileToString(String path){
      BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
      while((c = reader.read(buffer, 0, buffer.length)) != -1)
      {
        sBuffer.append(buffer, 0, c);
      }
      reader.close();
}
}
//22
public class func{
	public void readFile(InputStream in){
    final BufferedReader br = new BufferedReader(new InputStreamReader(in));
    while ((cnt = br.read(buffer, 0, buffer.length)) > -1) {
      sBuffer.append(buffer, 0, cnt);
    }
    br.close();
}
}
//23
public class func{
	public void readStreamAsString(final InputStream iStream){
    final BufferedReader reader = new BufferedReader(new InputStreamReader(iStream));
      while ((numRead = reader.read(buf)) != -1) {
        String readData = String.valueOf(buf, 0, numRead);

        if (fileData.length() == 0 && readData.startsWith(UTF8_BOM))
          // SKIP UTF-8 BOM IF ANY
          readData = readData.substring(1);

        fileData.append(readData);
      }
      reader.close();
}
}
//24
public class func{
	public void getInputStreamAsString(InputStream stream){
      br = new BufferedReader(new InputStreamReader(stream));
      while ((len = br.read(cbuf)) > 0) {
        sb.append(cbuf, 0, len);
      }
      if(br != null) br.close();    
}
}
//25
public class func{
	public void slurp(File file){
                reader = new BufferedReader(
                        new InputStreamReader(new GZIPInputStream(new FileInputStream(file))), 1024);
            while ((c = reader.read()) != -1) {
                result.append((char)c);
            }
            reader.close();
}
}
//26
public class func{
	public void loadFile(@Nonnull File logfile,@Nonnull Charset charset){
        if(!logfile.exists())
            return "";
        StringBuilder str = new StringBuilder((int)logfile.length());
        BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream(logfile),charset));
            while((len=r.read(buf,0,buf.length))>0)
               str.append(buf,0,len);
            r.close();
}
}
//27
public class func{
	public void runAppFromCMD(PackageApp packageApp,String[] additionalArgs){
            pb.redirectErrorStream(true);
            final Process process = pb.start();
            BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
            while ((c = input.read()) != -1) {
                System.out.print((char)c);
            }
            input.close();
}
}
//28
public class func{
	public void findApplets(URL u){
      inrdr = new BufferedReader(new InputStreamReader(u.openStream()));
      while ((i = inrdr.read()) != -1) {
        thisChar = (char)i;
        if (thisChar == '<') {
          String tag = readTag(inrdr);
          // System.out.println("TAG: " + tag);
          if (tag.toUpperCase().startsWith("<APPLET"))
            list.add(tag);
        }
      }
      inrdr.close();
}
}
//29
public class func{
	public void run(){
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
              while((truc=reader.read())!=-1){
                if(truc!=10){
                  str+=(char)truc;
                }else{
                  ent.command(str, bwriter);
                  str="";
                }
              }
              reader.close();
}
}
//30
public class func{
	public void readStreamAsString(InputStream in){
    BufferedReader reader = new BufferedReader(new InputStreamReader(in));
    while ((numRead = reader.read(buf)) != -1)
      fileData.append(buf, 0, numRead);
    reader.close();
}
}
//31
public class func{
	public void readAndClose(final HttpURLConnection connection){
      reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
      while ((bytesRead = reader.read(chars)) != -1) {
        builder.append(chars, 0, bytesRead);
      }
      if (reader != null) {
        reader.close();
      }
      if (connection != null) {
        connection.disconnect();
      }
}
}
//32
public class func{
	public void readfile(String filename){
    BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "KOI8-R"));
    while ((i = in.read(buf, 0, buf.length)) > -1) {
      if (i > 0) {
        out.append(buf, 0, i);
      }
    }
    in.close();
}
}
//33
public class func{
	public void getText(String path){
    BufferedReader reader = new BufferedReader(new InputStreamReader(
        getStream(path), LSystem.encoding));
    while ((numRead = reader.read(buf)) != -1) {
      String readData = String.valueOf(buf, 0, numRead);
      sbr.append(readData.trim());
    }
    reader.close();
}
}
//34
public class func{
	public void getTextSync(String path){
      BufferedReader reader = new BufferedReader(new InputStreamReader(is));
      while ((numRead = reader.read(buf)) != -1) {
        String readData = String.valueOf(buf, 0, numRead);
        fileData.append(readData);
      }
      reader.close();
}
}
//35
public class func{
	public void sanitizeXmlDocument(DefaultHandler handler,InputStream inputStream){
                BufferedReader br = new BufferedReader(
                    new InputStreamReader(inputStream, Constants.DEFAULT_ENCODING));
                while ((read = br.read(buf)) != -1) {
                    listingDocBuffer.append(buf, 0, read);
                }
                br.close();
}
}
//36
public class func{
	public void readFromPath(final String path,final String clientId,final String requestMethod){
      final URL url = url(fullPath);
      connection = (HttpURLConnection) url.openConnection();
      connection.setRequestMethod(requestMethod);
      reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
      while ((bytesRead = reader.read(chars)) != -1) {
        builder.append(chars, 0, bytesRead);
      }
      if (reader != null) {
        reader.close();
      }
      if (connection != null) {
        connection.disconnect();
      }
}
}
//37
public class func{
	public void extractOutput(InputStream stream,XHTMLContentHandler xhtml){
      reader = new BufferedReader(new InputStreamReader(stream, IOUtils.UTF_8));
      while ((n = reader.read(buffer)) != -1) {
        if (n > 0) {
          xhtml.characters(buffer, 0, n);
        }
        totalBytes += n;
      }
      reader.close();
}
}
//38
public class func{
	public void run(){
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        while((numRead = br.read(buf,0,256)) != -1) {
          sb.append(buf,0,numRead);
        }
        br.close();
}
}
//39
public class func{
	public void doLargeReadSize(BaseClient client){
    BufferedReader reader = new BufferedReader(new InputStreamReader(client.forRead(new Path(testFile1.getCanonicalPath()), 1024 * 1024)));
    while (reader.read() != -1) {
      count++;
    }
    reader.close();
}
}
//40
public class func{
	public void getContent(InputStream inputStream,ByteArrayOutputStream outputStream){
      BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
      while ((readChar = reader.read()) != -1) {
        outputStream.write(readChar);
      }
      reader.close();
}
}
//41
public class func{
	public void doSmallReadSize(BaseClient client){
    BufferedReader reader = new BufferedReader(
        new InputStreamReader(
            client.forRead(new Path(testFile1.getAbsolutePath()), 5)));
    while (reader.read() != -1) {
      count++;
    }
    reader.close();
}
}
//42
public class func{
	public void changeEncoding(String sourceFilename,String targetFilename){
      if ( Const.isEmpty( data.sourceEncoding ) ) {
        buffReader = new BufferedReader( new InputStreamReader( new FileInputStream( sourceFilename ) ) );
      } else {
        buffReader =
          new BufferedReader( new InputStreamReader( new FileInputStream( sourceFilename ), data.sourceEncoding ) );
      }
      while ( ( readSize = buffReader.read( cBuf ) ) != -1 ) {
        buffWriter.write( cBuf, 0, readSize );
      }
}
}
//43
public class func{
	public void readFileAsString(String filePath){
          BufferedReader reader = new BufferedReader(
                  new FileReader(filePath));
          while((numRead=reader.read(buf)) != -1){
              String readData = String.valueOf(buf, 0, numRead);
              fileData.append(readData);
              buf = new char[1024];
          }
          reader.close();
}
}
//44
public class func{
	public void readFileAsString(String filePath){
          BufferedReader reader = new BufferedReader(
                  new FileReader(filePath));
          while((numRead=reader.read(buf)) != -1){
      String readData = String.valueOf(buf, 0, numRead);
              fileData.append(readData);
          }
          reader.close();
}
}
//45
public class func{
	public void readFile(File file){
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while((numRead=reader.read(buf)) != -1){
            String readData = String.valueOf(buf, 0, numRead);
            fileData.append(readData);
            buf = new char[BUFFER_SIZE];
        }
        reader.close();
}
}
//46
public class func{
	public void readFile(String file,PrintWriter errorWriter){
                BufferedReader reader = new BufferedReader(new FileReader(f));
                while ((numRead = reader.read(buf)) != -1) {
                    String readData = String.valueOf(buf, 0, numRead);
                    fileData.append(readData);
                }
                reader.close();
}
}
//47
public class func{
	public void readCert(String filePath){
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            while ((numRead = reader.read(buf)) != -1) {
                String readData = String.valueOf(buf, 0, numRead);
                fileData.append(readData);
                buf = new char[1024];
            }
            reader.close();
}
}
//48
public class func{
	public void readFileAsString(String filePath){
    BufferedReader reader = new BufferedReader(
        new FileReader(filePath));
    while((numRead=reader.read(buf)) != -1){
      String readData = String.valueOf(buf, 0, numRead);
      fileData.append(readData);
      buf = new char[1024];
    }
    reader.close();
}
}
//49
public class func{
	public void readFileAsString(String filePath){
        BufferedReader reader = new BufferedReader(new FileReader(testResourceFile));
        while ((numRead = reader.read(buf)) != -1) {
            String readData = String.valueOf(buf, 0, numRead);
            fileData.append(readData);
            buf = new char[1024];
        }
        reader.close();
}
}
//50
public class func{
	public void readFileAsString(File filePath){
      reader = new BufferedReader(new FileReader(filePath));
      while ((numRead = reader.read(buf)) != -1) {
        String readData = String.valueOf(buf, 0, numRead);
        fileData.append(readData);
        buf = new char[1024];
      }
      reader.close();
}
}
//51
public class func{
	public void readFileAsString(File file){
    BufferedReader reader = new BufferedReader(new FileReader(file));
    while ((numRead = reader.read(buf)) != -1) {
      fileData.append(buf, 0, numRead);
    }
    reader.close();
}
}
//52
public class func{
	public void run(){
                reader = new BufferedReader(
                        new FileReader(jobFilePath));
                while((numRead=reader.read(buf)) > 0){
                    fileData.append(buf, 0, numRead);
                }
                reader.close();
}
}
//53
public class func{
	public void receiveFile(){
    BufferedReader reader = new BufferedReader(new FileReader(output));
    while ((read = reader.read()) != -1)
      buffer.append((char) read);
    reader.close();
}
}
//54
public class func{
	public void fileToString(File file){
            BufferedReader reader = new BufferedReader(new InputStreamReader(new java.io.BufferedInputStream(fis)));
            while ((c = reader.read()) != -1) {
                sb.append((char) c);
            }
            fileText = sb.toString();
}
}
//55
public class func{
	public void readURLConnection(URLConnection uc){
      reader = new BufferedReader(new InputStreamReader(uc.getInputStream()));
      while ((letter = reader.read()) != -1)
        buffer.append((char) letter);
}
}
//56
public class func{
	public void readFileAsString(String filePath){
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        while ((numRead = reader.read(buf)) != -1) {
            String readData = String.valueOf(buf, 0, numRead);
            fileData.append(readData);
            buf = new char[1024];
        }
        reader.close();
}
}
//57
public class func{
	public void getFileAsString(File file){
    BufferedReader reader = new BufferedReader(new FileReader(file));
    while ((numRead = reader.read(buf)) != -1) {
      String readData = String.valueOf(buf, 0, numRead);
      fileData.append(readData);
      buf = new char[1024];
    }
    reader.close();
}
}
//58
public class func{
	public void loadFile(){
      BufferedReader reader = new BufferedReader(new FileReader(pathFile));
      while ((numRead = reader.read(buf)) != -1) {
        String readData = String.valueOf(buf, 0, numRead);
        fileData.append(readData);
        buf = new char[1024];
      }
      reader.close();
}
}
//59
public class func{
	public void readFileAsString(String filePath){
    BufferedReader reader = new BufferedReader(new FileReader(filePath));
    while ((numRead = reader.read(buf)) != -1) {
      String readData = String.valueOf(buf, 0, numRead);
      fileData.append(readData);
      buf = new char[1024];
    }
    reader.close();
}
}
//60
public class func{
	public void readFileAsString(final String filePath){
      final BufferedReader reader = new BufferedReader(new FileReader(filePath));
      while((length = reader.read(buf)) > -1){
    fileData.append(String.valueOf(buf, 0, length).replaceAll("_ExternalUrl_", ExternalUrl));
      }
      reader.close();
}
}
//61
public class func{
	public void widgetSelected(final SelectionEvent e){
                    reader = new BufferedReader(new FileReader(filename));
                    while ((numRead = reader.read(buf)) != -1) {
                        String readData = String.valueOf(buf, 0, numRead);
                        fileData.append(readData);
                        buf = new char[1024];
                    }
                    reader.close();
}
}
//62
public class func{
	public void readFileAsString(File filePath){
          BufferedReader reader = new BufferedReader(
                  new FileReader(filePath));
          while((numRead=reader.read(buf)) != -1){
              String readData = String.valueOf(buf, 0, numRead);
              fileData.append(readData);
              buf = new char[1024];
          }
          reader.close();
}
}
//63
public class func{
	public void readFileContents(String filePath){
      reader = new BufferedReader(new FileReader(filePath));
        while((numRead=reader.read(buf)) != -1){
            String readData = String.valueOf(buf, 0, numRead);
            fileData.append(readData);
            buf = new char[1024];
        }
        reader.close();
}
}
//64
public class func{
	public void readFileAsString(File filePath){
    BufferedReader reader = new BufferedReader(new FileReader(filePath));
    while ((numRead = reader.read(buf)) != -1) {
      fileData.append(buf, 0, numRead);
    }
    reader.close();
}
}
//65
public class func{
	public void readFileToString(String filePath){
        BufferedReader reader = new BufferedReader(
                new FileReader(filePath));
        while ((numRead = reader.read(buf)) != -1) {
            fileData.append(buf, 0, numRead);
        }
        reader.close();
}
}
//66
public class func{
	public void readStringFromFile(String pathFile){
    BufferedReader reader = new BufferedReader(streamReader);
    while ((numRead = reader.read(buf)) != -1) {
      String readData = String.valueOf(buf, 0, numRead);
      fileData.append(readData);
      buf = new char[1024];
    }
    reader.close();
}
}
//67
public class func{
	public void readerToString(Reader reader){
    BufferedReader bufferedReader = new BufferedReader(reader);
      while ((numRead = bufferedReader.read(buf)) != -1) {
        String readData = String.valueOf(buf, 0, numRead);
        fileData.append(readData);
        buf = new char[1024];
      }
      bufferedReader.close();
}
}
//68
public class func{
	public void readStringFromFile(String pathFile){
    BufferedReader reader = new BufferedReader(streamReader);
    while ((numRead = reader.read(buf)) != -1) {
      String readData = String.valueOf(buf, 0, numRead);
      fileData.append(readData);
      buf = new char[1024];
    }
    reader.close();
}
}
//69
public class func{
	public void readStringFromFile(InputStream stream){
      BufferedReader reader = new BufferedReader(streamReader);
      while ((numRead = reader.read(buf)) != -1) {
        String readData = String.valueOf(buf, 0, numRead);
        fileData.append(readData);
        buf = new char[1024];
      }
      reader.close();
}
}
//70
public class func{
	public void dumpWindowHierarchy(boolean compressed,String filename){
                    reader = new BufferedReader(new FileReader(f));
                    while ((len = reader.read(buffer)) != -1) {
                        sb.append(new String(buffer, 0, len));
                    }
                    reader.close();
}
}
//71
public class func{
	public void ReadFileToCharArray(String filePath){
    BufferedReader reader = new BufferedReader(new FileReader(filePath));
    while ((numRead = reader.read(buf)) != -1) {
      String readData = String.valueOf(buf, 0, numRead);
      fileData.append(readData);
      buf = new char[1024];
    }
    reader.close();
}
}
//72
public class func{
	public void readFileAsString(File f){
        BufferedReader reader = new BufferedReader(
                new FileReader(f));
        while ((numRead = reader.read(buf)) != -1) {
            String readData = String.valueOf(buf, 0, numRead);
            fileData.append(readData);
            buf = new char[1024];
        }
        reader.close();
}
}
//73
public class func{
	public void read(InputStream stream){
      BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
    while( reader.read(buffer) >= 0 ) {
      requestBody.append( buffer.flip() );
      buffer.clear();
    }
}
}
//74
public class func{
	public void loadAddress(final String interfaceName){
            final BufferedReader reader = new BufferedReader(new FileReader(filePath), 1024);
            while ((numRead = reader.read(buf)) != -1) {
                readData = String.valueOf(buf, 0, numRead);
                fileData.append(readData);
            }
            reader.close();
}
}
//75
public class func{
	public void readString(InputStream is,String encoding){
      reader= new BufferedReader(new InputStreamReader(is, encoding));
      while ((read= reader.read(part)) != -1)
        buffer.append(part, 0, read);
      return buffer.toString();
}
}
//76
public class func{
	public void openBuffer(IProgressMonitor pm){
          BufferedReader stream = new BufferedReader(new InputStreamReader(bin.getContents()));
          while ((len = stream.read(buf, 0, buf.length)) != -1) {
            sb.append(buf, 0, len);
          }
}
}
//77
public class func{
	public void loadTextFile(File file){
    BufferedReader reader = new BufferedReader(new FileReader(file));
      while ((len = reader.read(buffer)) != -1) {
        input.append(buffer, 0, len);
      }
      reader.close();
}
}
//78
public class func{
	public void readFileAsString(File file){
    BufferedReader reader = new BufferedReader(new FileReader(file));
    while ((numRead = reader.read(buf)) != -1)
    {
      sb.append(buf, 0, numRead);
    }
    reader.close();
}
}
//79
public class func{
	public void readFileAsString(File file){
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while((numRead=reader.read(buf)) != -1){
            fileData.append(buf, 0, numRead);
        }
        reader.close();
}
}
//80
public class func{
	public void readTextFile(File file){
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while(-1 != (bytes = reader.read(buf)))
                fileData.append(buf, 0, bytes);
            reader.close();
}
}
//81
public class func{
	public void read(String fileName){
    FileReader reader = new FileReader(fileName);
    BufferedReader b = new BufferedReader(reader);
    while ((n = b.read(buffer, 0, buffer.length)) != -1) 
      builder.append(buffer, 0, n);
    b.close();
}
}
//82
public class func{
	public void activate(IokeObject method,IokeObject context,IokeObject message,Object on){
                        BufferedReader reader = new BufferedReader(new FileReader(f));
                        while((read = reader.read(buf, 0, 1024)) != -1) {
                            sb.append(buf, 0, read);
                        }
                        reader.close();
}
}
//83
public class func{
	public void read(InputStream stream){
      BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
    while( reader.read(buffer) >= 0 ) {
      requestBody.append( buffer.flip() );
      buffer.clear();
    }
}
}
//84
public class func{
	public void main(String args[]){
        final BufferedReader reader = new BufferedReader( new FileReader(configFile));
        while ((numRead = reader.read(buf)) != -1) {
            String readData = String.valueOf(buf, 0, numRead);
            sb.append(readData);
        }
        reader.close();
}
}
//85
public class func{
	public void readFileAsString(String filePath){
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        while ((numRead = reader.read(buf)) != -1) {
            String readData = String.valueOf(buf, 0, numRead);
            fileData.append(readData);
            buf = new char[1024];
        }
        reader.close();
}
}
//86
public class func{
	public void readString(InputStream is,String encoding){
            reader = new BufferedReader(new InputStreamReader(is, encoding));
            while ((read= reader.read(part)) != -1) {
                buffer.append(part, 0, read);
            }
            return buffer.toString();
}
}
//87
public class func{
	public void readString(InputStream is,String encoding){
      reader= new BufferedReader(new InputStreamReader(is, encoding));
      while ((read= reader.read(part)) != -1)
        buffer.append(part, 0, read);
      return buffer.toString();
}
}
//88
public class func{
	public void readContent(IFile file){
      reader = new BufferedReader(new InputStreamReader(is, encoding));
      while ((read = reader.read(part)) != -1) {
        buffer.append(part, 0, read);
      }
      return buffer.toString();
}
}
//89
public class func{
	public void readString(InputStream inputStream,String encoding){
      reader = new BufferedReader(new InputStreamReader(inputStream, encoding));
      while ((read = reader.read(part)) != -1)
        buffer.append(part, 0, read);
      return buffer.toString();
}
}
//90
public class func{
	public void readString(InputStream is,String encoding){
      reader= new BufferedReader(new InputStreamReader(is, encoding));
      while ((read= reader.read(part)) != -1)
        buffer.append(part, 0, read);
      return buffer.toString();
}
}
//91
public class func{
	public void readString(final InputStream is,final String encoding){
            reader = new BufferedReader(new InputStreamReader(is, encoding));
            while ((read = reader.read(part)) != -1) {
                buffer.append(part, 0, read);
            }
            return buffer.toString();
}
}
//92
public class func{
	public void updateDatabase(Connection c,String pathToSQLFile){
      FileReader fr = new FileReader(new File(pathToSQLFile));
      BufferedReader br = new BufferedReader(fr);
      while ((s = br.read()) != -1) {
        sb.appendCodePoint(s);
      }
      br.close();
}
}
//93
public class func{
	public void readErrorStreamFully(InputStream is,BluetoothProcessListener listener){
    br = new BufferedReader(new InputStreamReader(is));
    while ((ch = br.read()) != -1) {
      stringBuilder.append((char) ch);
    }
    listener.processErrorStream(stringBuilder.toString());
}
}
//94
public class func{
	public void copyWifiSupplicantTemplate(BufferedWriter bw){
            BufferedReader br = new BufferedReader(new FileReader(FILE_WIFI_SUPPLICANT_TEMPLATE));
            while ((size = br.read(temp)) > 0) {
                bw.write(temp, 0, size);
            }
            br.close();
}
}
//95
public class func{
	public void getFileAsBytes(File file){
    BufferedReader br = new BufferedReader(new FileReader(file));
    while((b = br.read()) != -1) {
      bytes[i] = (byte)b;
      i++;
    }
    br.close();
}
}
//96
public class func{
	public void readFile(final File file){
        final BufferedReader input = new BufferedReader(new FileReader(file));
            while (input.read(c) > 0) {
                /*
                 * char[] chars = line.toCharArray(); for (int i = 0; i <
                 * chars.length; ++i) { result.add(chars[i]); }
                 * result.add('\n'); } input.close(); if (result.size() != 0) {
                 * result.remove(result.size() - 1);
                 */
                result.add(c[0]);
            }
            input.close();
}
}
//97
public class func{
	public void doGet(String urlSite){
      url = new URL(urlSite);
      urlConn = url.openConnection();
      urlConn.addRequestProperty("User-Agent",
          "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
      Reader reader = new InputStreamReader(urlConn.getInputStream(),
          "utf-8");
      BufferedReader br = new BufferedReader(reader);
      while ((byteRead = br.read()) != -1)
        result.append((char) byteRead);
}
}
//98
public class func{
	public void httpGet(String url,int timeout){
            reader = new BufferedReader(new InputStreamReader(inputStream));
            while ((c = reader.read()) != -1) {
                responseBuf.append((char) c);
            }
            return responseBuf.toString();
}
}
//99
public class func{
	public void download_apk(Activity act){
      u = new URL("http://undroid.net/repo/packages/Note_Pad.apk");
      in = new BufferedReader(new InputStreamReader(u.openStream()));
      while ((buf = in.read()) >= 0) {
        out.write((char) buf);
      }
      out.flush();
      out.close();
}
}
//100
public class func{
	public void main(String[] argv){
    BufferedReader is = new BufferedReader(
      new InputStreamReader(System.in));
    while ((c=is.read()) != -1) {
      System.out.print((char)c);
    }
}
}
//101
public class func{
	public void dumpStream(InputStream stream){
            new BufferedReader(new InputStreamReader(stream));
            while ((i = in.read()) != -1) {
                   MessageOutput.printDirect((char)i);// Special case: use
                                                      //   printDirect()
            }
}
}
//102
public class func{
	public void writeBinaryStream(java.io.InputStream x){
         BufferedReader bufReader = new BufferedReader(new InputStreamReader(x));
             while( (i=bufReader.read()) != -1 ) {
                char ch = (char)i;

                StringBuffer strBuf = new StringBuffer();
                strBuf.append(ch);

                String str = new String(strBuf);
                String strLine = bufReader.readLine();

                writeString(str.concat(strLine));
             }
}
}
//103
public class func{
	public void updated(UpdateEvent e){
            BufferedReader reader = new BufferedReader(new FileReader(monitor.file));
            while ((len = reader.read(chars)) > -1)
              sb.append(chars,0,len);
            reader.close();
}
}
//104
public class func{
	public void readEnclosingLine(String filename,int start,int end){
      BufferedReader in = new BufferedReader(new InputStreamReader(
          new FileInputStream(filename), "UTF-8"));
      while ((len = in.read(buf)) != -1) {
        text.append(buf, 0, len);
      }
      while (lineEnd < text.length() && lineEnd <= start) {
        lineStart = lineEnd;
        lineEnd = parseLine(text, lineEnd);
        line = line + 1;
      }
}
}
//105
public class func{
	public void agreementContents(){
      String filename = "terms_" + SystemGlobals.getValue(ConfigKeys.I18N_DEFAULT) + ".txt";
      File file = new File(directory + filename);
      if (!file.exists()) {
        filename = SystemGlobals.getValue(ConfigKeys.AGREEMENT_DEFAULT_FILE);
        file = new File(directory + filename);
        
        if (!file.exists()) {
          throw new FileNotFoundException("Could not locate any terms agreement file");
        }
      }
      fileReader = new FileReader(file);
      reader = new BufferedReader(fileReader);
      while ((c = reader.read(buffer, 0, buffer.length)) > -1) {
        contents.append(buffer, 0, c);
      }
}
}
//106
public class func{
	public void getResourceAsString(Class c,String resource){
            in = c.getClassLoader().getResourceAsStream(resource);
            reader = new BufferedReader(new InputStreamReader(in));
            while ((numRead = reader.read(buf)) != -1) {
                String readData = String.valueOf(buf, 0, numRead);
                sb.append(readData);
                buf = new char[BUFFER_SIZE];
            }
            safeClose(in);
}
}
//107
public class func{
	public void readIntoString(InputStream s){
        BufferedReader rdr = new BufferedReader(new InputStreamReader(s));
            while ((cnt = rdr.read(buffer, 0, buffer.length)) != -1) {
                bld.append(buffer, 0, cnt);
            }
            return bld.toString();
}
}
//108
public class func{
	public void loadRawTextResourceAsString(Context context,int resourceId){
      reader = new BufferedReader(new InputStreamReader(context.getResources().openRawResource(resourceId)));
      while ((count = reader.read(buf, 0, READ_BUF_LEN)) != -1) {
        builder.append(buf, 0, count);
      }
      return builder.toString();
}
}
//109
public class func{
	public void getContent(HttpResponse response){
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
            while ((read = reader.read(buff)) != -1) {
                builder.append(buff, 0, read);
            }
            return builder.toString();
}
}
//110
public class func{
	public void setupScriptConfig(){
                    BufferedReader reader = new BufferedReader(new InputStreamReader(input, "UTF-8"), 1024);
                    while ((read=reader.read(buf)) != -1)
                    {
                        fileContents.append(buf, 0, read);
                    }
                    this.xmlConfig = fileContents.toString();
}
}
//111
public class func{
	public void readString(final InputStream is){
            reader = new BufferedReader(new InputStreamReader(is));
            while ((read = reader.read(part)) != -1) {
                buffer.append(part, 0, read);
            }
            return buffer.toString();
}
}
//112
public class func{
	public void loadTextAssetAsString(Context context,String path){
      reader = new BufferedReader(new InputStreamReader(assetManager.open(path)));
      while ((count = reader.read(buf, 0, READ_BUF_LEN)) != -1) {
        builder.append(buf, 0, count);
      }
      return builder.toString();
}
}
//113
public class func{
	public void getBody(HttpServletRequest request){
          InputStream inputStream = request.getInputStream();
          if (inputStream != null) {
              bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
              char[] charBuffer = new char[128];
              int bytesRead = -1;
              while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
                  stringBuilder.append(charBuffer, 0, bytesRead);
              }
          } else {
              stringBuilder.append("");
          }
}
}
//114
public class func{
	public void run(){
          BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()), 1);
            while ((c = reader.read()) != -1) {
              callback.character((char)c);            
            }
}
}
//115
public class func{
	public void setAppInfoFromRawRes(){
                 in = getResources().openRawResource(R.raw.introduction);
                if (in != null) {
                    InputStreamReader isr = new InputStreamReader(in);
                    BufferedReader br = new BufferedReader(isr);
                    char [] buf = new char[1024];
                    int len = 0;
                    while ((len = br.read(buf)) > 0) {
                        sb.append(buf, 0, len);
                    }
                } else {
                    Log.e(TAG, "Read introduction file error");
                    return;
                }
}
}
//116
public class func{
	public void readResource(String name){
      BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
      while ((read = reader.read(buffer)) != -1) {
        stringBuilder.append(buffer, 0, read);
      }
      inputStream.close();
}
}
//117
public class func{
	public void readProcessStdout(){
         new BufferedInputStream(p.getInputStream());
         new BufferedReader(new InputStreamReader(stdoutStream));
      while((nc = stdoutRead.read(c,0,100)) != -1)
      {
        chunk  = new String(c,0,nc);
        stdout = stdout.append(chunk);
      }
}
}
//118
public class func{
	public void transferData(Reader source,int tz){
        BufferedReader in = new BufferedReader(source);
        while ((read = in.read(bridge, 0, tz)) != -1) {
            this.clob.setString(total +1L, String.copyValueOf(bridge, 0, read));
            total += read;
        }
        in.close();
}
}
//119
public class func{
	public void read(InputStream in){
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in, "UTF-8"));
      while ((read = bufferedReader.read(buffer, 0, buffer.length)) > 0) {
        stringBuilder.append(buffer, 0, read);
      }
      return stringBuilder.toString();
}
}
//120
public class func{
	public void readProcessStderr(){
         new BufferedInputStream(p.getErrorStream());
         new BufferedReader(new InputStreamReader(stderrStream));
      while((nc = stderrRead.read(c,0,100)) != -1)
        stderr = stderr.append(new String(c,0,nc));
}
}
//121
public class func{
	public void doInBackground(String... params){
                                BufferedReader in = new BufferedReader(new InputStreamReader(conn
                                        .getInputStream()));
                                while ((len = in.read(buf)) != -1) {
                                    obj.append(buf, 0, len);
                                }
                                res.putExtra(DB.ACCOUNT.AUTH_CONFIG, obj.toString());
}
}
//122
public class func{
	public void getContentFromInputStream(){
    BufferedReader reader = new BufferedReader(
        new InputStreamReader(inputStream, charSet));
    while ((charsRead = reader.read(chunk, 0, BUF_SIZE)) > 0) {
      sb.append(chunk, 0, charsRead);
    }
    return sb.toString();
}
}
//123
public class func{
	public void readFile(String input){
      fr = new InputStreamReader(new FileInputStream(input), ENCODING);
      br = new BufferedReader(fr);
      while ((len = br.read(buffer)) > -1) {
        content.append(buffer, 0, len);
      }
}
}
//124
public class func{
	public void InMessage(HttpServletRequest request){
      requestBodyReader = new BufferedReader(new InputStreamReader(
          request.getInputStream()));
      while (requestBodyReader.read(buffer) >= 0) {
        requestBody.append(buffer.flip());
        buffer.clear();
      }
}
}
//125
public class func{
	public void computeLineNumber(){
    BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(txtFile), encoding));
      while ((ch = reader.read()) != -1) {
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
//126
public class func{
	public void run(){
    InputStreamReader isr = new InputStreamReader(is);
    BufferedReader br = new BufferedReader(isr);
      while ((read = br.read(cbuf)) != -1) {
        //System.out.println(type + ">number of bytes read: " + read);
        
        if (count < MAX_BYTES) {
          count += read; // might slightly exceed MAX_BYTES
          sb.append(cbuf, 0, read);
        }
      }
}
}
//127
public class func{
	public void getResourceAsString(String resourceName){
            InputStream in = Resource.class.getResourceAsStream(resourceName);
            if (in == null) {
                return null;
            }
            reader = new BufferedReader(new InputStreamReader(in, ENCODING_UTF8));
            while (-1 != (n = reader.read(buffer))) {
                writer.write(buffer, 0, n);
            }
            writer.flush();
            return writer.toString();
}
}
//128
public class func{
	public void assertFileContents(String expected,File file){
            reader = new BufferedReader(new FileReader(file));
            while (-1 != (howMany = reader.read(buffer))) {
                contents.append(buffer, 0, howMany);
            }
            assertEquals("checking file contents for " + file,
                         expected,
                         contents.toString());
}
}
//129
public class func{
	public void process(){
            reader = new BufferedReader(
                new InputStreamReader(resourceLoader.getResourceStream(name),
                                      encoding));
            while ( ( len = reader.read( buf, 0, 1024 )) != -1)
                sw.write( buf, 0, len );
            setData(sw.toString());
}
}
//130
public class func{
	public void readStream(InputStream inputStream){
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            int length = reader.read(buffer);
            assertTrue("Failed to read anything from input stream", length > -1);
            return String.valueOf(buffer, 0, length);
            reader.close();
}
}
//131
public class func{
	public void findString(String filePath,String stringToFind){
        BufferedReader in = new BufferedReader(new FileReader(filePath));
            while ((numread = in.read(data, 0, 8096)) != -1) {
                for (int i = 0; i < numread; i++) {
                    /* If we have found the string already or if we our current
                     * character matches the current char in the target string
                     * then we just add the current character to our result
                     * string and move on.
                     */
                    if (toFindIndex >= stringToFind.length() || data[i] == stringToFind.charAt(toFindIndex)) {
                        if (result == null) {
                            result = new StringBuilder();
                        }
                        if (Character.isISOControl(data[i])) {
                            return result.toString();
                        }
                        result.append(data[i]);
                        toFindIndex++;
                    } else {
                        /* Otherwise things can get complex.  If we haven't
                         * started to match, then just keep going.  If we have
                         * started to match, then we need to move backwards
                         * to make sure we don't miss a match.  For example:
                         * looking for HI in HHI.  If the current character
                         * isn't the same as the last character, then we aren't
                         * going to match, so null everything out and keep
                         * going.  Otherwise, decrment everything by one,
                         * because we didn't match the first character, and
                         * go through the loop on this character again.
                         */
                        if (toFindIndex > 0) {
                            if (data[i] != lastchar) {
                                result = null;
                                toFindIndex = 0;
                                continue;
                            }
                            toFindIndex--;
                            i--;
                            result.deleteCharAt(result.length() - 1);
                            continue;
                        }
                    }
                    lastchar = data[i];
                }
            }
}
}
//132
public class func{
	public void readFileAsString(String fpath){
    BufferedReader reader = new BufferedReader(new FileReader(new File(fpath)));
    while ((numRead=reader.read(buff)) != -1) {
      String readData = String.valueOf(buff, 0, numRead);
      sb.append( readData );
    }
    return sb.toString();
}
}
//133
public class func{
	public void doUpdateModhash(HttpClient client){
        HttpGet httpget = new HttpGet(Constants.MODHASH_URL);
        HttpResponse response = client.execute(httpget);
          entity = response.getEntity();
          BufferedReader in = new BufferedReader(new InputStreamReader(entity.getContent()));
          in.read(buffer, 0, 1200);
          in.close();
}
}
//134
public class func{
	public void readTextFile(File file){
    BufferedReader reader = new BufferedReader(new FileReader(file));
      while ((numRead = reader.read(buf)) != -1) {
        String readData = String.valueOf(buf, 0, numRead);
        fileData.append(readData);
        buf = new char[1024];
      }
      IOUtils.cleanup(null, reader);
}
}
//135
public class func{
	public void readReaderContents(Reader r){
            reader= new BufferedReader(r);
            while ((read= reader.read(part)) != -1)
                buffer.append(part, 0, read);
            return buffer.toString();
}
}
//136
public class func{
	public void readString(InputStream inputStream,final int size){
            reader = new BufferedReader(new InputStreamReader(inputStream));
            reader.read(buffer);
            reader.close();
}
}
//137
public class func{
	public void run(IAction action){
      URL url = Platform.find(bundle, new Path("samples/manifest.txt")); //$NON-NLS-1$
      url = Platform.resolve(url);
      Object content = url.getContent();
      InputStream ins = (InputStream) content;
      int count = ins.available();
      BufferedReader in = new BufferedReader(new InputStreamReader(ins));
      in.read(cbuf);
      in.close();
}
}
//138
public class func{
	public void copy_apk(Activity act,String _sourceDir,String packageName){
      in = new BufferedReader(new FileReader(_sourceDir));
      while ((buf = in.read()) >= 0) {
        out.write((char) buf);
      }
      out.flush();
      out.close();
}
}
//139
public class func{
	public void execute(final String cmd){
            reader = new BufferedReader(new FileReader(file));
            while ((numRead = reader.read(buf)) != -1) {
                String readData = String.valueOf(buf, 0, numRead);
                builder.append(readData);
                buf = new char[1024];
            }
}
}
//140
public class func{
	public void buildDocument(){
      doc.add(new TextField("path", _file.getAbsolutePath(), Store.YES));
        freader = new FileReader(_file);
        BufferedReader br = new BufferedReader(freader);
        int len = br.read(cb, 0, cb.length);
        while (end < len) {
          if (cb[end] == '\n' || cb[end] == '\r') {
            sb.append(cb, start, end - start).append('\n');
            start = end;
            while (start < len && (cb[start] == '\n' || cb[start] == '\r')) {
              start++;
            }
            end = start;
          }
          end++;
        }
}
}
//141
public class func{
	public void readFile(File f){
    BufferedReader in = new BufferedReader(new FileReader(f));
    for(int c; (c = in.read()) != -1; b.append((char)c));
    in.close();      
}
}
//142
public class func{
	public void getTestFileContent(String file){
            reader = new BufferedReader(new FileReader(testFile));
            while ((numRead = reader.read(buf)) != -1) {
                stringWriter.write(buf, 0, numRead);
            }
            result = stringWriter.toString();
}
}
//143
public class func{
	public void getReaderAsString(Reader r){
      reader = new BufferedReader(r);
      while ((charsRead = reader.read(buf)) != -1) {
        text.append(buf, 0, charsRead);
      }
      return text.toString();
}
}
//144
public class func{
	public void loadOvfContents(String ovfPath){
         File ovfFile = new File(ovfPath);
         reader = new BufferedReader(new FileReader(ovfFile));
         AuAssert.check(ovfFile.length() < MAX_OVF_SIZE);
         int totalLen = (int)(ovfFile.length() < MAX_OVF_SIZE ?
                              ovfFile.length() : MAX_OVF_SIZE);
         while (offset < totalLen &&
                (len = reader.read(ovfBuf, offset, totalLen - offset)) != -1) {
            offset += len;
         }
         if (reader != null) {
            reader.close();
         }
      return new String(ovfBuf);
}
}
//145
public class func{
	public void readContent(GetMethod get){
            Reader input = new InputStreamReader(get.getResponseBodyAsStream(), get.getResponseCharSet());
            BufferedReader bufferedReader = (input instanceof BufferedReader) ? (BufferedReader) input
                : new BufferedReader(input);
            while ((charsRead = bufferedReader.read(buffer)) != -1) {
                result.append(buffer, 0, charsRead);
            }
            result.append(get.getResponseBodyAsString());
        return result.toString();
}
}
//146
public class func{
	public void readContent(InputStream input){
        reader = new BufferedReader(isr);
        while ((charsRead = reader.read(charBuff)) > -1) {
          strBuff.append(charBuff, 0, charsRead);
        }
        CodeGenUtil.closeQuietly(reader);
}
}
//147
public class func{
	public void readFileFromClassPath(String filename){
      BufferedReader br = new BufferedReader(new InputStreamReader(
          Export.class.getClassLoader().getResourceAsStream(filename)));
      for (int c = br.read(); c != -1; c = br.read()) 
        sb.append((char)c);
}
}
//148
public class func{
	public void writeCharacterStream(java.io.Reader x){
         BufferedReader bufReader = new BufferedReader(x);
             while( (i = bufReader.read()) != -1 ) {
                char ch = (char)i;
                StringBuffer strBuf = new StringBuffer();
                strBuf.append(ch);

                String str = new String(strBuf);
                String strLine = bufReader.readLine();

                writeString(str.concat(strLine));
             }
}
}
//149
public class func{
	public void readFileFromClasspath(String fileName){
        br = new BufferedReader(new InputStreamReader(new ClassPathResource(fileName).getInputStream(), "UTF-8"));
        for (int c = br.read(); c != -1; c = br.read()) {
            sb.append((char) c);
        }
        return sb.toString();
}
}
//150
public class func{
	public void readString(InputStream stream){
      BufferedReader reader = new BufferedReader(new InputStreamReader(stream, "UTF-8"));
      for (int ch = reader.read(); ch >= 0; ch = reader.read()) {
        buf.append((char) ch);
      }
      return buf.toString();
}
}
//151
public class func{
	public void getReaderAsString(Reader reader){
    BufferedReader in = new BufferedReader(reader);
    while ((n = in.read(buf)) > 0) {
      sw.write(buf, 0, n);
    }
    return sw.toString();
}
}
//152
public class func{
	public void toString(InputStream is){
            br = new BufferedReader(new InputStreamReader(is, charSet));
            for (int read; (read = br.read(buf)) != -1; ) {
                result.append(buf, 0, read);
            }
            return result.toString();
}
}
//153
public class func{
	public void loadLevel(){
      FileReader fstream = new FileReader("save.dat");
      BufferedReader in = new BufferedReader(fstream);
      int deadCounter = in.read();
      in.close();
      result[1] = Integer.valueOf(deadCounter);
}
}
//154
public class func{
	public void run(){
    logger.debug("Loading file into styled text (" + f.getAbsolutePath() + ")");
      BufferedReader in = new BufferedReader(new FileReader(f));
      while(in.ready()){
        in.read(buf);
        file = file + new String(buf);
      }
      styledText.setText(file);
}
}
//155
public class func{
	public void loadTipFile(String tipsFilePath){
    final File tipsFile = new File(tipsFilePath);
    final BufferedReader tipsReader = new BufferedReader(new InputStreamReader(new FileInputStream(tipsFile),
        "UTF-8"));
    final int length = (int) tipsFile.length();
    tipsReader.read(inputLine, 0, length);
    tipsReader.close();
}
}
//156
public class func{
	public void fillsBuffer(){
        for (int i = 0; i < 1000; ++i) {
            sb.append((char)i);
        }
        BufferedReader reader = new BufferedReader(new StringReader(sb.toString()), 101);
        reader.read(buffer);
        assertEquals(499, buffer[499]);
}
}
//157
public class func{
	public void loadPlotData(TownBlock townBlock){
        BufferedReader fin = new BufferedReader(new FileReader(fileName));
          fin.read(key,0,3);
          String test = new String(key);
          switch (elements.fromString(test)) {
          case VER:
            // Read the file version
            int version = fin.read();
            plotBlockData.setVersion(version);
            
            // next entry is the plot height
            plotBlockData.setHeight(fin.read());
            break;
            
          default:
            /*
             * no version field so set height
             * and push rest to queue
             * 
             */
            plotBlockData.setVersion(0);
            // First entry is the plot height
            plotBlockData.setHeight(key[0]);
            IntArr.add((int) key[1]);
            IntArr.add((int) key[2]);
          }
}
}
//158
public class func{
	public void readFile(String filename){
    BufferedReader in = new BufferedReader(new FileReader(f));
    in.read(readIn);
    readString = new String(readIn);
}
}
//159
public class func{
	public void fileToChars(char[] p,String fileName){
      FileReader fr = new FileReader(fileName);
      BufferedReader br = new BufferedR
}
}
//160
public class func{
	public void run(){
        BufferedReader bufferedReader = new BufferedReader(reader);
        for (readResult = bufferedReader.read(buffer);readResult>=0;readResult = bufferedReader.read(buffer))
        {
          processOutputStreamWriter.write(buffer, 0, readResult);
        }
        processOutputStreamWriter.close();
}
}
//161
public class func{
	public void test_readLine_interaction_with_array_read_1(){
        BufferedReader r = new BufferedReader(new StringReader("1\r\n2"));
        assertEquals(2, r.read(new char[2], 0, 2));
        assertEquals("", r.readLine()); // The '\r' we read() didn't count.
        assertEquals("2", r.readLine());
        assertNull(r.readLine());
}
}
//162
public class func{
	public void test_read(){
        assertTrue(new BufferedReader(new CharArrayReader(new char[5], 1, 0), 2).read() == -1);
}
}
//163
public class func{
	public void test_read$CII_Exception(){
            new BufferedReader(new PipedReader(), 9).read(new char[] {}, 7, 0);
}
}
//164
public class func{
	public void Read(File file,String encoding){
            BufferedReader in = new BufferedReader(new FileReader(file));
            char[] allChars = new char[(int) file.length()];
            in.read(allChars, 0, (int) file.length());
            in.close();
}
}
//165
public class func{
	public void parseFile(String file,String encoding){
    File path = new File(file);
    FileInputStream in = new FileInputStream(path);
    InputStreamReader inr = new InputStreamReader(in, encoding);
    BufferedReader bfr = new BufferedReader(inr);
    char[] doc = new char[(int) path.length()];
    bfr.read(doc);
}
}
//166
public class func{
	public void testProxyWhiteList(){
            SimpleHttpResponse response = readResponse(input);
            Assert.assertEquals("403", response.getCode());
            Assert.assertEquals(-1, input.read());
            OutputStream output = socket.getOutputStream();
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
}
}
//167
public class func{
	public void testOpenRequestClose(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        SimpleHttpResponse response = httpParser.readResponse(reader);
        Assert.assertEquals("200", response.getCode());
        Assert.assertEquals(-1, reader.read());
        socket.close();
}
}
//168
public class func{
	public void testSSLOpenRequestClose(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        SimpleHttpResponse response = httpParser.readResponse(reader);
        Assert.assertEquals("200", response.getCode());
        Assert.assertEquals(-1, reader.read());
        socket.close();
}
}
//169
public class func{
	public void testClientRequestStallsContentProxyIdlesTimeout(){
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
            SimpleHttpResponse response = parser.readResponse(reader);
            Assert.assertTrue(Integer.parseInt(response.getCode()) >= 500);
            String connectionHeader = response.getHeaders().get("connection");
            Assert.assertNotNull(connectionHeader);
            Assert.assertTrue(connectionHeader.contains("close"));
            Assert.assertEquals(-1, reader.read());
}
}
//170
public class func{
	public void leavesMark(){
        for (int i = 0; i < 1000; ++i) {
            sb.append((char)i);
        }
        BufferedReader reader = new BufferedReader(new StringReader(sb.toString()), 100);
        reader.skip(50);
        reader.mark(70);
        reader.skip(60);
        reader.reset();
        int charsRead = reader.read(buffer);
        assertEquals(199, buffer[149]);
}
}
//171
public class func{
	public void testSplitMultiLine(){
        BufferedReader br = new BufferedReader(new StringReader(line));
        out = CSVSaveService.csvReadFile(br, ',');
        checkStrings(new String[]{"a","","c\nd","e"}, out);
        out = CSVSaveService.csvReadFile(br, ',');
        checkStrings(new String[]{"","","f","g",""}, out);
        out = CSVSaveService.csvReadFile(br, ',');
        checkStrings(new String[]{""}, out); // Blank line
        assertEquals("Expected to be at EOF",-1,br.read());
        out = CSVSaveService.csvReadFile(br, ',');
        checkStrings(new String[]{}, out);
        out = CSVSaveService.csvReadFile(br, ',');
        checkStrings(new String[]{}, out);
}
}
//172
public class func{
	public void testSchema(){
        for (int ch; (ch = in.read()) != -1;)
            buf.append((char) ch);
        in.close();
}
}
//173
public class func{
	public void read(InputStream in){
        for (int n; (n = reader.read(c)) != -1;) {
            out.append(new String(c, 0, n));
        }
        reader.close();
}
}
//174
public class func{
	public void newBufferedReader(){
        final CharBuffer buffer = CharBuffer.allocate(contents.length());
        reader.read(buffer);
        reader.close();
}
}
//175
public class func{
	public void newBufferedReader(){
        reader.close();
            reader.read();
}
}
//176
public class func{
	public void pipe(BufferedReader br){
    StringBuffer sb = new StringBuffer (BUFSIZE);
    do {
      count = br.read (buf, 0, BUFSIZE);
      sb.append (buf);
    } while (count == BUFSIZE);
    lexer.setCharSequence ((CharSequence)sb);
}
}
