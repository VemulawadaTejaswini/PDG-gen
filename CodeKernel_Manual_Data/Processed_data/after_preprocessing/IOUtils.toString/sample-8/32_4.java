public class dummy {
public Phandom(@NotNull final InputStream stream) throws IOException {
        this(IOUtils.toString(stream, CharEncoding.UTF_8));
    }
}