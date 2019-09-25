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
   
    
   
    public SingleBoardGame(){
        this.nbQuilles = this.QUILLES_DEP;
        this.compteDouble = 0;
        
        
        
    }

    public int getNbQuillesRest(){
        return this.nbQuilles;
    }
    public void setNbQuillesRest(int n){
        this.nbQuilles = n ;
    }
    public void initQuilles(){
        this.setNbQuillesRest(this.QUILLES_DEP);
    }
}
