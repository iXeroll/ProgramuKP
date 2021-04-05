import org.junit.Assert;

import java.io.FileNotFoundException;
import org.junit.jupiter.api.Test;

class loginTest {

    @Test
    void testingIfUserExists() throws FileNotFoundException {

        boolean test = login.userExsists("aaa","sss");

        Assert.assertEquals(true,test);
    }

    @Test
    void testingIfUserIsWrong() throws FileNotFoundException {

        boolean test = login.userExsists("test","test");

        Assert.assertEquals(true,test);
    }

    @Test
    void testingIfUserDoesNotExists() throws FileNotFoundException {

        boolean test = login.userExsists("test","test");

        Assert.assertEquals(false,test);
    }
}