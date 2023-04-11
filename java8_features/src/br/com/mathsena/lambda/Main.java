package br.com.mathsena.lambda;

interface Taxi{
    void reservar(String origem, String destino); // único metódo abstrato (Exigência do lambda)
}

public class Main {
    public static void main(String[] args) {
        // Essa é uma forma de implementação de uma interface
        /* Taxi taxi = new TaxiImpl();
        taxi.reservar(); */

        // Segunda forma de implementar uma interface é com uma classe anônima
       /* Taxi taxi = new Taxi(){
            @Override
            public void reservar(){
                System.out.println("Taxi reservado, porém, um Uber poderia ser melhor");
            }
        };
        taxi.reservar();

        */

        // Terceira forma: Lambda -> Criada em tempo de execução de forma dinâmica
        Taxi taxi = (origem, destino)-> {
            System.out.println("Taxi reservado com lambda. Origem: " + origem + " destino: " + destino);
        };
        taxi.reservar("São Paulo", "Rio de Janeiro");

    }
}
