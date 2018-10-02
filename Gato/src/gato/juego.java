/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gato;

/**
 *
 * @author juanf
 */
public class juego {
   int id=1;
   int idPadre=0;
   int prob;
   int minmax;//1 max//0 min
   char m [][]=new char[][]{{'-','-','-'}, {'-','-','-'}, {'-','-','-'}};;

    public juego( int minmax) {
        this.id = id;
        this.idPadre = idPadre;
        this.prob = prob;
        this.minmax = minmax;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(int idPadre) {
        this.idPadre = idPadre;
    }

    public int getProb() {
        return prob;
    }

    public void setProb(int prob) {
        this.prob = prob;
    }

    public int getMinmax() {
        return minmax;
    }

    public void setMinmax(int minmax) {
        this.minmax = minmax;
    }

    public char[][] getM() {
        return m;
    }

    public void setM(char[][] m) {
        this.m = m;
    }
    
    public char getMatriz(int a, int b){
        return this.m[a][b];
    }
    
    public void setMatriz(int a, int b, char valor){
        this.m[a][b]= valor;
    }
   }


