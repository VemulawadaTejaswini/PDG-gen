Line_2 $$ Screenshot readMetadata(Path metadataFilePath) throws CommandException --> Line_3 $$ logger.debug("Read metadata for image: [FD]
Line_2 $$ Screenshot readMetadata(Path metadataFilePath) throws CommandException --> Line_3 $$ logger.debug("Read metadata for image: [CD]
Line_2 $$ Screenshot readMetadata(Path metadataFilePath) throws CommandException --> Line_4 $$ ObjectMapper mapper = new ObjectMapper() [CD]
Line_2 $$ Screenshot readMetadata(Path metadataFilePath) throws CommandException --> Line_7 $$ File metadataFile = metadataFilePath.toFile() [FD]
Line_2 $$ Screenshot readMetadata(Path metadataFilePath) throws CommandException --> Line_8 $$ if (metadataFilePath.toFile().exists()) [FD]
Line_8 $$ if (metadataFilePath.toFile().exists()) --> Line_9 $$ screenshot = mapper.readValue(metadataFile, Screenshot.class) [CD]
Line_6 $$ Screenshot screenshot --> Line_9 $$ screenshot = mapper.readValue(metadataFile, Screenshot.class) [FD]
Line_4 $$ ObjectMapper mapper = new ObjectMapper() --> Line_9 $$ screenshot = mapper.readValue(metadataFile, Screenshot.class) [FD]
Line_7 $$ File metadataFile = metadataFilePath.toFile() --> Line_9 $$ screenshot = mapper.readValue(metadataFile, Screenshot.class) [FD]
Line_8 $$ if (metadataFilePath.toFile().exists()) --> Line_11 $$ consoleWriter.a("No metadata file for image: ").fg(Color.CYAN).a(metadataFilePath.toString()).println().reset() [CD]
Line_2 $$ Screenshot readMetadata(Path metadataFilePath) throws CommandException --> Line_11 $$ consoleWriter.a("No metadata file for image: ").fg(Color.CYAN).a(metadataFilePath.toString()).println().reset() [FD]
Line_8 $$ if (metadataFilePath.toFile().exists()) --> Line_12 $$ screenshot = new Screenshot() [CD]
Line_6 $$ Screenshot screenshot --> Line_12 $$ screenshot = new Screenshot() [FD]
Line_2 $$ Screenshot readMetadata(Path metadataFilePath) throws CommandException --> Line_16 $$ throw new CommandException("Can't parse: " + metadataFilePath.toString() + " for screenshot metadata", ioe) [FD]
