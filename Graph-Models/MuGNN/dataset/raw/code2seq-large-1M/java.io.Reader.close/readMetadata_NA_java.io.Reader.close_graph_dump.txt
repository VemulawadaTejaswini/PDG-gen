Line_4 $$ final KXml2SAXParser parser = new KXml2SAXParser(reader) --> Line_6 $$ parser.parseXML(handler) [FD]
Line_5 $$ XmlHandler handler = new XmlHandler(new MockBundle(), logger, false, false) --> Line_6 $$ parser.parseXML(handler) [FD]
Line_5 $$ XmlHandler handler = new XmlHandler(new MockBundle(), logger, false, false) --> Line_7 $$ return handler.getComponentMetadataList() [FD]
Line_2 $$ private List readMetadata(final Reader reader) throws IOException, ComponentException, XmlPullParserException, Exception --> Line_10 $$ reader.close() [FD]
