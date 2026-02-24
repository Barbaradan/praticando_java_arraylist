import java.util.ArrayList;

public class Principal {
    public static void main(String[] args){
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Roni ", 29);
        Pessoa pessoa2 = new Pessoa("Babis ", 22);
        Pessoa pessoa3 = new Pessoa("Mel ", 12);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista de pessoas: " + listaDePessoas.size());
        System.out.println("Primeira pessoa: " + listaDePessoas.get(0)); //ele pega (get) a posição 0 que é a 1

        System.out.println("\nPodemos imprimir assim: " + listaDePessoas);
        System.out.println("\nOu assim: ");
        for (Pessoa pessoa : listaDePessoas){
            System.out.println(pessoa);
        }

    }
}
