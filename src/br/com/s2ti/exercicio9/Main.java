package br.com.s2ti.exercicio9;

/**
 *
 * @author Guilherme Alves Silveira
 */
public class Main {
    
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(5);
        tree.left = new BinaryTree(4);
        tree.left.left = new BinaryTree(5);
        tree.left.right = new BinaryTree(5);
        tree.left.right.right = new BinaryTree(5);
        tree.left.right.right.right = new BinaryTree(5);
        
        tree.right = new BinaryTree(4);
        tree.right.left = new BinaryTree(5);
        tree.right.right = new BinaryTree(5);
        
        System.out.println("Tamanho: " + tree.tamanho());
        System.out.println("Tamanho: " + tree.right.tamanho());
        System.out.println("Tamanho: " + tree.left.left.tamanho());
    }
    
}
