import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;

public class MustacheResolutionExample {
    public static void main(String[] args) throws IOException {
        HashMap<String, Object> scopes = new HashMap<>();
        Writer writer = new OutputStreamWriter(System.out);
        MustacheFactory mf = new DefaultMustacheFactory();
        Mustache mustache = mf.compile("templates/pages/home.mustache");
        mustache.execute(writer, scopes);
        writer.flush();
    }
}