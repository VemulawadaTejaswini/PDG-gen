public class dummy {

private DocumentFile<MemoryType> copy(DocumentFile<MemoryType> df)
			throws IOException {
		String s = IOUtils.toString(df.getStream(), df.getEncoding());
		df.getStream().close();
		df.setStream(IOUtils.toInputStream(s, df.getEncoding()));
		return new DocumentFile<MemoryType>(df.getDocumentId(),
				df.getFileName(), IOUtils.toInputStream(s, df.getEncoding()),
				df.getSavedByStage(), df.getUploadDate());
	}

}