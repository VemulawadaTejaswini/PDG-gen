Line_4 $$ Metadata metadata = new Metadata() --> Line_5 $$ new HeifReader().extract(metadata, inputStream, new HeifBoxHandler(metadata)) [FD]
Line_2 $$ public static Metadata readMetadata(@NotNull InputStream inputStream) throws IOException --> Line_5 $$ new HeifReader().extract(metadata, inputStream, new HeifBoxHandler(metadata)) [FD]
Line_2 $$ public static Metadata readMetadata(@NotNull InputStream inputStream) throws IOException --> Line_10 $$ return null [CD]
