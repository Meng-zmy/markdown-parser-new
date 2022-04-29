import static org.junit.Assert.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import java.beans.Transient;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 4 + 1);
    }

    @Test
    public void getLinksTest(){
        Path fileName = Path.of("./test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> result = MarkdownParse.getLinks(content);
        assertEquals( "https://something.com",  result.get(0));

    }
    @Test
    public void getLinksTest1(){
        Path fileName = Path.of("./test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> result = MarkdownParse.getLinks(content);
        assertEquals( "https://something.com",  result.get(0));
        assertEquals("some-thing.html", result.get(1));
    }
    @Test
    public void getLinksTest2(){
        Path fileName = Path.of("./test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> result = MarkdownParse.getLinks(content);
        assertEquals( "https://something.com",  result.get(0));
        assertEquals("some-thing.html", result.get(1));
    }
    @Test
    public void getLinksTest3(){
        Path fileName = Path.of("./test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> result = MarkdownParse.getLinks(content);
        assertEquals( "https://something.com",  result.get(0));
        assertEquals("some-thing.html", result.get(1));
    }
    @Test
    public void getLinksTest4(){
        Path fileName = Path.of("./test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> result = MarkdownParse.getLinks(content);
        assertEquals( "https://something.com",  result.get(0));
        assertEquals("some-thing.html", result.get(1));
    }
    @Test
    public void getLinksTest5(){
        Path fileName = Path.of("./test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> result = MarkdownParse.getLinks(content);
        assertEquals( "https://something.com",  result.get(0));
        assertEquals("some-thing.html", result.get(1));
    }
    @Test
    public void getLinksTest6(){
        Path fileName = Path.of("./test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> result = MarkdownParse.getLinks(content);
        assertEquals( "https://something.com",  result.get(0));
        assertEquals("some-thing.html", result.get(1));
    }
    @Test
    public void getLinksTest7(){
        Path fileName = Path.of("./test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> result = MarkdownParse.getLinks(content);
        assertEquals( "https://something.com",  result.get(0));
        assertEquals("some-thing.html", result.get(1));
    }
    @Test
    public void getLinksTest8(){
        Path fileName = Path.of("./test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> result = MarkdownParse.getLinks(content);
        assertEquals( "https://something.com",  result.get(0));
        assertEquals("some-thing.html", result.get(1));
    }
}


