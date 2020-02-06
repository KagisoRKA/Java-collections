import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;

class CollectionsTest {

    @Test
    void printMax() {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(7);
        queue.add(5);
        queue.add(5);
        queue.add(7);
        assertEquals(2,Collections.printMax(3,queue));
    }
}