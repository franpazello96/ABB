public class Main {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        arvore.adicionar(10);
        arvore.adicionar(5);
        arvore.adicionar(15);
        arvore.adicionar(25);
        arvore.adicionar(35);
        arvore.adicionar(45);
        arvore.adicionar(55);

        arvore.imprimir();
        System.out.println(arvore.buscar(5));  // retornar true
        System.out.println(arvore.buscar(100)); // retornar false
        arvore.remover(5); // remover o nó com valor 5
        arvore.imprimir(); // verifica se 5 foi removido
    }
}