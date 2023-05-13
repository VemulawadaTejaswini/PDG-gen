public class dummy {

public void write(final InputStream stream, final String ctype,
        final String etag) throws IOException {
        if (etag.isEmpty()) {
            throw new Attachment.BrokenContentException("etag can't be empty");
        }
        if (etag.length() > 2 * Tv.HUNDRED) {
            throw new Attachment.BrokenContentException("etag is too big");
        }
        if (ctype.isEmpty()) {
            throw new Attachment.BrokenContentException("ctype is empty");
        }
        if (ctype.length() > Tv.HUNDRED) {
            throw new Attachment.BrokenContentException("ctype is too long");
        }
        final byte[] data = IOUtils.toByteArray(stream);
        if (data.length == 0) {
            throw new Attachment.BrokenContentException(
                String.format(
                    "content of attachment '%s' can't be empty",
                    this.name()
                )
            );
        }
        if (data.length > Tv.TEN * Tv.MILLION) {
            throw new Attachment.TooBigException(
                "attachment is too big, 10Mb is the maximum size"
            );
        }
        if (!etag.equals(this.etag())) {
            final AttributeUpdates updates = this.save(data, ctype)
                .with(DyAttachments.ATTR_ETAG, etag);
            this.item.put(updates);
            this.updated();
        }
    }

}