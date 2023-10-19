import java.util.Scanner;

public class atividade_3 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
           
            int[] vetor = {5, 4, 3, 2, 1};

            System.out.print("O vetor original é: ");
            imprimirVetor(vetor);
            System.out.println("------------------------------");
            System.out.println("METODOS DE ORDENAÇÃO");
            System.out.println("1 - Metodo Bolha");
            System.out.println("2 - Metodo de Seleção");
            System.out.println("3 - Metodo de Inserção");
            System.out.print("Selecione a opção desejada: ");
            int opc = scanner.nextInt();
            System.out.println("------------------------------");

            switch(opc){
                case 1:
                    bolha(vetor, vetor.length);
                    break;
                case 2:
                    selecao(vetor, vetor.length);
                    break;
                case 3:
                    insercao(vetor, vetor.length);
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }
    }

    public static void bolha(int[] E, int n) {
        int aux, comparacoes = 0, trocas = 0;
        boolean trocou = true;

        System.out.println("BOLHA\n");
        System.out.print("Iteração "+comparacoes+": ");
        imprimirVetor(E);

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
                System.out.print("Iteração "+comparacoes+": ");
                imprimirVetor(E);
            }
        }

        System.out.println("\nTrocas: " + trocas);
        System.out.println("Comparações: " + comparacoes);
        System.out.println("------------------------------");
    }

    public static void selecao(int E[], int n) {
        int aux, comparacoes = 0, trocas = 0;
        int pm;

        System.out.println("SELEÇÃO\n");
        System.out.print("Iteração "+comparacoes+": ");
        imprimirVetor(E);

        for (int i=0; i<n-1; i++) { 
            pm = i;
            for (int j=i+1; j<=n-1; j++){
                comparacoes++;
                System.out.print("Iteração "+comparacoes+": ");
                imprimirVetor(E);
                if (E[j] < E[pm]){
                    pm = j;
                }
            }
            aux = E[i];
            E[i] = E[pm];
            E[pm] = aux;
            trocas++;
            comparacoes++;
            System.out.print("Iteração "+comparacoes+": ");
            imprimirVetor(E);
        }

        System.out.println("\nTrocas: " + trocas);
        System.out.println("Comparações: " + comparacoes);
        System.out.println("------------------------------");
    }

    public static void insercao(int E[], int n) {
        int comparacoes = 0, trocas = 0;
        int j;
        int x;

        System.out.println("INSERÇÃO\n");

        for (int i=1; i < n; i++) {
            x = E[i];
            
            for (j=i-1; j >=0 && x < E[j]; j--){
                System.out.print("Iteração "+comparacoes+": ");
                imprimirVetor(E);
                E[j+1] = E[j];
                trocas++;
                comparacoes++;
                
            }
            E[j+1]=x;
        }

        System.out.print("Iteração "+comparacoes+": ");
        imprimirVetor(E);

        System.out.println("\nTrocas: " + trocas);
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
