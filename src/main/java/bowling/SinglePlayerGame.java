package bowling;


/**
 * Cette classe a pour but d'enregistrer le nombre de quilles abattues lors des
 * lancés successifs d'<b>un seul et même</b> joueur, et de calculer le score
 * final de ce joueur
 */
public class SinglePlayerGame {
       private static int QUILLES_DEP = 10;
       private int tours ;
       private int score;
       private int nbQuilles;
       private int nbLancer;
       private int bonus;


	/**
	 * Constructeur
	 */
	public SinglePlayerGame() {
            this.tours = 0;
            this.score = 0;
            this.nbQuilles = QUILLES_DEP;
            this.nbLancer = 0;
            this.bonus = 0;
            
                        
	}

	/**
	 * Cette méthode doit être appelée à chaque lancé de boule
	 *
	 * @param nombreDeQuillesAbattues le nombre de quilles abattues lors de
	 * ce lancé
	 */
	public void lancer(int nombreDeQuillesAbattues) {
            
            this.initQuilles();
                                                    
            this.score += nombreDeQuillesAbattues;
            if (this.bonus>0) {
                this.score += nombreDeQuillesAbattues;
                this.bonus--;
            }
            this.nbQuilles-= nombreDeQuillesAbattues;
                
            if (this.nbQuilles==0) {
                this.bonus++;
                if (nombreDeQuillesAbattues == QUILLES_DEP){
                    this.bonus++;
                }
            }
            this.nbLancer++;
        }

	/**
	 * Cette méthode donne le score du joueur
	 *
	 * @return Le score du joueur
	 */
	public int score() {
		return this.score ;
	}
        public void initQuilles(){
            if (this.nbLancer == 2 || this.nbQuilles == 0 ){
                this.nbQuilles = QUILLES_DEP;
                this.nbLancer = 0;
                this.tours++;
            }
                    
        }
}
