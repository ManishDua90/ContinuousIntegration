import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class AddTwoNumbers {
    @Test
    public void addTest() throws IOException
    {
        System.out.print("Added");
        File f = new File("ABC.txt");
        f.createNewFile();
    }
}
