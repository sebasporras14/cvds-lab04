package hangman.model;
import com.google.inject.Singleton;

public class BonusScore implements GameScore{
    /** 
    Calcula el puntaje del bonus
    *@pre correctcount > 0 and incorrectcount > 0
    *@pos bonusCore >= 0  
    *@param cantidad de intentos correctos(correctCount), cantidada de intentos incorrectos(incorrectCount), 
    *@throws SCORE_INVALID(cuando el puntaje sea negativo)
    */
    @Override
    public int calculateScore(int correctCount, int incorrectCount){
        int score = 0 + (correctCount * 10) - (incorrectCount * 5);
        if (score < 0){
            score = 0;
        }
        return score;
    }

}