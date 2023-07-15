import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    public void testForSimlTaskMatches(){
        SimpleTask simpleTask = new SimpleTask(6, "Open the door");

        boolean expected = true;
        boolean actual = simpleTask.matches("Open");
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testForSimlTaskNotMatches(){
        SimpleTask simpleTask = new SimpleTask(6, "Open the door");

        boolean expected = false;
        boolean actual = simpleTask.matches("Windows");
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testForMittingMatchesTopic(){
        Meeting meeting = new Meeting(777, "Выкатка ", "Приложение НетоБанка", "В понедельник" );

        boolean expected = true;
        boolean actual = meeting.matches("Выкатка");
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testForMittingNotMatchesTopic(){
        Meeting meeting = new Meeting(777, "Выкатка ", "Приложение НетоБанка", "В понедельник" );

        boolean expected = false;
        boolean actual = meeting.matches("Открытие");
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testForMittingMatchesProject(){
        Meeting meeting = new Meeting(777, "Выкатка ", "Приложение НетоБанка", "В понедельник" );

        boolean expected = true;
        boolean actual = meeting.matches("Приложение");
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testForMittingNotMatchesProject(){
        Meeting meeting = new Meeting(777, "Выкатка ", "Приложение НетоБанка", "В понедельник" );

        boolean expected = false;
        boolean actual = meeting.matches("приложение");
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testForMittingMatchesEpic(){
        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
        Epic epic = new Epic(55, subtasks);

        boolean expected = true;
        boolean actual = epic.matches("Молоко");
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testForMittingNotMatchesEpic(){
        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
        Epic epic = new Epic(55, subtasks);

        boolean expected = false;
        boolean actual = epic.matches("Мороженное");
        Assertions.assertEquals(expected, actual);
    }


}