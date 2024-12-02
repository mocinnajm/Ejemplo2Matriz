public class ejemplo2 {
    public static void main(String[] args) {
        // Crear una matriz de ejemplo (4x4)
        int[][] matrix = new int[3][5]; 

        // Rellenar la matriz con valores
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    matrix[i][j] = 1; 
                } else if (i % 2 == 0 && j % 2 != 0) {
                    matrix[i][j] = 2; 
                } else if (i % 2 != 0 && j % 2 == 0) {
                    matrix[i][j] = 3; 
                } else {
                    matrix[i][j] = 4; 
                }
            }
        }

        
        for (int[] fila : matrix) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
