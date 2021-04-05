import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class MainTest<testMain> {
    Main testMain=new Main();

    @Test
    public void testArrayNo4Exception(){
        Assertions.assertThrows(RuntimeException.class, ()->testMain.newArrayAfter4(new int[]{1, 2, 3, 5, 6}));
    }
    @Test
    public void testEmptyArrayException(){
        Assertions.assertThrows(RuntimeException.class, ()->testMain.newArrayAfter4(new int[]{}));
    }

    @Test
    public void testArray4() {
        Assertions.assertArrayEquals(new int[] {5, 6}, testMain.newArrayAfter4(new int[]{1,2,4,5,6}));
    }

    @Test
    public void testArray4InTheEnd() {
        Assertions.assertArrayEquals(new int[] {}, testMain.newArrayAfter4(new int[]{1,2,4,5,6,4}));
    }

    @Test
    public void testArrayLotOf4() {
        Assertions.assertArrayEquals(new int[] {2}, testMain.newArrayAfter4(new int[]{1,2,4,5,6,4,1,4,2}));
    }

    @Test
    public void testArrayNotOnly1And4() {
        Assertions.assertEquals(false, testMain.checkArray1And4(new int[]{1,2,4,5,6,4,1,4,2}));
    }

    @Test
    public void testArrayOnly1() {
        Assertions.assertEquals(false, testMain.checkArray1And4(new int[]{1,1,1,1,1,1}));
    }
    @Test
    public void testArrayOnly4() {
        Assertions.assertEquals(false, testMain.checkArray1And4(new int[]{4,4,4,4,4,4}));
    }

    @Test
    public void testArray1And4() {
        Assertions.assertEquals(true, testMain.checkArray1And4(new int[]{4,4,1,4,4,4}));
    }




}
