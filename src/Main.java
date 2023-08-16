import List.Ordenacao.OrdenacaoNumeros;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);
        System.out.println(numeros);

        System.out.println(numeros.ordenarAscendente());
        System.out.println(numeros.ordenarDescendente());
        System.out.println(numeros);

    }
}