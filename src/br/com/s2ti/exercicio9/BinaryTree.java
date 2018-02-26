package br.com.s2ti.exercicio9;

/**
 *
 * @author Guilherme Alves Silveira
 */
public class BinaryTree {

    int valor;
    BinaryTree left;
    BinaryTree right;
    
    BinaryTree() {}
    
    BinaryTree(int valor) {
        this.valor = valor;
    }
    
    private int tamanho(BinaryTree node) {
        if (null == node) {
            return 0;
        } else if ((null == node.left) && (null == node.right)) {
            return 1;
        }
        
        return 1 + tamanho(node.left) + tamanho(node.right);
    }
    
    int tamanho() {
        return tamanho(this);
    }
}
