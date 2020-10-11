import static org.junit.Assert.*;

public class GradeBookTest {

    private GradeBook book1;
    private GradeBook book2;

    @org.junit.Before
    public void setUp() throws Exception {

        book1 = new GradeBook(5);
        book2 = new GradeBook(5);

        book1.addScore(60);
        book1.addScore(95);
        book1.addScore(87);
        book1.addScore(33);

        book2.addScore(99);
        book2.addScore(86);
        book2.addScore(75);
        book2.addScore(69);

    }

    @org.junit.After
    public void tearDown() throws Exception {

        book1 = null;
        book2 = null;

    }

    @org.junit.Test
    public void addScore() {

        assertEquals("60.0 95.0 87.0 33.0", book1.toString());
        assertEquals("99.0 86.0 75.0 69.0", book2.toString());

    }

    @org.junit.Test
    public void sum() {

        assertEquals(275, book1.sum(), 0.001);
        assertEquals(329, book2.sum(), 0.001);

    }

    @org.junit.Test
    public void minimum() {

        assertEquals(33, book1.minimum(), 0.0001);
        assertEquals(69, book2.minimum(), 0.0001);


    }

    @org.junit.Test
    public void finalScore() {

        assertEquals(242, book1.finalScore(), 0.0001);
        assertEquals(260, book2.finalScore(), 0.0001);

    }

}