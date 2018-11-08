import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class AddTwoNumbers {
    @Parameters("a","b")
    @Test
    public void addTest(int aa, int bb) throws IOException
    {
        File f = new File("ABC.txt");
        f.createNewFile();
        System.out.print("..........Added......" + (aa+bb));

    }
}
