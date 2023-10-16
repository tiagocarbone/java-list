package list;

import java.util.ArrayList;
import java.util.List;

class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public int calcularSoma() {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }


    public int encontrarMaiorNumero() {
        if (numeros.isEmpty()) {
            throw new IllegalStateException("A lista está vazia, não é possível encontrar o maior número.");
        }

        int maior = numeros.get(0);
        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }
        return maior;
    }


    public int encontrarMenorNumero() {
        if (numeros.isEmpty()) {
            throw new IllegalStateException("A lista está vazia, não é possível encontrar o menor número.");
        }

        int menor = numeros.get(0);
        for (int numero : numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }
        return menor;
    }

    public List<Integer> exibirNumeros() {
        return numeros;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        // Exemplo: Adicionar números à lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(15);




        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
        System.out.println(somaNumeros.exibirNumeros());
    }
}