package br.com.edmar;

public class App {
    public static void main(String[] args) {
    	Lista minhaGaragem = new Lista();

        minhaGaragem.adicionarCarro(new Honda("Civic"));
        minhaGaragem.adicionarCarro(new Bmw("X5"));
        minhaGaragem.adicionarCarro(new Mercedes("C300"));

        minhaGaragem.listarCarros();
    }
}
