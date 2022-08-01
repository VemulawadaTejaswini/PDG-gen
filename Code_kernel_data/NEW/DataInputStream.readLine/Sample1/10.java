//9
public class func{
	public void decode(){
        String rawCommitter = n.substring("committer ".length());
        n = br.readLine();
        if (n != null && n.startsWith(  "encoding"))
          encoding = Charset.forName(n.substring("encoding ".length()));
        else
          if (n == null || !n.equals("")) {
            throw new CorruptObjectException(commitId,
                "malformed header:"+n);
        }
        byte[] readBuf = new byte[br.available()]; // in-memory stream so this is all bytes left
        br.read(readBuf);
        if (encoding != null) {
          // TODO: this isn't reliable so we need to guess the encoding from the actual content
          author = new PersonIdent(new String(rawAuthor.getBytes(),encoding.name()));
          committer = new PersonIdent(new String(rawCommitter.getBytes(),encoding.name()));
          message = new String(readBuf,msgstart, readBuf.length-msgstart, encoding.name());
        } else {
          // TODO: use config setting / platform / ascii / iso-latin
          author = new PersonIdent(new String(rawAuthor.getBytes()));
          committer = new PersonIdent(new String(rawCommitter.getBytes()));
          message = new String(readBuf, msgstart, readBuf.length-msgstart);
        }
}
}
