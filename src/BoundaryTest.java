import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BoundaryTest {

    @Test
    public void Boundary0Test() {
        Assertions.assertEquals('X', LetterGrade.letterGrade(-1));
        Assertions.assertEquals('F', LetterGrade.letterGrade(0));
        Assertions.assertEquals('F', LetterGrade.letterGrade(1));
    }

    @Test
    public void Boundary60Test() {
        Assertions.assertEquals('F', LetterGrade.letterGrade(59));
        Assertions.assertEquals('D', LetterGrade.letterGrade(60));
        Assertions.assertEquals('D', LetterGrade.letterGrade(61));
    }

    @Test
    public void Boundary70Test() {
        Assertions.assertEquals('D', LetterGrade.letterGrade(69));
        Assertions.assertEquals('C', LetterGrade.letterGrade(70));
        Assertions.assertEquals('C', LetterGrade.letterGrade(71));
    }

    @Test
    public void Boundary80Test() {
        Assertions.assertEquals('C', LetterGrade.letterGrade(79));
        Assertions.assertEquals('B', LetterGrade.letterGrade(80));
        Assertions.assertEquals('B', LetterGrade.letterGrade(81));
    }

    @Test
    public void Boundary90Test() {
        Assertions.assertEquals('B', LetterGrade.letterGrade(89));
        Assertions.assertEquals('A', LetterGrade.letterGrade(90));
        Assertions.assertEquals('A', LetterGrade.letterGrade(91));
    }

    @Test
    public void Boundary100Test() {
        Assertions.assertEquals('A', LetterGrade.letterGrade(99));
        Assertions.assertEquals('A', LetterGrade.letterGrade(100));
        Assertions.assertEquals('X', LetterGrade.letterGrade(101));
    }

}
