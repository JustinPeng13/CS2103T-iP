package duke.task;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TodoTest {
    @Test
    public void toString_undone(){
        Todo td = new Todo("description");
        td.markAsUndone();
        assertEquals("[T][ ] description", td.toString());
    }

    @Test
    public void toString_done(){
        Todo td = new Todo("description");
        td.markAsDone();
        assertEquals("[T][X] description", td.toString());
    }
}