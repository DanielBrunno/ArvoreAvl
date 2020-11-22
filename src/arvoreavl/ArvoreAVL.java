package arvoreavl;

/**
 *
 * 
 * @author Daniel Brunno
 * https://gitlab.com/danielbrunno1/estruturadedados
 */
public class ArvoreAVL extends AVLTree {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here     
       System.out.print("\n Arvore AVL: ");
        AVLTree arvore = new AVLTree();
        arvore.insertNo(3);
        arvore.insertNo(2);
        arvore.insertNo(1);
        arvore.insertNo(4);
        arvore.insertNo(5);
        arvore.print();
        
    }
}