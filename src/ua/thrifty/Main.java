package ua.thrifty;

public class Main {

    public static void main(String[] args) {
        int[][] multiTab = new int[10][10];
        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                multiTab[i][j] = (i+1)*(j+1);
                System.out.printf("%10d",multiTab[i][j]);
            }
            System.out.println();
        }
    }
}
