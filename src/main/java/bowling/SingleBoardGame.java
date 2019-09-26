/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowling;

/**
 *
 * @author Gourgues
 */

public class SingleBoardGame {
    public static final int QUILLES_DEP = 10;
    public static final int DERNIER_TOUR = 10;
    
    private int nbQuilles;
    private int compteDouble;
    private int nbTours;
    private int bonus;

   
    public SingleBoardGame(){
        this.nbQuilles = this.QUILLES_DEP;
        this.compteDouble = 0;
        this.nbTours = 0;
        this.bonus = 0;
                
    }

    public int getNbQuillesRest(){
        return this.nbQuilles;
    }
    public void decrementNbQuilles(int n){
        this.nbQuilles = this.getNbQuillesRest()- n ;
    }
    public void initQuilles(){
        this.nbTours++;
        this.nbQuilles = this.QUILLES_DEP;
    }
    public void strikeBonus(){
        this.bonus+=2;
    }
    public void spareBonus(){
        this.bonus+=1;
    }
    public int getBonus(){
        return this.bonus;
    }
    public void useBonus(){
        this.bonus--;
    }
    
    
    
    
}
