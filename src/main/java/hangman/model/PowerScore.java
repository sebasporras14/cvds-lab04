package hangman.model;
import com.google.inject.Singleton;
public class PowerScore implements GameScore{
     /** 
    Calcula el puntaje del powerBonus
    @pre correctcount > 0 and incorrectcount > 0
    @pos powerScore >= 0  
    @param cantidad de intentos correctos(correctCount), cantidada de intentos incorrectos(incorrectCount), 
    @throws SCORE_INVALID(cuando el puntaje sea negativo o mayor a 500)
    */
    @Override
    public int calculateScore(int correctCount, int incorrectCount){
        int score = 0 - (incorrectCount * 8);
        for(int i = 0; i <= correctCount; i++){
            score += Math.pow(5,i);
        }
        if(score < 0){
            score = 0;
        }
        else if(score > 500){
            score = 500;
        }
        return score;

    }

}