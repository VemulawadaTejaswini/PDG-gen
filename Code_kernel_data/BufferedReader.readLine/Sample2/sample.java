//0
public class func{
	public void getSideEffect(final String file){
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = br.readLine();
        while (line != null) {
            lines.add(line);
            line = br.readLine();
        }
        br.close();
}
}
//1
public class func{
	public void test_readLine_all_line_endings(){
        BufferedReader r = new BufferedReader(new StringReader("1\r2\n3\r\n4"));
        assertEquals("1", r.readLine());
        assertEquals("2", r.readLine());
        assertEquals("3", r.readLine());
        assertEquals("4", r.readLine());
        assertNull(r.readLine());
}
}
//2
public class func{
	public void testCreateWithLineEnding(){
    BufferedReader reader = factory.create(new ByteArrayResource("a||b".getBytes()), "UTF-8");
    assertEquals("a", reader.readLine());
    assertEquals("b", reader.readLine());
    assertEquals(null, reader.readLine());
}
}
//3
public class func{
	public void main(String args[]){
        InputStreamReader converter = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(converter);
        List<String> s1 = Arrays.asList( in.readLine().trim().split("\\s+") );
        List<String> s2 = Arrays.asList( in.readLine().trim().split("\\s+") );
        int big1 = Integer.parseInt(in.readLine().trim());
        int big2 = Integer.parseInt(in.readLine().trim());
        System.out.println(jaccard(s1,s2));
        System.out.println(sampleCorrectedJaccard(s1,s2, big1,big2));
}
}
//4
public class func{
	public void test_readLine_interaction_with_mark_and_reset(){
        BufferedReader r = new BufferedReader(new StringReader("1\r\n2\n3"));
        assertEquals("1", r.readLine());
        r.mark(256);
        assertEquals('2', r.read()); // This read skips the '\n'.
        assertEquals("", r.readLine());
        r.reset(); // Now we're back half-way through the "\r\n".
        assertEquals("2", r.readLine());
        assertEquals("3", r.readLine());
        assertNull(r.readLine());
}
}
//5
public class func{
	public void readFile(String filename){
    BufferedReader in = new BufferedReader(new FileReader(filename));
    String line = in.readLine();
    while (line != null) {
      result.add(line);
      line = in.readLine();
    }
    in.close();
}
}
//6
public class func{
	public void loadSiteList(){
    BufferedReader in = new BufferedReader(new FileReader(inPath + "top500.list"));
      String line = in.readLine();
      while (line != null) {
          urls.add(line);
          line = in.readLine();
      }
      in.close();
}
}
//7
public class func{
	public void readLogMessagesFromFile(String fileName){
        File logFile = new File(fileName);
        BufferedReader r = new BufferedReader(new FileReader(logFile));  
        String logMessage = r.readLine();
        while(logMessage != null){
            this.addLog(logMessage);
            logMessage = r.readLine();
        }
        r.close();
}
}
//8
public class func{
	public void getData(HttpServletRequest req){
    String line = reader.readLine();
    while (line != null) {
      sb.append(line + "\n");
      line = reader.readLine();
    }
    reader.close();
}
}
//9
public class func{
	public void readFile(){
        BufferedReader br = new BufferedReader(new FileReader("src/test/resources/script1"));
        String line = br.readLine();
        while (line != null) {
            if (line.trim().length() > 0 && !line.trim().startsWith("#"))
                lines.add(line);
            line = br.readLine();
        }
}
}
//10
public class func{
	public void testBeautify(){
        String res = DefaultRSAPubKey.beautify(longStr);
        BufferedReader sbuf = new BufferedReader(new StringReader(res));
        while ((line = sbuf.readLine()) != null) {
            if (line.length() != 60) {
                assertTrue("only the last line can be less than 60 chars", sbuf.readLine() == null);
            }
        }
}
}
//11
public class func{
	public void ChineseTrie(String path){
        FileInputStream f = new FileInputStream(path);
        BufferedReader dr=new BufferedReader(new InputStreamReader(f, "UTF-8"));
        String line = dr.readLine();
        while(line != null) {
            addAWord(line.trim());
            line = dr.readLine();
        }
}
}
//12
public class func{
	public void readNextLine(BufferedReader reader){
        String line = reader.readLine();
        while (line != null && (line.isEmpty() || line.trim().startsWith("//"))) {
            line = reader.readLine();
        }
}
}
//13
public class func{
	public void readwoBS(BufferedReader reader){
  if( (line = reader.readLine())!=null){
      while( line.endsWith("\\") &&
       ((line2 = reader.readLine()) != null) ){
    line = line.substring(0,line.length()-1);
    line += line2;
      }
  }
}
}
//14
public class func{
	public void loadTextFile(final String location,final List<String> list){
    final BufferedReader reader = new BufferedReader(getReader(location));
    String line = reader.readLine();
    while (line != null) {
      list.add(line);
      line = reader.readLine();
    }
}
}
//15
public class func{
	public void readLines(File f){
    BufferedReader bufferedReader = new BufferedReader(new FileReader(f));
    String line = bufferedReader.readLine();
    while (line != null) {
      fileLines.add(line);
      line = bufferedReader.readLine();
    }
}
}
//16
public class func{
	public void readFile(InputStream is){
    BufferedReader br = new BufferedReader(new InputStreamReader(is));
    String line = br.readLine();
    while (line != null) {
      result.append(line + "\n");
      line = br.readLine();
    }
}
}
//17
public class func{
	public void readFile(String path){
        BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(path)));
        String sCurrentLine = br.readLine();
        while (sCurrentLine != null) {
            sb.append(sCurrentLine);
            sCurrentLine = br.readLine();
        }
}
}
//18
public class func{
	public void capture(){
        BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));
        String s = rdr.readLine();
        while (s != null) {
            sw.write(s);
            s = rdr.readLine();
        }
}
}
//19
public class func{
	public void readJsonFile(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("src/test/resources/sample_bundle.json")));
        String curLine = reader.readLine();
        while (curLine != null) {
            sb = sb.append(curLine);
            curLine = reader.readLine();
        }
}
}
//20
public class func{
	public void toLines(final Reader resource){
        String line = br.readLine();
        while (line != null) {
            lines.add(line);
            line = br.readLine();
        }
}
}
//21
public class func{
	public void getJson(InputStream stream){
    BufferedReader reader = new BufferedReader( is );
    String read = reader.readLine();
    while( read != null ) {
      stringBuilder.append( read );
      read = reader.readLine();
    }
}
}
//22
public class func{
	public void readLines(Reader input){
    String line = reader.readLine();
    while (line != null) {
      list.add(line);
      line = reader.readLine();
    }
}
}
//23
public class func{
	public void ScrabbleDictionary(InputStream objDictionaryStream){
    BufferedReader bf=new BufferedReader(new InputStreamReader(objDictionaryStream));
    String sWord=bf.readLine();
    while (sWord!=null){
      storeWord(sWord);
      sWord=bf.readLine();
    }
}
}
//24
public class func{
	public void getConnectionContent(Object content){
        String line = buff.readLine();
        while (line != null) {
            text.append(line);
            line = buff.readLine();
        }
}
}
//25
public class func{
	public void read(BufferedReader in){
        String line = in.readLine();
        while(line != null){
            buffer.append(line + " ");
            line = in.readLine();
        }
}
}
//26
public class func{
	public void readLines(InputStream input){
        String line = reader.readLine();
        while(line != null){
            result.add(line);
            line = reader.readLine();
        }
}
}
//27
public class func{
	public void toLines(Reader input){
    String line = reader.readLine();
    while (line != null) {
      list.add(line);
      line = reader.readLine();
    }
}
}
//28
public class func{
	public void skipBlock(BufferedReader in){
    String buffer = in.readLine();
    while(buffer != null)
    {
      if(buffer.startsWith("$"))
        return;
      buffer = in.readLine();
    }
}
}
//29
public class func{
	public void getHtml(BufferedReader bufferedReader){
        line = bufferedReader.readLine();
        line = StringUtils.removeStart(line, "html:\t");
        htmlBuilder.append(line);
        while ((line = bufferedReader.readLine()) != null) {
            htmlBuilder.append(line);
        }
        return htmlBuilder.toString();
}
}
//30
public class func{
	public void parseCodeRangeMappingSection(BufferedReader bf){
    String line = bf.readLine();
    while (line != null) {
      if (line.contains("endcodespacerange")) {
        break;
      }
      parseCodeRangeLine(line);
      line = bf.readLine();
    }
}
}
//31
public class func{
	public void skipUntilBegin(BufferedReader reader){
         String line = reader.readLine();
         while (line != null && !line.startsWith(BEGIN)) {
            line = reader.readLine();
         }
         return Optional.fromNullable(line);
}
}
//32
public class func{
	public void read_attributes(Attributes attr,BufferedReader br){
    String s = br.readLine();
    while (s != null && (! s.equals("")))
      {
        readAttribute(attr, s, br);
        s = br.readLine();
      }
}
}
//33
public class func{
	public void getWordsFromFile(String filename,Set<String> resultSet,boolean lowercase){
    if(filename==null) {
      return ;
    }
    BufferedReader reader = IOUtils.readerFromString(filename);
    while(reader.ready()) {
      if(lowercase) resultSet.add(reader.readLine().toLowerCase());
      else resultSet.add(reader.readLine());
    }
    IOUtils.closeIgnoringExceptions(reader);
}
}
//34
public class func{
	public void readIndividualSections(Map entries,BufferedReader br){
    String s = br.readLine();
    while (s != null && (! s.equals("")))
      {
        Attributes attr = readSectionName(s, br, entries);
        read_attributes(attr, br);
        s = br.readLine();
      }
}
}
//35
public class func{
	public void lenArray(BufferedReader reader){
    Object arrayObject = gateway.getObject(reader.readLine());
    reader.readLine();
    int length = Array.getLength(arrayObject);
    ReturnObject returnObject = gateway.getReturnObject(length);
    return Protocol.getOutputCommand(returnObject);
}
}
//36
public class func{
	public void setArray(BufferedReader reader){
    Object arrayObject = gateway.getObject(reader.readLine());
    int index = (Integer) Protocol.getObject(reader.readLine(), gateway);
}
}
//37
public class func{
	public void getArray(BufferedReader reader){
    Object arrayObject = gateway.getObject(reader.readLine());
    int index = (Integer) Protocol.getObject(reader.readLine(), gateway);
}
}
//38
public class func{
	public void createJVMView(BufferedReader reader){
    String name = StringUtil.unescape(reader.readLine());
    reader.readLine();
    JVMView newView = new JVMView(name, null);
    ReturnObject rObject = gateway.getReturnObject(newView);
    newView.setId(rObject.getName());
    return Protocol.getOutputCommand(rObject);
}
}
//39
public class func{
	public void assertReaders(final BufferedReader expected,final BufferedReader actual){
            final String actualLine = actual.readLine();
            Assert.assertNotNull("Expected had more lines than the actual.", actualLine);
            Assert.assertEquals(expectedLine, actualLine);
        Assert.assertNull("Actual had more lines than the expected.", actual.readLine());
}
}
//40
public class func{
	public void testCreateWithLineEndingAtEnd(){
    BufferedReader reader = factory.create(new ByteArrayResource("a||".getBytes()), "UTF-8");
    assertEquals("a", reader.readLine());
    assertEquals(null, reader.readLine());
}
}
//41
public class func{
	public void setArray(BufferedReader reader){
    Object objectToSet = Protocol.getObject(reader.readLine(), gateway);
    reader.readLine();
    Array.set(arrayObject, index, objectToSet);
}
}
//42
public class func{
	public void getStringSet(BufferedReader fin){
    int i, size = Integer.parseInt(fin.readLine());
    for (i=0; i<size; i++)
      set.add(fin.readLine());
}
}
//43
public class func{
	public void writeTreeWithOneChild(){
        Tree<String> tree = new Tree<String>("root");
        tree.addChild("child");
        BufferedReader reader = read(tree);
        assertEquals("root"     , reader.readLine());
        assertEquals("+- child" , reader.readLine());
}
}
//44
public class func{
	public void parsePhysicalNames(BufferedReader in){
    int nb = Integer.parseInt(in.readLine());
    for(int i = 0; i < nb; i++)
      toReturn[i] = TOKENIZE.split(in.readLine())[2];
}
}
//45
public class func{
	public void assertLines(String in,String... lines){
                assertEquals(line, bufferedReader.readLine());
            assertNull(bufferedReader.readLine());
}
}
//46
public class func{
	public void getTotalTerms(Configuration conf,String totalTermsPath){
    BufferedReader reader = getBufferedReader(conf, totalTermsPath);
    long totalTerms = Long.parseLong(reader.readLine());
    reader.close();
}
}
//47
public class func{
	public void checkSource(int i,File parent,Source source){
            final String line = reader.readLine();
            assertEquals("hello" + i, line);
            reader.close();
}
}
//48
public class func{
	public void loadModel(BufferedReader reader){
    double globalAverage = Double.parseDouble(reader.readLine());
    double[] itemBiases = VectorExtensions.readVectorArray(reader);
    reader.close();
}
}
//49
public class func{
	public void readLine(final BufferedReader in){
        do line = in.readLine();
        while (line!=null && ((line=line.trim()).length()==0 || line.charAt(0)=='#'));
}
}
//50
public class func{
	public void nextLine(BufferedReader br){
    do 
      l = br.readLine().trim();
    while(l.length() == 0);
}
}
//51
public class func{
	public void slice_list(BufferedReader reader){
    List list1 = (List) gateway.getObject(reader.readLine());
}
}
//52
public class func{
	public void getArray(BufferedReader reader){
    reader.readLine();
    Object getObject = Array.get(arrayObject, index);
    ReturnObject returnObject = gateway.getReturnObject(getObject);
    return Protocol.getOutputCommand(returnObject);
}
}
//53
public class func{
	public void handleRequest(BufferedReader reader,PrintWriter writer){
    String line = reader.readLine();
    LOG.info("Received: " + line + " going to divide by it");
    Integer toDivide = Integer.valueOf(line);
    writer.println(Integer.toString(100 / toDivide));
}
}
//54
public class func{
	public void handleRequest(BufferedReader reader,PrintWriter writer){
      writer.println(reader.readLine());
}
}
//55
public class func{
	public void testCreate(){
    BufferedReader reader = factory.create(new ByteArrayResource("a\nb\nc".getBytes()), "UTF-8");
    assertEquals("a", reader.readLine());
}
}
//56
public class func{
	public void compareLines(String text,String[] lines){
      Assert.assertEquals(lines[i], reader.readLine());
}
}
//57
public class func{
	public void readLine(BufferedReader reader){
            return reader.readLine();
}
}
//58
public class func{
	public void readLine(BufferedReader reader){
            line = reader.readLine();
}
}
//59
public class func{
	public void FileIterator(BufferedReader br){
            nextLine = br.readLine();
}
}
//60
public class func{
	public void getReader_read_receiveStringFromStream(){
        BufferedReader reader = sut(stream, mockOutput()).getReader();
        String result = reader.readLine();
}
}
//61
public class func{
	public void readLine(BufferedReader reader){
      readLine = reader.readLine();
}
}
//62
public class func{
	public void getRecordId(BufferedReader reader){
                    getSegmentStore().getTracker(), reader.readLine());
}
}
//63
public class func{
	public void getLineFromReader(BufferedReader rdr){
            return rdr.readLine();
}
}
//64
public class func{
	public void getLine(BufferedReader reader){
            s = reader.readLine();
}
}
//65
public class func{
	public void readLine(BufferedReader reader){
      return reader.readLine();
}
}
//66
public class func{
	public void skipInput(){
            (new BufferedReader(new InputStreamReader(in))).readLine();
}
}
//67
public class func{
	public void handleContextHeader(BufferedReader document){
        return (readHeader) ? document.readLine().trim() : null;
}
}
//68
public class func{
	public void readLine(BufferedReader reader){
            return reader.readLine();
}
}
//69
public class func{
	public void loadSeries(S3Client client){
            reader.readLine();
}
}
//70
public class func{
	public void loadEpisodes(S3Client client){
            reader.readLine();
}
}
//71
public class func{
	public void getLine(ByteArrayOutputStream out){
        return bRd.readLine();
}
}
//72
public class func{
	public void testVisitBundle(){
    final BufferedReader reader = getResultReader();
    assertEquals(
        "bundle,org.jacoco.example,FooClass,10,15,1,2,0,3,1,2,0,1",
        reader.readLine());
}
}
//73
public class func{
	public void readString(final BufferedReader r){
      return r.readLine();
}
}
//74
public class func{
	public void testDispatch(){
        assertThat("!ForwardingServlet",br.readLine(),equalTo("Dispatched back to ForwardingServlet"));
}
}
//75
public class func{
	public void process(){
      line = reader.readLine();
      writeToKafka(line);
}
}
//76
public class func{
	public void loadBrands(S3Client client){
            reader.readLine();
}
}
//77
public class func{
	public void doIt(BufferedReader reader,String input){
      input = reader.readLine();
}
}
//78
public class func{
	public void deleteObject(BufferedReader reader){
    reader.readLine();
    gateway.deleteObject(objectId);
}
}
//79
public class func{
	public void testGetIndex(){
      BufferedReader remoteFile = synchronizer.getRemoteFile("index.org");
      String firstLine = remoteFile.readLine();
      assertEquals("#+READONLY", firstLine);
      fail("Couldn't get index.org");
}
}
//80
public class func{
	public void parseFile(File f,String sep,boolean skipFirstLine){
    if (skipFirstLine) br.readLine();
}
}
//81
public class func{
	public void getNextLine(BufferedReader br){
            line = br.readLine();
}
}
//82
public class func{
	public void readLine(final BufferedReader reader){
            return reader.readLine();
}
}
//83
public class func{
	public void readLine(BufferedReader reader,String fileName){
      return reader.readLine();
}
}
//84
public class func{
	public void loadProducts(S3Client client){
            reader.readLine();
}
}
//85
public class func{
	public void getReader_read_chokes_onStreamError(){
        BufferedReader reader = sut().getReader();
        reader.readLine();
}
}
//86
public class func{
	public void TestHeader(){
    BufferedReader reader = getResultReader();
    assertEquals(
        "GROUP,PACKAGE,CLASS,INSTRUCTION_MISSED,INSTRUCTION_COVERED,BRANCH_MISSED,BRANCH_COVERED,LINE_MISSED,LINE_COVERED,COMPLEXITY_MISSED,COMPLEXITY_COVERED,METHOD_MISSED,METHOD_COVERED",
        reader.readLine());
}
}
//87
public class func{
	public void run(){
            String command = in.readLine();
            runCommand(command, out);
}
}
//88
public class func{
	public void getLine(BufferedReader bReader){
            String line = bReader.readLine();
}
}
//89
public class func{
	public void serve(Socket s){
      PrintStream ps = GetPrintStream(s);
      BufferedReader br = GetBufferedReader(s);
      String token = br.readLine();
      ps.println(token);
}
}
//90
public class func{
	public void SWTSamplesShell(){
      line = in.readLine();
}
}
//91
public class func{
	public void loadLocations(S3Client client){
            reader.readLine();
}
}
//92
public class func{
	public void read(final BufferedReader r){
                return r.readLine();
}
}
//93
public class func{
	public void waitForPrompt(BufferedReader stdout,String prompt){
            String line = stdout.readLine();
}
}
//94
public class func{
	public void readAhead(BufferedReader br){
            return br.readLine();
}
}
//95
public class func{
	public void testSendMessage(){
    ss = new SocketService(portNumber, new HelloService());
    Socket s = new Socket("localhost", portNumber);
    BufferedReader br = GetBufferedReader(s);
    String answer = br.readLine();
}
}
//96
public class func{
	public void readUmask(){
    return lineRead.readLine();
}
}
//97
public class func{
	public void main(String[] args){
      System.out.printf("Hi, %s!%n", in.readLine());
}
}
//98
public class func{
	public void testFileWithSpaces(PrintWriter out,BufferedReader in){
        response = in.readLine();
}
}
//99
public class func{
	public void receive(final BufferedReader in){
        setResponse(in.readLine());
}
}
//100
public class func{
	public void assertResult(byte[] bytes,String... lines){
      assertEquals(error + " - line " + (++lineNum), line, reader.readLine());
}
}
//101
public class func{
	public void send(final BufferedReader in,final BufferedWriter out,final String s){
        final String r = in.readLine();
}
}
