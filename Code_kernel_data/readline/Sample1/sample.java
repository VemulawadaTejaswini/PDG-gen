//0
public class func{
	public void readJournalLines(){
    BufferedReader reader = new BufferedReader(new FileReader(journalFile));
    while ((line = reader.readLine()) != null) {
      result.add(line);
    }
    reader.close();
}
}
//1
public class func{
	public void readFromStream(InputStream inputStream){
    BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
    String line = in.readLine();
    while (line != null) {
      read += line + "\n";
      line = in.readLine();
    }
}
}
//2
public class func{
	public void getRegex(){
        BufferedReader r = new BufferedReader(new FileReader("floppy_regex.txt"));
        while ((line = r.readLine()) != null)
            reg.add(new Pair(line, r.readLine()));
}
}
//3
public class func{
	public void printResponse(HttpResponse response){
      BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
      String line = reader.readLine();
      while (line != null)
      {
         System.out.println(line);
         line = reader.readLine();
      }
}
}
//4
public class func{
	public void performCheck(File file){
      BufferedReader in = new BufferedReader(new FileReader(file));
      while ((line = in.readLine()) != null) {
        if (line.trim().length() > 0)
          total++;
      }
      in.close();
}
}
//5
public class func{
	public void readDemoClassNames(Reader reader){
        BufferedReader breader = new BufferedReader(reader);
        while((line = breader.readLine()) != null) {
            demoClassNames.add(line);
        }
        breader.close();
}
}
//6
public class func{
	public void readFileToVector(String file){
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        while ((line = buffer.readLine()) != null) {
            String[] arr = line.split(",");
            vectors.add(new DenseVector(new double[] { Double.parseDouble(arr[0]), Double.parseDouble(arr[1]) }));
        }
        buffer.close();
}
}
//7
public class func{
	public void readInputFile(File input){
    BufferedReader br = new BufferedReader(new FileReader(input));
    while ((line = br.readLine()) != null) {
       line = line.toLowerCase().trim();
       out.add(line);
    }
    br.close();
}
}
//8
public class func{
	public void catInto(String src,String dest){
        BufferedReader in = new BufferedReader(new FileReader(src));
        while ((str = in.readLine()) != null) {
            out.write(str);
        }
        in.close();
}
}
//9
public class func{
	public void main(String[] args){
    BufferedReader reader = new BufferedReader(new FileReader(args[0]));
    while ((line = reader.readLine()) != null) {
      BasicNode tree = (BasicNode)Serialization.deserialize(line);
      System.out.println(tree);
    }
    reader.close();
}
}
//10
public class func{
	public void getContent(String name){
        BufferedReader br = new BufferedReader(new FileReader(name));
        while ((line = br.readLine()) != null) {
            file += (line + '\n');
        }
        br.close();
}
}
//11
public class func{
	public void loadTestingIDs(File testingIDFile){
        BufferedReader in = new BufferedReader(new FileReader(testingIDFile));
        while ((id = in.readLine()) != null) {
            testingIDs.add(id);
        }
        in.close();
}
}
//12
public class func{
	public void readCustList(String fileName){
    BufferedReader is = new BufferedReader(new FileReader(fileName));
    while ((line = is.readLine()) != null) {
      custList.add(line);
    }
    is.close();
}
}
//13
public class func{
	public void readFile(final String filename){
    final BufferedReader in = new BufferedReader(new FileReader(filename));
    while ((line = in.readLine()) != null) {
      contents += line;
    }
    in.close();
}
}
//14
public class func{
	public void readCaptchaFile(String fileName){
      BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
      while((line = reader.readLine()) != null)
        captchaList.add(line);
      reader.close();
}
}
//15
public class func{
	public void countLines(File file){
    BufferedReader reader = new BufferedReader(new FileReader(file));
    while (reader.readLine() != null) {
      lines++;
    }
    reader.close();
}
}
//16
public class func{
	public void dumpPWInfoFile(File infoFile){
        BufferedReader bf = new BufferedReader(new FileReader(infoFile));
        while (( line = bf.readLine()) != null) {
            System.out.println(line);
        }
        bf.close();
}
}
//17
public class func{
	public void countLines(){
    BufferedReader buffRdr = new BufferedReader(new FileReader(
        this.graphFile));
    while (buffRdr.readLine() != null) {
      count++;
    }
    buffRdr.close();
}
}
//18
public class func{
	public void readFile(File file){
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while ((line=reader.readLine())!=null) {
            result += line;
            result += "\n";
        }
        reader.close();
}
}
//19
public class func{
	public void parse(Reader reader){
      BufferedReader in = new BufferedReader( reader );
      while( (line = in.readLine()) != null ) {
         buffer.append( line ).append( "\n" );
      }
}
}
//20
public class func{
	public void getStringFromStream(Reader reader){
    BufferedReader br = new  BufferedReader(  reader );
    while (  ( line = br.readLine() ) != null )
      sb.append( line  +"\n");
    return sb.toString();
}
}
//21
public class func{
	public void readFileLines(String filename){
    File file = new File(filename);
    BufferedReader reader = new BufferedReader(new FileReader(file));
    while((line = reader.readLine()) != null) {
      lines.add(line);
    }
}
}
//22
public class func{
	public void parse(Reader reader){
    BufferedReader br = new BufferedReader(reader);
    while ((line = br.readLine()) != null) {
      if (!line.startsWith("#")) {
        parse(line);
      }
    }
}
}
//23
public class func{
	public void loadReaderToList(Reader reader){
    BufferedReader bufferedReader = new BufferedReader(reader);
    while ((line = bufferedReader.readLine()) != null) 
      outList.add(line);
}
}
//24
public class func{
	public void getExpectedDocument(Reader input){
        BufferedReader lineInput = new BufferedReader(input);
        while ((line = lineInput.readLine()) != null) {
            lines.add(line);
        }
        return lines.toArray(new String[lines.size()]);
}
}
//25
public class func{
	public void describe(Reader contents,IContentDescription description){
    BufferedReader reader = new BufferedReader(contents);
    while((line = reader.readLine()) != null){
      if(line.indexOf("<" + this.tagName) >= 0){
        return VALID;
      }
    }
}
}
//26
public class func{
	public void load(String file){
    BufferedReader br = new BufferedReader(new FileReader(file));
    while ((line = br.readLine()) != null) {
      String[] parts = line.split(", ");
      map.put(Long.parseLong(parts[0]), Integer.parseInt(parts[1]));
    }
}
}
//27
public class func{
	public void loadIntegersFromFile(String filename){
    BufferedReader reader = new BufferedReader(new FileReader(new File(filename)));
    while ((line = reader.readLine()) != null) {
      result.add(Integer.parseInt(line.trim()));
    }
}
}
//28
public class func{
	public void setStopwords(File stopwordFile){
    BufferedReader input = new BufferedReader(new FileReader(stopwordFile)) ;
    while ((line=input.readLine()) != null) 
      stopwords.add(line.trim()) ;
}
}
//29
public class func{
	public void readLinesFromFile(String fileName){
    BufferedReader br = new BufferedReader(new InputStreamReader(ClassLoader.getSystemResourceAsStream(fileName)));
    while (br.ready()) {
      lines.add(br.readLine());
    }
}
}
//30
public class func{
	public void loadStopWords(String f){
    BufferedReader br = new BufferedReader(new FileReader(f));
    while ((line = br.readLine()) != null) {
      stopWords.add(line);
      stopWords.add(stem(line));
    }
}
}
//31
public class func{
	public void readFileToString(File file){
    BufferedReader br = new BufferedReader(new FileReader(file));
    while ((line = br.readLine()) != null)
    {
      res += line + "\n";
    }
}
}
//32
public class func{
	public void lineCount(File textFile){
    BufferedReader r = new BufferedReader(new FileReader(textFile));
    while (r.readLine()!=null) {
      numLines++;
    }
}
}
//33
public class func{
	public void extractList(String fileName){
    BufferedReader br = new BufferedReader(new FileReader(fileName));
    while ((ln = br.readLine()) != null) {
      res.add(Integer.parseInt(ln));
    }
}
}
//34
public class func{
	public void copy(String filename,PrintStream out){
        BufferedReader br = new BufferedReader(new FileReader(filename));
        while ((s = br.readLine()) != null) {
            out.println(s);
        }
}
}
//35
public class func{
	public void checkFile(File f){
    BufferedReader fr = new BufferedReader(new FileReader(f));
    while ((l = fr.readLine()) != null) {
      cnt++;
    }
}
}
//36
public class func{
	public void readTranscription(){
    BufferedReader txtReader = new BufferedReader(new FileReader(textFile));
    while ((line = txtReader.readLine()) != null) {
      finalText += " " + line;
    }
}
}
//37
public class func{
	public void fileContent(File file){
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while ((line = reader.readLine()) != null) {
            content += line;
        }
}
}
//38
public class func{
	public void loadTags(OpenObjectIntHashMap<String> tags){
    BufferedReader reader = new BufferedReader(new FileReader(countFile));
    while ((line = reader.readLine()) != null) {
      int pos = line.lastIndexOf('\t');
      String tag = new String(line.substring(pos+1));
      tags.adjustOrPutValue(tag, 0, 0);
    }
}
}
//39
public class func{
	public void readFromStream(InputStream in){
      BufferedInputStream inputStream = new BufferedInputStream(in);
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
      while(bufferedReader.ready()) {
         result.append(bufferedReader.readLine());
      }
      return result.toString();
}
}
//40
public class func{
	public void makeNewLinesCompatibleWithJUnit(String string){
      BufferedReader reader = new BufferedReader(new StringReader(string));
      while ((line = reader.readLine()) != null)
        writer.println(line);
}
}
//41
public class func{
	public void indexSentence(Sentence sentence,int docCount){
    final BufferedReader reader = new BufferedReader(new StringReader(sentence.getText()));
    while ((line = reader.readLine()) != null) {
      add(line, sentence.getSource(), sentence.getTitle(), docCount);
    }
}
}
//42
public class func{
	public void readSource(File sourcefile){
      JavaSource js = new JavaSource(sourcefile);
      BufferedReader r = new BufferedReader(new FileReader(sourcefile));
      while((l = r.readLine()) != null) {
        js.addLine(i++,l);
      }
}
}
//43
public class func{
	public void sourceFile(File f){
    BufferedReader dotRc = new BufferedReader(new FileReader(f));
    while(null != (line = dotRc.readLine())) {
      shell.executeCommand(line);
    }
}
}
//44
public class func{
	public void eachLine(Action<String> action){
        BufferedReader reader = new BufferedReader(new StringReader(getOutput()));
            while ((line = reader.readLine()) != null) {
                action.execute(line);
            }
}
}
//45
public class func{
	public void __logIt(ProtocolCommandEvent event){
    BufferedReader br = new BufferedReader(new StringReader(event.getMessage()));
    while ((line = br.readLine()) != null) {
      __logger.info("ftp> " + line);
    }
}
}
//46
public class func{
	public void getCodeFromIFile(IFile file){
    while((line = br.readLine()) != null) {
      code.append(line);
      code.append('\n');
    }
    br.close();
}
}
//47
public class func{
	public void load(final Reader reader){
        checkNotNull(reader);
        BufferedReader input = new BufferedReader(reader);
        while ((item = input.readLine()) != null) {
            internalAdd(item);
        }
}
}
//48
public class func{
	public void testUnfolding(){
        BufferedReader b = new BufferedReader(reader, BUFFER_SIZE);
        while ((line = b.readLine()) != null) {
            assertFalse(line.matches("^\\s.*"));
        }
}
}
//49
public class func{
	public void printText(PrintWriter out,Reader txtReader,String tabSpace){
        BufferedReader in = new BufferedReader(txtReader);
            while ((line = in.readLine()) != null) {
                out.printf("  %-16.16s %s\n", tabSpace, line);
            }
}
}
//50
public class func{
	public void getFileContents(File file){
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while (reader.ready()) {
            contents += reader.readLine() + '\n';
        }
}
}
//51
public class func{
	public void getDocumentContents(Document document){
    while((line = buffered_reader.readLine()) != null) 
      line_buffer.append(line).append('\n');
    buffered_reader.close();  
}
}
//52
public class func{
	public void readLines(Reader r){
        BufferedReader br = new BufferedReader(r);
        while ((line = br.readLine()) != null) {
            l.add(line);
        }
        return (String[]) l.toArray(new String[0]);
}
}
//53
public class func{
	public void readResponse(HttpURLConnection conn){
        while((line=in.readLine())!=null) {
                buff.append(line);
        }
        in.close();
}
}
//54
public class func{
	public void getContentAsString(){
        while ((str = in.readLine()) != null) {
            sb.append(str + "\n");
        }
        in.close();
}
}
//55
public class func{
	public void readFile(File cFile){
        while((line = fr.readLine()) != null){
            sb.append(line);
            System.err.print(line);
        }
        fr.close();
}
}
//56
public class func{
	public void readIndex(Reader reader,Set<String> entries){
    BufferedReader bufferedReader = new BufferedReader(reader);
    while ((line = bufferedReader.readLine()) != null) {
      entries.add(line);
    }
    reader.close();
}
}
//57
public class func{
	public void consumeMultiLineContent(String s){
        BufferedReader stringReader = new BufferedReader( new StringReader( s ) );
        while ( ( s1 = stringReader.readLine() ) != null )
        {
            consumeLine( s1 );
        }
}
}
//58
public class func{
	public void parsePackageList(String packageList){
    StringReader reader = new StringReader(packageList);
    BufferedReader breader = new BufferedReader(reader);
    while ((line = breader.readLine()) != null) {
      packages.add(line);
    }
}
}
//59
public class func{
	public void slurp(String fname){
    while ( (str=istream.readLine()) != null) {
      String [] parts = str.split(",");
      l.add(parts[0] + ":" + parts[1] + ":" + parts[2]);
    }
    istream.close();
}
}
//60
public class func{
	public void processInMemoryPathsFile(byte[] inMemoryFileData){
    CharBuffer charBuf = Charset.forName("UTF8").decode(ByteBuffer.wrap(inMemoryFileData));
    BufferedReader reader = new BufferedReader(new CharArrayReader(charBuf.array(),0,charBuf.limit()));
    while ((nextLine = reader.readLine()) != null) {
      LOG.info("Compiling in memory path pattern:" + nextLine);
      memoryOnlyPaths.add(Pattern.compile(nextLine));
    }
}
}
//61
public class func{
	public void append(Reader reader){
        BufferedReader buf = new BufferedReader(reader);
        while ((line = buf.readLine()) != null)
            _buf.append(line).append(SEP);
}
}
//62
public class func{
	public void readJensenLabAnnotations(){
    this.info("read DOID-Annotation from "+DOI_ANN);
    BufferedReader in=IOUtils.openURIForBufferedReading(DOI_ANN);
    while((line=in.readLine())!=null)
      {
      if(!line.startsWith("ENSP")) continue;
      }
    in.close();
}
}
//63
public class func{
	public void VerifyingTaskListener(File ref){
        while ((line = in.readLine()) != null)
            lines.add(line);
        in.close();
}
}
//64
public class func{
	public void fileToLines_(File f){
        while ((l = r.readLine()) != null) {
            lines.add(l);
        }
        r.close();
}
}
//65
public class func{
	public void readUsingJava(String input,int chunk){
    while ((line = r.readLine()) != null) {
      lines.add(line);
    }
    r.close();
}
}
//66
public class func{
	public void FileSource(String description,Reader reader){
            while ((line = br.readLine()) != null) {
                items.add(line);
            }
            br.close();
}
}
//67
public class func{
	public void readFile(Reader simpleReader){
        while ((line = reader.readLine()) != null) {
            res.add(line);
        }
        reader.close();
}
}
//68
public class func{
	public void readDictionary(String filename){
    while ((line = reader.readLine()) != null) {
      tokens = line.split("\\t");
      projDict.put(tokens[0], tokens[1]);
    }
    reader.close();
}
}
//69
public class func{
	public void loadColors(String file){
        while ((line = reader.readLine()) != null) {
            String[] tokens = line.split("\t");
            map.put(tokens[0], tokens[1]);
        }
        reader.close();
}
}
//70
public class func{
	public void readFixture(String fixture){
        BufferedReader reader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream(fixture)));
        while(reader.ready()) {
            result += reader.readLine() + "\n";
        }
}
}
//71
public class func{
	public void readLines(String filename){
    while ((line = bufferedReader.readLine()) != null) {
      lines.add(line);
    }
    bufferedReader.close();
}
}
//72
public class func{
	public void readKeys(String keyFilename){
    BufferedReader reader = FileManager.getReader(keyFilename);
    while ((line = reader.readLine()) != null)
      kTable.put(line, 0.0);
    reader.close();
}
}
//73
public class func{
	public void ExecResult(final ExecResultType type,final BufferedReader br){
         while (((line = br.readLine()) != null)) {
            _result.append(line);
         }
         br.close();
}
}
//74
public class func{
	public void consumeIDs(URLConnection connection,FastIDSet result){
    BufferedReader reader = IOUtils.bufferStream(connection.getInputStream());
      while ((line = reader.readLine()) != null) {
        result.add(Long.parseLong(line));
      }
      reader.close();
}
}
//75
public class func{
	public void dumpFile(String fileName){
    while((line = reader.readLine()) != null) {
      LOG.debug(line);
    }
    reader.close();
}
}
//76
public class func{
	public void getSensorDetails(URL target,String url){
    while ((inputLine = in.readLine()) != null)
      result.append(inputLine +"\n");
    in.close();
}
}
//77
public class func{
	public void loadMap(String file){
    while ((line = bInput.readLine()) != null) {
      parseMapLine(moduleTable, line);
    }
    bInput.close();
}
}
//78
public class func{
	public void innerCreate(BufferedReader reader){
        while ((l = reader.readLine()) != null)
            cbl.getLines().add(l);
        reader.close();
}
}
//79
public class func{
	public void readLinesFromFile(BufferedReader reader){
        while (line != null) {
            line = reader.readLine();
            if (line != null) {
                lines.add(line.trim());
            }
        }
}
}
//80
public class func{
	public void getPluginPaths(BufferedReader reader){
        while ((line = reader.readLine()) != null) {
            if (line.startsWith("#")) {
                continue;
            }
            pluginPaths.add(line);
        }
}
}
//81
public class func{
	public void collectLines(ArrayList<String> lines,BufferedReader reader){
    while (null != (line = reader.readLine())) {
      line = line.trim();
      if (line.length() > 0 && !line.startsWith("#")) {
        for (String arg : line.split("\\s+")) {
          lines.add(arg);
        }
      }
    }
}
}
//82
public class func{
	public void getBodyMessage(HttpServletRequest request){
    BufferedReader reader = request.getReader();
    while ((line = reader.readLine()) != null)
      jb.append(line);
    return jb.toString();
}
}
//83
public class func{
	public void convert(String r){
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        return new String(XFormsConverter.fixStyle(sb.toString().getBytes()));
}
}
//84
public class func{
	public void inputStream2String(InputStream is){
        while ((line = in.readLine()) != null) {
            buffer.append(line);
        }
        return buffer.toString();
}
}
//85
public class func{
	public void inputStream2String(InputStream is){
    while ((line = in.readLine()) != null) {
      buffer.append(line);
    }
    return buffer.toString();
}
}
//86
public class func{
	public void runCommand(String command){
        while ((line = br.readLine()) != null) {
            stringBuffer.append(line);
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
}
}
//87
public class func{
	public void readFile(File tmpFile){
    while ((strLine = fi.readLine()) != null)   {
      out.append(strLine);
      out.append("\n");
    }
    return out.toString();
}
}
//88
public class func{
	public void readTextFileAsString(String fileName){
        while ((line = br.readLine()) != null) {
            buffer.append(line);
        }
        return buffer.toString();
}
}
//89
public class func{
	public void readFile(FileSystem fs,Path path){
        while((line=reader.readLine()) != null) {
            contents.append(line);
        }
        return contents.toString();
}
}
//90
public class func{
	public void handlePutMetadata(BufferedReader reader,String boundary,IFileStore file){
    while ((line = reader.readLine()) != null && !line.equals(boundary))
      buf.append(line);
}
}
//91
public class func{
	public void getContents(InputStream inputStream){
    while( (line = reader.readLine())!=null ) {
      contents.append(line);
      contents.append("\n");
    }
    return contents.toString();
}
}
//92
public class func{
	public void readerToString(BufferedReader reader){
            while ((line = reader.readLine()) != null)
                rawBody.append(line);
}
}
//93
public class func{
	public void getResult(InputStream result){
        while ((line = reader.readLine())  != null) {
            buf.append(line + "\n");
        }
}
}
//94
public class func{
	public void readAllResultLines(List<String> target,String resultPath,boolean inOrderOfFiles){
    for (BufferedReader reader : getResultReader(resultPath, inOrderOfFiles)) {
      String s = null;
      while ((s = reader.readLine()) != null) {
        target.add(s);
      }
    }
}
}
//95
public class func{
	public void loadFile(InputStream st){
    while ((buffer = br.readLine()) != null) {
      result.append(buffer);
    }
    st.close();
}
}
//96
public class func{
	public void readResourceTypes(TestData data,BufferedReader reader){
        while((line = reader.readLine()) != null) {
            if(line.contains("Type")) {
                String[] split = line.split(":");
                data.resTypes.add(split[1].trim());
            }
        }
}
}
//97
public class func{
	public void getLines(){
      while ((line = reader.readLine()) != null) {
        lines.add(line);
      }
}
}
//98
public class func{
	public void getLines(Channel channel){
      while ((line = reader.readLine()) != null) {
        lines.add(line);
      }
}
}
//99
public class func{
	public void loadLines(@NotNull BufferedReader reader){
    while ((line = reader.readLine()) != null) {
      lines.add(line);
    }
}
}
//100
public class func{
	public void getLines(String encoding){
    while ((line = reader.readLine()) != null) {
      lines.add(line);
    }
}
}
//101
public class func{
	public void loadCommonWords(BufferedReader wordsReader){
        while ((text = wordsReader.readLine()) != null) {
                words.add(text);
        }
}
}
//102
public class func{
	public void spool(BufferedReader reader,PrintWriter out,String tag){
        while ((line = reader.readLine()) != null) {
            if (line.equals(tag)) {
                return;
            }
            out.println(line);
        }
}
}
//103
public class func{
	public void getLines(BufferedReader br){
    while ((line = br.readLine()) != null) {
      if (!line.startsWith("#")) {
        lines.add(line.getBytes("utf-8"));
      }
    }
}
}
//104
public class func{
	public void scan(BufferedReader in){
      while((line=in.readLine())!=null)
          {
          if(line.isEmpty() || line.startsWith("#")) continue;
          analyze(new File(line));
          }
}
}
//105
public class func{
	public void parseCathNames(BufferedReader bufferedReader){
        while ( (line = bufferedReader.readLine()) != null ) {
            if ( line.startsWith("#") ) continue;
            CathNode cathNode = parseCathNamesFileLine(line);
            cathTree.put(cathNode.getNodeId(), cathNode);
        }
}
}
//106
public class func{
	public void readURLFile(Reader reader){
    while ((line = in.readLine()) != null) {
      if (line.length() != 0) {
        list.add(new FilteredURL(line));
      }
    }
    return (FilteredURL[]) list.toArray(new FilteredURL[list.size()]);
}
}
//107
public class func{
	public void getNumberOfRatings(BufferedReader reader){
    while ((line = reader.readLine()) != null)
      if (!line.contains("|"))
        num_ratings++;
}
}
//108
public class func{
	public void parseHeaderLines(BufferedReader r){
    while((line=r.readLine())!=null && line.startsWith("#"))
      {
      stack.add(line);
      if(line.startsWith("#CHROM\t")) break;
      }
}
}
//109
public class func{
	public void forwardToTag(String tagName,BufferedReader br){
        while ((sCurrentLine = br.readLine()) != null) {
            String lowerCaseLine = sCurrentLine.toLowerCase();
            if (lowerCaseLine.indexOf(tagName) >= 0) {
                return true;
            }
        }
}
}
//110
public class func{
	public void ParameterChecker(BufferedReader reader){
        while ((s = reader.readLine()) != null) {
            String[] tokens = s.split("\\s");
            map.put(tokens[0], tokens);
        }
}
}
//111
public class func{
	public void getStringSet(InputStream in){
    while ((line = reader.readLine()) != null)
      set.add(line.trim());
}
}
//112
public class func{
	public void readAll(final BufferedReader in,final boolean split){
       while ((record=in.readLine()) != null) {
           count++;
           fields+= split ? record.split(",").length : 1;
       }
       return new Stats(count, fields);
}
}
//113
public class func{
	public void readLines(File f){
        while ((line = r.readLine()) != null) {
            answer.add(line);
        }
}
}
//114
public class func{
	public void indexText(BufferedReader reader){
    while ((line = reader.readLine()) != null) {
      final List<String> sentences = sentenceTokenizer.tokenize(line);
      for (String sentence : sentences) {
        add(sentence, null, null, -1);
      }
    }
}
}
//115
public class func{
	public void serve(InputStream inputStream){
        while (!(a.equals("===quit"))) {
            a = br.readLine();
            logger.info("Received WebSocket Message {}", a);
            processor.invokeWebSocketProtocol(webSocket(inputStream), a);
        }
}
}
//116
public class func{
	public void writeProjectFile(File intoDir,String projectName,String sourcePath,String fileName){
    while ((line = bufferedReader.readLine()) != null) {
      writer.println(line.replace("{{projectName}}", projectName));
    }
    writer.close();
}
}
//117
public class func{
	public void loadFile(String name){
        while ((s = data.readLine()) != null)
        {
            lines.add(s);
        }
        return (String[])lines.toArray(new String[lines.size()]);
}
}
//118
public class func{
	public void dumpXACMLRequest(HttpServletRequest req){
        BufferedReader r = req.getReader();
        while ((line = r.readLine()) != null)
            System.out.println(line);
}
}
//119
public class func{
	public void translateLines(BufferedReader br,BufferedWriter bw){
      while ((line = br.readLine()) != null) {
        bw.write(apply(line));
        bw.newLine();
      }
}
}
//120
public class func{
	public void readRows(BufferedReader br){
        while ((line = br.readLine()) != null) {
            lines.add(line.getBytes(ENCODING));
        }
}
}
//121
public class func{
	public void parseKeyStrokes(BufferedReader in){
        while ((line = in.readLine()) != null) {
            char ch = line.charAt(0);
            String keyStrokeSpec = line.substring(2);
            keyStrokes.put(ch, KeyStroke.getKeyStroke(keyStrokeSpec));
        }
}
}
//122
public class func{
	public void countLinesTracked(){
            BufferedReader br = toBufferedReader();
            while (br.readLine() != null) {
                lines++;
            }
}
}
//123
public class func{
	public void lineCount(String textFileOrUrl){
    BufferedReader r = readerFromString(textFileOrUrl);
    while (r.readLine() != null) {
      numLines++;
    }
}
}
//124
public class func{
	public void renameBuildFromReaderToWriter(String oldBuildName,String newBuildName,BufferedReader oldFileReader,FileWriter newFileWriter){
        while ( ( oldLine = oldFileReader.readLine() ) != null )
        {
            String newLine = oldLine.replaceAll( oldBuildName, newBuildName );
            newFileWriter.write( newLine );
        }
}
}
//125
public class func{
	public void readAll(final BufferedReader in){
        while (in.readLine() != null) {
            count++;
        }
}
}
//126
public class func{
	public void loadAffiliationsFromTxt(BufferedReader reader){
        while ((text = reader.readLine()) != null) {
                DocumentAffiliation affiliation = new DocumentAffiliation(text);
                affiliation.setTokens(tokenizer.tokenize(affiliation.getRawText()));
                affiliations.add(affiliation);
        }
}
}
//127
public class func{
	public void assertReaders(final BufferedReader expected,final BufferedReader actual){
        while ((expectedLine = expected.readLine()) != null) {
            final String actualLine = actual.readLine();
            Assert.assertNotNull("Expected had more lines than the actual.", actualLine);
            Assert.assertEquals(expectedLine, actualLine);
        }
}
}
//128
public class func{
	public void readLines(String filename){
    while ((line = reader.readLine()) != null)
      vector.add(line);
}
}
//129
public class func{
	public void readGroundTruth(String csv_filename){
      while((line = bufRdr.readLine()) != null) {
         ret.add(new OCRTruth(line));
      }
}
}
//130
public class func{
	public void checkAll(String scope){
    while((line = in.readLine()) != null) {
      String out = normalizers.normalize(line, scope);
      System.out.println(out);
    }
}
}
//131
public class func{
	public void interpret(BufferedReader reader){
            while ((line = reader.readLine()) != null) {
                paths.add(line);
            }
}
}
//132
public class func{
	public void getPatternList(BufferedReader reader){
    while ((line = reader.readLine()) != null)
      addLine(patternList, line);
}
}
//133
public class func{
	public void readContent(final BufferedReader reader){
    while ((line = reader.readLine()) != null) {
      content += line;
      // Mimic Props writer functionality
      content += '\n';
    }
}
}
//134
public class func{
	public void readLsfile(File lsFile){
    while((line = br.readLine()) != null) 
      readLsLine(line, fileContents);
}
}
//135
public class func{
	public void cat(final BufferedReader reader){
        while ((line = reader.readLine()) != null) {
            if (displayLineNumbers) {
                System.out.print(String.format("%6d  ", lineno++));
            }
            System.out.println(line);
        }
}
}
//136
public class func{
	public void readResponseLinesFromSauceLabToGetJobUrl(BufferedReader reader){
        while ((responseLineFromSauceLabs = reader.readLine()) != null) {
            jobUrl = jobUrl + processSauceLabsResponseLine(responseLineFromSauceLabs);
        }
}
}
//137
public class func{
	public void appendContentBody(Appendable buf){
    recordContentBody();
    final BufferedReader br = getReader();
    while((line=br.readLine())!=null) {
      buf.append(line);
    }
}
}
//138
public class func{
	public void harvestSqlCommands(BufferedReader reader){
        while((line = reader.readLine()) != null) {
            boolean newCommand = SingleLogLineAnalyser.isItStartOfNewCommand(line);
            harvester.processCommandFragment(line, newCommand);
        }
        return harvester.getCommandsInTime();
}
}
//139
public class func{
	public void parseWaypointLines(BufferedReader reader){
    while ((line = reader.readLine()) != null) {
      try {
        parseLine(line);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
}
}
//140
public class func{
	public void copyStream(final BufferedReader in,final PrintWriter out,final String[] mapFrom,String[] mapTo){
        while ((line = in.readLine()) != null) {
            for (int i=0; i<mapFrom.length; i++) {
                line = line.replaceAll(mapFrom[i],mapTo[i]);
            }
            out.println(line);
        }
}
}
//141
public class func{
	public void readTemplate(InputStream template){
        while ((line = reader.readLine())  != null) {
            buf.append(line + System.getProperty("line.separator"));
        }
}
}
//142
public class func{
	public void logOutput(String message,InputStream in){
    while ((line = bin.readLine()) != null) {
      buffer.append(Tools.getLineSeparator());
      buffer.append(line);
    }
}
}
//143
public class func{
	public void readFromFile(String filename){
    while ((line = reader.readLine()) != null) writer.write(line + "\n");
    return writer.getBuffer().toString();
}
}
//144
public class func{
	public void lineCount(File file){
    BufferedReader reader = getReader(file);
    while (reader.readLine() != null) {
      count++;
    }
}
}
//145
public class func{
	public void copyStream(final BufferedReader in,final PrintWriter out,final String[] mapFrom,String[] mapTo){
        while ((line = in.readLine()) != null) {
            for (int i = 0; i < mapFrom.length; i++) {
                line = line.replaceAll(mapFrom[i], mapTo[i]);
            }
            out.println(line);
        }
}
}
