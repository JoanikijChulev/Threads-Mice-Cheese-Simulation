package org.example;

public class MiceCheese  {
	
    private Box[][] g = new Box[8][8];

    public void populate(int randomNumber) {

        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g.length; j++) {
                if (i == randomNumber && j == randomNumber) {
                    g[i][j] = new Box("[" + i + "][" + j + "]", "cheese");

                } else {
                    g[i][j] = new Box("[" + i + "][" + j + "]", "empty");
                }
            }
        }
    }

    
    public void printMatrix() {

        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g.length; j++) {
                System.out.print(g[i][j].cell + " " + g[i][j].value + ",");
            }
            System.out.println();
        }
    }


    Box[][] getV() {
        return g;
    }

}
