package BinarySearchTree;

public class LCATestDrive {
    public static void main(String[] args){
        BinarySearchTree binarySearchTree=new BinarySearchTree();
        binarySearchTree.insert(10);
        binarySearchTree.insert(-10);
        binarySearchTree.insert(8);
        binarySearchTree.insert(6);
        binarySearchTree.insert(9);
        binarySearchTree.insert(30);
        binarySearchTree.insert(25);
        binarySearchTree.insert(60);
        binarySearchTree.insert(28);
        binarySearchTree.insert(78);

        binarySearchTree.display(binarySearchTree.root);
        System.out.println("\nLowest Common Ancestor: "+binarySearchTree.LCA(binarySearchTree.root, new Node(-10), new Node(78)));
        System.out.println("Lowest Common Ancestor: "+binarySearchTree.LCA(binarySearchTree.root, new Node(25), new Node(60)));
        System.out.println("Lowest Common Ancestor: "+binarySearchTree.LCA(binarySearchTree.root, new Node(8), new Node(30)));


    }

}
