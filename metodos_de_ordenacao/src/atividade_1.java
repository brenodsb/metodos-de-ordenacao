public class atividade_1 {

    public static void main(String[] args) {
        
        int[] vetor = {4, 3, 1, 2, 5};

        System.out.print("Vetor original: ");
        imprimirVetor(vetor);
        System.out.println("------------------------------");

        bolha(vetor, vetor.length);

    }

    public static void bolha(int[] E, int n) {
        int aux, comparacoes = 0, trocas = 0;
        boolean trocou = true;
        int ultimaTrocaPosicao = n - 1; // ultima troca ocorre no final do vetor

        for (int i = 0; i < n - 1 && trocou == true; i++) {
            trocou = false;
            int novaUltimaTrocaPosicao = 0; // nova posição da última troca
            for (int j = 0; j < ultimaTrocaPosicao; j++) {
                comparacoes++;
                if (E[j] > E[j + 1]) {
                    trocas++;
                    trocou = true;
                    aux = E[j];
                    E[j] = E[j + 1];
                    E[j + 1] = aux;
                    novaUltimaTrocaPosicao = j; // atualiza a posição da última troca
                }
            }
            ultimaTrocaPosicao = novaUltimaTrocaPosicao; // atualiza a posição da última troca
        }

        System.out.println("BOLHA");
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
