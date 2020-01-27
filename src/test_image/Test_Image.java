/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_image;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class Test_Image {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner (System.in);
       double MM=0;
       int  i,j;
       final int NL=5;
       final int NC=6;
       int [][] Matrice;
       Matrice= new int [][]{
           {25,28,100,100,100,100},
           {44,45,50,100,100,100},
           {65,65,50,20,100,100,},
           {90,62,100,5,0,0},
           {60,87,100,0,100,100,}
    };
       for (i=0; i<NL; i++){
           System.out.println();
           for (j=0; j<NC; j++){
               System.out.println( Matrice [i][j]  + "\t" );
           }
          
       }
       
       System.out.println("\nNouvelle Matrice :");
         int [][] NvllM = Image_Saturation(Matrice);
       for (i=0; i<NL; i++){
           System.out.println();
           for (j=0; j<NC; j++){
                System.out.print(NvllM [i][j] + "\t");
           }
       }
       double MOY = Moyenne(MM);
       System.out.println("\n La Moyenne Vaut : ");
       for (i=0; i<NL; i++){
           for(j=0; j<NC; j++){
               System.out.println(MOY);
           }
       }
       

      
   
            
        
    }
    
    public static int [][] Image_Saturation( int [] [] Martice){
        int i,j;
       final int NL=5;
       final int NC=6;
       int [] []Matrice;
       Matrice = new int [][]{
           {25,28,100,100,100,100},
           {44,45,50,100,100,100},
           {65,65,50,20,100,100,},
           {90,62,100,5,0,0},
           {60,87,100,0,100,100,}
    };
       
       for (i=0; i<NL;i++){
           for (j=0; j<NC; j++){
               Matrice [i][j] = 100 - Matrice [i][j]; 
               
               int resultat = Matrice [i][j];
               
               if (Matrice [i][j]> 50 && Matrice [i][j]<=75){
                   Matrice [i][j]= 75;
                }
             
               else if (Matrice [i][j]>75)
                   Matrice [i][j]= 100;
               
               else Matrice [i][j] = (Matrice [i][j])/2 ; 
                   
 
                   
                   
               
               
           }
                   
                   }
       
       return Matrice  ;
    }
    
    public static double Moyenne( double  MM){
        
     int i,j,somme;
     double moyenne;
       final int NL=5;
       final int NC=6;
       int [] []Matrice;
       Matrice = new int [][]{
           {25,28,100,100,100,100},
           {44,45,50,100,100,100},
           {65,65,50,20,100,100,},
           {90,62,100,5,0,0},
           {60,87,100,0,100,100,}
    };
     somme = 0;
          for (i=0; i<NL; i++){
              for (j=0; j<NC; j++){
                  somme = somme + Matrice[i][j];   
              }
          }
          return (somme / 30);
    }
    
    
}
       
    
    

    


    
    

