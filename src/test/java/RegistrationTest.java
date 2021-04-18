import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class RegistrationTest {

    @Test
    void ShouldFindIfUsernameIsUnique() throws FileNotFoundException {
        boolean test = Registration.usernameIsUnique("test");

        Assert.assertEquals(false, test);
    }

    /*@Test
    void ShouldFindIfUsernameIsUnique2() throws FileNotFoundException {
        boolean test = Registration.usernameIsUnique("test");

        Assert.assertEquals(true, test);
    }*/

    @Test
    void ShouldFindIfUsernameIsUnique3() throws FileNotFoundException {
        boolean test = Registration.usernameIsUnique("test2");

        Assert.assertEquals(false, test);
    }
}
