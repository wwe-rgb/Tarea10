package ico.fes.aragon.unam.mx.inicio;

import ico.fes.aragon.unam.mx.clases.nodoArbol;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        nodoArbol<String> raiz = new nodoArbol<>("10",new nodoArbol<>("5",new nodoArbol<>("1"),null),new nodoArbol<>("15",null,new nodoArbol<>("25")));
        System.out.println("Primer arbol:");
        System.out.println(raiz);
        System.out.println("Segundo arbol:");
        nodoArbol<String> raiz2 = new nodoArbol<>("Diego",new nodoArbol<>("Pedro",new nodoArbol<>("Susan"),new nodoArbol<>("Diana")),new nodoArbol<>("Mario"));
        System.out.println(raiz2);


        }
    }
