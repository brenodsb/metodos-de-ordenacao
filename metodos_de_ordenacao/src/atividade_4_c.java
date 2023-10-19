public class atividade_4_c {

    public static void main(String[] args) {
        
        int[] vetor = {3, 4, 9, 2, 5, 8, 2, 1, 7, 4, 6, 2, 9, 8, 5, 1};

        shellSort(vetor, vetor.length);

    }

    public static void shellSort(int E[], int n) {
        int i, j, h;
        int x;

        h = 1;
        while (h < n) {
            h = 3 * h + 1;
        }
        
        do {
            h = h / 3;
            
            for (i = h; i < n; i++) {
                x = E[i];
                for (j = i - h; j >= 0 && x < E[j]; j -= h) {
                    E[j + h] = E[j];
                    imprimirVetor(E);
                }
                E[j + h] = x;
            }
        } while (h >= 1);

        imprimirVetor(E);
    }

    public static void imprimirVetor(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
