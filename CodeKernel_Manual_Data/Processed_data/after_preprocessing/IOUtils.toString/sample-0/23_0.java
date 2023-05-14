public class dummy {
private JaxbBundle bundle(final Bout bout,
        final Attachment attachment) throws IOException {
        JaxbBundle bundle = new JaxbBundle("attachment")
            .add("name", attachment.name())
            .up()
            .add("ctype", attachment.ctype()).up()
            .add("etag", attachment.etag()).up()
            .add("unseen", Boolean.toString(attachment.unseen())).up()
            .link(
                new Link(
                    "delete",
                    this.uriInfo().getBaseUriBuilder().clone()
                        .path(BoutRs.class)
                        .path(BoutRs.class, "delete")
                        .queryParam("name", "{a4}")
                        .build(bout.number(), attachment.name())
                )
            )
            .link(
                new Link(
                    "download",
                    this.uriInfo().getBaseUriBuilder().clone()
                        .path(BoutRs.class)
                        .path(BoutRs.class, "download")
                        .queryParam("name", "{a2}")
                        .build(bout.number(), attachment.name())
                )
            );
        if (attachment.ctype().equals(Attachment.MARKDOWN)) {
            bundle = bundle.link(
                new Link(
                    "open",
                    this.uriInfo().getBaseUriBuilder().clone()
                        .path(BoutRs.class)
                        .queryParam("open", "{a1}")
                        .build(bout.number(), attachment.name())
                )
            );
        }
        if (attachment.name().equals(this.open)
            && attachment.ctype().equals(Attachment.MARKDOWN)) {
            bundle = bundle.add(
                "html",
                new Markdown(
                    IOUtils.toString(attachment.read(), CharEncoding.UTF_8)
                ).html()
            ).up();
        }
        return bundle;
    }
}