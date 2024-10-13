package ico.fes.aragon.unam.mx.clases;

import java.util.Objects;

    public class nodoArbol<T> {
        private T dato;
        private nodoArbol<T> hijoIzquierdo;
        private nodoArbol<T> hijoDerecho;
        public nodoArbol() {

        }
        public nodoArbol(T dato) {
            this.dato = dato;
        }

        public nodoArbol(T dato, nodoArbol<T> hijoIzquierdo, nodoArbol<T> hijoDerecho) {
            this.dato = dato;
            this.hijoIzquierdo = hijoIzquierdo;
            this.hijoDerecho = hijoDerecho;
        }

        public T getDato() {
            return dato;
        }

        public void setDato(T dato) {
            this.dato = dato;
        }

        public nodoArbol<T> getHijoIzquierdo() {
            return hijoIzquierdo;
        }

        public void setHijoIzquierdo(nodoArbol<T> hijoIzquierdo) {
            this.hijoIzquierdo = hijoIzquierdo;
        }

        public nodoArbol<T> getHijoDerecho() {
            return hijoDerecho;
        }

        public void setHijoDerecho(nodoArbol<T> hijoDerecho) {
            this.hijoDerecho = hijoDerecho;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
       nodoArbol<?> nodoArbol = (nodoArbol<?>) o;
            return Objects.equals(dato, nodoArbol.dato);
        }

        @Override
        public int hashCode() {
            return Objects.hash(dato);
        }

        @Override
        public String toString() {
            return "nodoArbol{" +
                    "dato=" + dato +
                    ", hijoIzquierdo=" + hijoIzquierdo +
                    ", hijoDerecho=" + hijoDerecho +
                    '}';
        }
    }

