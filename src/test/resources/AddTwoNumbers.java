import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class AddTwoNumbers {
    @Parameters("a","b")
    @Test
    public void addTest(int aa, int bb) throws IOException
    {
        System.out.print("..........Added......" + (aa+bb));
        File f = new File("ABC.txt");
        f.createNewFile();
    }
}
