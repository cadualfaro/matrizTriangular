/*
Quebra-Cabeça 3: Dizer se uma matriz é triangular
 */
package quebracabeca3;
import java.util.Arrays;
import java.util.Random;
public class QuebraCabeca3 {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int matriz[][] = new int [4][4];
        
        for(int i=0;i<matriz.length;i++)
                for(int j=0;j<matriz[i].length;j++){
                    matriz [i][j] = rand.nextInt(2);
                }
        //Verificando os valores da matriz
        boolean inferior = true;
            for (int i=0; i<matriz.length && inferior==true; i++) {
                for (int j=i+1; j<matriz[i].length && inferior==true; j++) {
                    if (matriz[i][j] != 0)
                        inferior = false;
            }
            }
        //Verificando os valores da matriz
        boolean superior = true;
            for (int i=0; i<matriz.length && superior==true; i++) {
                for (int j=0; j<i && superior==true; j++) {
                    if (matriz[i][j] != 0)
                        superior = false;
            }
            }
            //Imprimindo a matriz
            for (int i=0; i<matriz.length; i++) {
                System.out.println(Arrays.toString(matriz[i]));
            }
            //Verificação final
                if (inferior == true){
                    System.out.printf("\nA matriz informada e uma matriz triangular inferior.\n");
            }
                else if (superior == true){
                    System.out.printf("\nA matriz informada e uma matriz triangular superior.\n");
            }
                else{
                    System.out.printf("\nA matriz informada nao e uma matriz triangular.\n");
            }
        }
    }
    

