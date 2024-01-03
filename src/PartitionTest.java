import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PartitionTest {

    @Test
    public void Between90To100() {
        Assertions.assertEquals('A', LetterGrade.letterGrade(94));
    }

    @Test
    public void Between80To89() {
        Assertions.assertEquals('B', LetterGrade.letterGrade(83));
    }

    @Test
    public void Between70To79() {
        Assertions.assertEquals('C',LetterGrade.letterGrade(75));
    }

    @Test
    public void Between60To69() {
        Assertions.assertEquals('D', LetterGrade.letterGrade(67));
    }

    @Test
    public void Between0To59() {
        Assertions.assertEquals('F', LetterGrade.letterGrade(36));
    }

    @Test
    public void GraterThan100() {
        Assertions.assertEquals('X', LetterGrade.letterGrade(115));
    }

    @Test
    public void LessThan0() {
        Assertions.assertEquals('X', LetterGrade.letterGrade(-54));
    }

}
