import org.junit.Test;
import org.junit.runners.Parameterized;

import java.io.File;
import java.io.IOException;

public class AddTwoNumbersTest {

    @Test
    public void addTest() throws IOException {
        File f = new File("ABC.txt");
        f.createNewFile();
        System.out.print("..........Added......" );

    }

    @Test
    public void pollingTest() throws IOException {
        System.out.print(".........Polling Test......" );

    }
}
