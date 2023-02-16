package hangman.model;
import com.google.inject.Singleton;
public class OriginalScore implements GameScore{

     /** 
    Calcula el puntajeoriginal
    @pre correctcount > 0 and incorrectcount > 0
    @pos gameScore >= 0
    @param cantidad de intentos correctos(correctCount), cantidada de intentos incorrectos(incorrectCount), 
    @throws SCORE_INVALID(cuando el puntaje sea negativo)
    */
    @Override
    public int calculateScore(int correctCount, int incorrectCount){
        int score = 100 - (incorrectCount * 10);
        if (score < 0){
            score = 0;
        }
        return score;
        
    }

}