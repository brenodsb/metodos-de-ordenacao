class Item {
    int key;

    public Item(int key) {
        this.key = key;
    }
}

public class atividade_1 {
    public static void main(String[] args) {
        Item[] array = new Item[]{new Item(5), new Item(2), new Item(9), new Item(1), new Item(5)};

        System.out.println("Array antes da ordenação:");
        for (Item item : array) {
            System.out.print(item.key + " ");
        }

        bubbleSort(array, array.length);

        System.out.println("\nArray após a ordenação:");
        for (Item item : array) {
            System.out.print(item.key + " ");
        }
    }

    static void bubbleSort(Item[] E, int n) {
        Item aux;
        boolean trocou = true;

        for (int i = 0; i < n - 1 && trocou; i++) {
            trocou = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (E[j].key > E[j + 1].key) {
                    trocou = true;
                    aux = E[j];
                    E[j] = E[j + 1];
                    E[j + 1] = aux;
                }
            }
        }
    }
}
