package excercise07Dec;

import excercise06.AddShelf;
import excercise06.AddTop;
import excercise06.Step;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TvTableBuilerTest {

    @Test
    void build() {

        List<String>parts =Arrays.asList("legs","top","shelf");
         TvTable tvTable = new TvTable();
         assertEquals(tvTable,parts);
    }
}