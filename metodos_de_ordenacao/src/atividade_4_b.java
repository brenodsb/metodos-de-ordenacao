public class atividade_4_b {

    public static void main(String[] args) {
        
        int[] vetor = {3, 4, 9, 2, 5, 8, 2, 1, 7, 4, 6, 2, 9, 8, 5, 1};

        quickSort(vetor, 0, vetor.length-1);

    }

    public static void partition(int E[], int left, int right, int[] fe_ir) {
        int fe, ir;
        int i, j;
        int aux;
        int[] pivot = {(left + right) / 2};
        int pivo = E[pivot[0]];
        i = left;
        j = right;
        
        do {
            while (E[i] < pivo) i++;
            while (pivo < E[j]) j--;
            if (i <= j) {
                aux = E[i];
                E[i] = E[j];
                E[j] = aux;
                i++;
                j--;
            }
        } while (i <= j);
        
        fe = j;
        ir = i;
        fe_ir[0] = fe;
        fe_ir[1] = ir;

        imprimirVetor(E);
    }

    public static void quickSort(int E[], int left, int right) {
        if (left < right) {
            int[] fe_ir = new int[2];
            partition(E, left, right, fe_ir);
            int fe = fe_ir[0];
            int ir = fe_ir[1];
            quickSort(E, left, fe);
            quickSort(E, ir, right);
        }
    }

    public static void imprimirVetor(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
