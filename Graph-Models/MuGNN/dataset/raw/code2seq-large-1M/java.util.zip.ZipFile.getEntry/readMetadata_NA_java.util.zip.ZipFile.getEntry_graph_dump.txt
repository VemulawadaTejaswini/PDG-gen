Line_2 $$ private void readMetadata(final ZipFile zip) throws IOException, SAXException --> Line_3 $$ final ZipEntry entry = zip.getEntry("metadata.xml") [FD]
Line_2 $$ private void readMetadata(final ZipFile zip) throws IOException, SAXException --> Line_3 $$ final ZipEntry entry = zip.getEntry("metadata.xml") [CD]
Line_2 $$ private void readMetadata(final ZipFile zip) throws IOException, SAXException --> Line_4 $$ if (entry == null) [CD]
Line_2 $$ private void readMetadata(final ZipFile zip) throws IOException, SAXException --> Line_7 $$ final XMLReader xmlReader = XMLReaderFactory.createXMLReader() [CD]
Line_2 $$ private void readMetadata(final ZipFile zip) throws IOException, SAXException --> Line_8 $$ final InputSource inputSource = new InputSource(new BufferedInputStream(zip.getInputStream(entry))) [FD]
Line_2 $$ private void readMetadata(final ZipFile zip) throws IOException, SAXException --> Line_8 $$ final InputSource inputSource = new InputSource(new BufferedInputStream(zip.getInputStream(entry))) [CD]
Line_2 $$ private void readMetadata(final ZipFile zip) throws IOException, SAXException --> Line_9 $$ xmlReader.setContentHandler(new XMLHandler() [CD]
Line_7 $$ final XMLReader xmlReader = XMLReaderFactory.createXMLReader() --> Line_9 $$ xmlReader.setContentHandler(new XMLHandler() [FD]
Line_9 $$ xmlReader.setContentHandler(new XMLHandler() --> Line_14 $$ if (vocabulary.isMetadata(localName)) [FD]
Line_9 $$ xmlReader.setContentHandler(new XMLHandler() --> Line_14 $$ if (vocabulary.isMetadata(localName)) [CD]
Line_14 $$ if (vocabulary.isMetadata(localName)) --> Line_15 $$ if (vocabularyVersion == null) [CD]
Line_14 $$ if (vocabulary.isMetadata(localName)) --> Line_18 $$ WorkerLoad.this.vocabulary = Vocabulary.forVersion(vocabularyVersion) [CD]
Line_14 $$ if (vocabulary.isMetadata(localName)) --> Line_19 $$ WorkerLoad.this.vocabulary.checkVersion(version) [CD]
Line_14 $$ if (vocabulary.isMetadata(localName)) --> Line_20 $$ if (vocabulary.isVersion(localName)) [CD]
Line_9 $$ xmlReader.setContentHandler(new XMLHandler() --> Line_20 $$ if (vocabulary.isVersion(localName)) [FD]
Line_20 $$ if (vocabulary.isVersion(localName)) --> Line_22 $$ if (vocabulary.isVocabulary(localName)) [CD]
Line_9 $$ xmlReader.setContentHandler(new XMLHandler() --> Line_22 $$ if (vocabulary.isVocabulary(localName)) [FD]
Line_22 $$ if (vocabulary.isVocabulary(localName)) --> Line_25 $$ return false [CD]
Line_9 $$ xmlReader.setContentHandler(new XMLHandler() --> Line_27 $$ return true [CD]
Line_9 $$ xmlReader.setContentHandler(new XMLHandler() --> Line_30 $$ if (vocabulary.isMetadata(localName) || vocabulary.isVersion(localName) || vocabulary.isVocabulary(localName)) [FD]
Line_9 $$ xmlReader.setContentHandler(new XMLHandler() --> Line_30 $$ if (vocabulary.isMetadata(localName) || vocabulary.isVersion(localName) || vocabulary.isVocabulary(localName)) [CD]
Line_30 $$ if (vocabulary.isMetadata(localName) || vocabulary.isVersion(localName) || vocabulary.isVocabulary(localName)) --> Line_31 $$ return true [CD]
Line_30 $$ if (vocabulary.isMetadata(localName) || vocabulary.isVersion(localName) || vocabulary.isVocabulary(localName)) --> Line_33 $$ return false [CD]
Line_2 $$ private void readMetadata(final ZipFile zip) throws IOException, SAXException --> Line_37 $$ xmlReader.parse(inputSource) [CD]
Line_7 $$ final XMLReader xmlReader = XMLReaderFactory.createXMLReader() --> Line_37 $$ xmlReader.parse(inputSource) [FD]
Line_8 $$ final InputSource inputSource = new InputSource(new BufferedInputStream(zip.getInputStream(entry))) --> Line_37 $$ xmlReader.parse(inputSource) [FD]
