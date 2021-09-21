/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p_a_u
 */
public class Matriz {
    private int ren,col,M[ ][ ];
    public Matriz() {M=new int[ren][col] ; }
    public Matriz(int r,int c) { ren=r;col=c;M=new int[ren][col] ; }
    public Matriz(int t) { ren=t;col=t;M=new int[ren][col] ; }
   
    
    public void identidad(){   //ren=n           n=3
        //           1    (n+1)    n             O(n) lineal      t(n)=3n +2 
        for (int i = 0; i < ren; i++)
            M[i][i]=1;  //1n 
        
    }//1
    
    
    public void identidad2(){//ren=col=n       n=3
        //           1    (n+1)      n        O(n2) cuadratica      t(n)=4n2+4n +2 
        for (int i = 0; i < ren; i++)
            
            
             //           1    (n+1)      n        (4n+2)n
            for (int k = 0; k < col; k++)
                if(i==k)     //1
                    M[i][k]=1;   //1             2n
                else             
                    M[i][k]=0;   //1           
    }//2

    public int getRen() {
        return ren;
    }

    public void setRen(int ren) {
        this.ren = ren;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int[][] getM() {
        return M;
    }

    public void setM(int[][] M) {
        this.M = M;
    }
    
}
