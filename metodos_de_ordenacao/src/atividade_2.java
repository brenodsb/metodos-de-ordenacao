import java.util.Arrays;

public class atividade_2 {

    public static void main(String[] args) {
        
        int[] vetor = {1, 2, 3, 5, 4};
        int[] vetor_bolha = Arrays.copyOf(vetor, vetor.length);
        int[] vetor_selecao = Arrays.copyOf(vetor, vetor.length);
        int[] vetor_insercao = Arrays.copyOf(vetor, vetor.length);

        System.out.print("Vetor original: ");
        imprimirVetor(vetor);
        System.out.println("------------------------------");

        bolha(vetor_bolha, vetor_bolha.length);
        selecao(vetor_selecao, vetor_selecao.length);
        insercao(vetor_insercao, vetor_insercao.length);

    }

    public static void bolha(int[] E, int n) {
        int aux, comparacoes = 0, trocas = 0;
        boolean trocou = true;

        for (int i = 0; i < n - 1 && trocou == true; i++) {
            trocou = false;
            for (int j = 0; j < n - i - 1; j++) {
                comparacoes++;
                if (E[j] > E[j + 1]) {
                    trocas++;
                    trocou = true;
                    aux = E[j];
                    E[j] = E[j + 1];
                    E[j + 1] = aux;
                }
            }
        }

        System.out.println("BOLHA");
        System.out.print("Vetor: ");
        imprimirVetor(E);
        System.out.println("Trocas: " + trocas);
        System.out.println("Comparações: " + comparacoes);
        System.out.println("------------------------------");
    }

    public static void selecao(int E[], int n) {
        int aux, comparacoes = 0, trocas = 0;
        int pm;
        for (int i=0; i<n-1; i++) {
            comparacoes++;
            pm = i;
            for (int j=i+1; j<=n-1; j++){
                comparacoes++;
                if (E[j] < E[pm]){
                    pm = j;
                }
            }
            aux = E[i];
            E[i] = E[pm];
            E[pm] = aux;
            trocas++;
        }

        System.out.println("SELEÇÃO");
        System.out.print("Vetor: ");
        imprimirVetor(E);
        System.out.println("Trocas: " + trocas);
        System.out.println("Comparações: " + comparacoes);
        System.out.println("------------------------------");
    }

    public static void insercao(int E[], int n) {
        int comparacoes = 0, trocas = 0;
        int j;
        int x;
        for (int i=1; i < n; i++) {
            x = E[i];
            for (j=i-1; j >=0 && x < E[j]; j--){
                E[j+1] = E[j];
                trocas++;
                comparacoes++;
            }
            E[j+1]=x;
        }

        System.out.println("INSERÇÃO");
        System.out.print("Vetor: ");
        imprimirVetor(E);
        System.out.println("Trocas: " + trocas);
        System.out.println("Comparações: " + comparacoes);
        System.out.println("------------------------------");
    }

    public static void imprimirVetor(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
