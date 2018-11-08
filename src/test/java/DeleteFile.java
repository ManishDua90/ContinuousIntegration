import org.junit.Test;

import java.io.File;

public class DeleteFile {
    @Test
    public void delete()
    {
        File f = new File("ABC.txt");
        f.delete();
    }

}
