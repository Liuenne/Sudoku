/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author Elton
 */
public class Sudoku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] theGrid = {{9,5,7,6,1,3,2,8,4},
            {4,8,3,2,5,7,1,9,6},
            {6,1,2,8,4,9,5,3,7},
            {1,7,8,3,6,4,9,5,2},
            {5,2,4,9,7,1,3,6,8},
            {3,6,9,5,2,8,7,4,1},
            {8,4,5,7,9,2,6,1,3},
            {2,9,1,4,3,6,8,7,5},
            {7,3,6,1,8,5,4,2,9}};
        
        boolean[][]check ={{false,false,false,false,false,false,true,false,false},
            {false,true,false,false,false,true,false,true,false},
            {true,false,true,false,false,false,true,false,false},
            {false,true,false,false,true,false,false,false,false},
            {false,false,false,true,false,true,false,false,false},
            {false,false,false,false,true,false,false,true,false},
            {false,false,true,false,false,false,true,false,true},
            {false,true,false,true,false,false,false,true,false},
            {false,false,true,false,false,false,false,false,false},};
        
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++) {
                if (check[i][j] == true) {
                    System.out.print(theGrid[i][j]);
                }else{
                    System.out.println(".");
                }
            }
        }
    }
    
}
