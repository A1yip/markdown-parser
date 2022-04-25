import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.*;
public class MarkdownParseTest {
    @Test 
    public void addition() {
        assertEquals(2, 1 + 1);
        }

    @Test
    public void getLinksTest() throws IOException {
        
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        MarkdownParse test = new MarkdownParse();
        assertEquals(List.of("https://something.com","some-thing.html"),test.getLinks(content));
    }
    /*
    @Test
    public void getLinksTest2() throws IOException {
        
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        MarkdownParse test = new MarkdownParse();
        assertEquals(List.of("https://something.com","some-thing.html"),test.getLinks(content));
    }
    */
    
    @Test
    public void getLinksTest3() throws IOException {
        
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        MarkdownParse test = new MarkdownParse();
        assertEquals(List.of("https://something.com","some-page.html"),test.getLinks(content));
    }
    @Test
    public void getLinksTest4() throws IOException {
        
        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        MarkdownParse test = new MarkdownParse();
        assertEquals(List.of(),test.getLinks(content));
    }
    @Test
    public void getLinksTest5() throws IOException {
        
        Path fileName = Path.of("test-file5.md");
        String content = Files.readString(fileName);
        MarkdownParse test = new MarkdownParse();
        assertEquals(List.of(),test.getLinks(content));
    }
    @Test
    public void getLinksTest6() throws IOException {
        
        Path fileName = Path.of("test-file6.md");
        String content = Files.readString(fileName);
        MarkdownParse test = new MarkdownParse();
        assertEquals(List.of(),test.getLinks(content));
    }
    
        
}
