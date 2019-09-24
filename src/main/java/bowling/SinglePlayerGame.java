package bowling;
import bowling.TypeLancer.java;

/**
 * Cette classe a pour but d'enregistrer le nombre de quilles abattues lors des
 * lancés successifs d'<b>un seul et même</b> joueur, et de calculer le score
 * final de ce joueur
 */
public class SinglePlayerGame {
       private TypeLancer typeLancer;
             
       private int tours ;
       private int score;
       private int nbQuilles;
       private boolean deuxiemeBoules;


	/**
	 * Constructeur
	 */
	public SinglePlayerGame() {
            this.tours = 10;
            this.score = 0;
            this.nbQuilles =10;
            this.typeLancer  = TypeLancer.MANY;
            this.deuxiemeBoules = false;
            
                        
	}

	/**
	 * Cette méthode doit être appelée à chaque lancé de boule
	 *
	 * @param nombreDeQuillesAbattues le nombre de quilles abattues lors de
	 * ce lancé
	 */
	public void lancer(int nombreDeQuillesAbattues) {
                                                    
            this.score = nombreDeQuillesAbattues;
            if (this.typeLancer==TypeLancer.STRIKE || this.typeLancer==TypeLancer.SPARE) {
                score+=nombreDeQuillesAbattues;               
            }    
            
            if (this.nbQuilles==nombreDeQuillesAbattues) {
                if (this.deuxiemeBoules==true)
                    this.typeLancer=TypeLancer.STRIKE;
                else
                    this.typeLancer=TypeLancer.SPARE;
                
                
            }
            else
                this.typeLancer=TypeLancer.MANY;
        }

	/**
	 * Cette méthode donne le score du joueur
	 *
	 * @return Le score du joueur
	 */
	public int score() {
		return this.score ;
	}
}
