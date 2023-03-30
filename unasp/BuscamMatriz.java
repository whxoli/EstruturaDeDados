package unasp;

import java.util.Arrays;

public class BuscaMatriz {
    public static int[] buscaMatriz(int[][] matriz, int valor) {
        int[] posicao = {-1, -1};
        if (matriz == null) {
            return posicao;
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == valor) {
                    posicao[0] = i;
                    posicao[1] = j;
                    return posicao;
                }
            }
        }
        return posicao;
    }
    
    public static void main(String[] args) {
        int[][] matriz = {{5, 7, 3}, {1, 0, 8}, {2, 2, 2}};
        int valor = 8;
        int[] posicao = buscaMatriz(matriz, valor);
        System.out.println("Matriz: ");
        for (int[] linha : matriz) {
            System.out.println(Arrays.toString(linha));
        }
        if (posicao[0] == -1 && posicao[1] == -1) {
            System.out.println("O valor " + valor + " não foi encontrado na matriz.");
        } else {
            System.out.println("O valor " + valor + " foi encontrado na posição (" + posicao[0] + ", " + posicao[1] + ").");
        }
    }
}
