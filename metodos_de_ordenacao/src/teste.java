public class teste {
    public static void main(String[] args) {
        int numero = 42;
        modificarNumero(numero);
        System.out.println("O número é: " + numero); // A saída será "O número é: 42"
    }

    public static void modificarNumero(int valor) {
        valor = 100; // Modificando a cópia do valor, não afeta a variável original
    }
}
