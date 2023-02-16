package hangman.model;
import org.junit.Test;
import org.junit.Assert; 

public class GameScoreTest{

    OriginalScore originalScore = new OriginalScore();
    BonusScore bonusScore = new BonusScore();
    PowerScore powerScore = new PowerScore();

    /** Validate original score when it is supposed to be possitive
     */

    @Test
    public void ValidateOriginalScorePositive(){
        int correctCount = 4;
        int incorrectCount = 3;
        int score = originalScore.calculateScore(correctCount, incorrectCount);
        Assert.assertEquals(score, 70);
    }

    /** Validate original score when it is supposed to be negative
     */

    @Test
    public void ValidateOriginalScoreNegative(){
        int correctCount = 4;
        int incorrectCount = 11;
        int score = originalScore.calculateScore(correctCount, incorrectCount);
        Assert.assertEquals(score, 0);
    }

    /** Validate Bonus score when it is supposed to be possitive
     */

    @Test
    public void ValidateBonusScorePositive(){
        int correctCount = 4;
        int incorrectCount = 3;
        int score = bonusScore.calculateScore(correctCount, incorrectCount);
        Assert.assertEquals(score, 25);
    }

    /** Validate Bonus score when it is supposed to be negative
     */

    @Test
    public void ValidateBonusScoreNegative(){
        int correctCount = 2;
        int incorrectCount = 5;
        int score = bonusScore.calculateScore(correctCount, incorrectCount);
        Assert.assertEquals(score, 0);
    }

    /** Validate Power Bonus score when it is supposed to be possitive
     */

    @Test
    public void ValidatePowerBonusScorePositive(){
        int correctCount = 4;
        int incorrectCount = 2;
        int score = powerScore.calculateScore(correctCount, incorrectCount);
        Assert.assertEquals(score, 500);
    }

}