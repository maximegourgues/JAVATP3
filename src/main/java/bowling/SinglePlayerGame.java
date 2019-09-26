package bowling;


/**
 * Cette classe a pour but d'enregistrer le nombre de quilles abattues lors des
 * lancés successifs d'<b>un seul et même</b> joueur, et de calculer le score
 * final de ce joueur
 */
public class SinglePlayerGame {
       private SingleBoardGame board;
       private int score;
       private int nbLancer;
       private int tours;
       


	/**
	 * Constructeur
	 */
	public SinglePlayerGame() {
            this.board = new SingleBoardGame();
            this.tours=0;
            
            this.score = 0;
            this.nbLancer = 0;
                    
                        
	}

	/**
	 * Cette méthode doit être appelée à chaque lancé de boule
	 *
	 * @param nombreDeQuillesAbattues le nombre de quilles abattues lors de
	 * ce lancé
	 */
	public void lancer(int nombreDeQuillesAbattues) {
            
            this.initBoard();
                                                    
            this.score += nombreDeQuillesAbattues;
            
            if (this.board.getBonus()>0 && this.tours < SingleBoardGame.DERNIER_TOUR){
                this.scoreBonus(nombreDeQuillesAbattues);
                
                if (this.board.getBonus() > 2 ){
                    this.scoreBonus(nombreDeQuillesAbattues);
                }
            }
            if (this.board.getBonus() > 2 && this.tours == SingleBoardGame.DERNIER_TOUR){
                this.scoreBonus(2*nombreDeQuillesAbattues);
            }
            
            /*if (this.board.getBonus()>0 && this.tours <= SingleBoardGame.DERNIER_TOUR) {
                if (this.board.getBonus() >=4){
                    this.scoreBonus(nombreDeQuillesAbattues);                                  
                } 
                this.scoreBonus(nombreDeQuillesAbattues);                             
                
            }*/
            this.board.decrementNbQuilles(nombreDeQuillesAbattues);
                
            if (this.board.getNbQuillesRest()==0) {
                if (nombreDeQuillesAbattues == SingleBoardGame.QUILLES_DEP){
                    this.board.strikeBonus();
                }
                else{
                    this.board.spareBonus();
                }
            }
            this.nbLancer++;
            System.out.println(this.score);
        }

	/**
	 * Cette méthode donne le score du joueur
	 *
	 * @return Le score du joueur
	 */
	public int score() {
		return this.score ;
	}
        public void initBoard(){
            if (this.nbLancer == 2 || this.board.getNbQuillesRest() == 0 ){
                this.board.initQuilles();
                this.nbLancer = 0;
                this.tours++;
            }
        
        }
        public void scoreBonus(int ptBonus){
            this.score+=ptBonus;
            this.board.useBonus();
                    
        }
}
