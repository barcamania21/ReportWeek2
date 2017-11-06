package BinarySearchTree;

public class BinarySearchTree {
    public static Node root;
    public BinarySearchTree(){
        this.root=null;
    }


    public void insert(int id){
       Node newNode=new Node(id);
       if(root==null){
           root=newNode;
           return;
       }
       Node current=root;
       Node parent=null;
       while(true){
           parent=current;
           if(current.key>id){
               current=current.left;
               if(current==null){
                   parent.left=newNode;
                   return;
               }
           }
           else {
               current=current.right;
               if(current==null){
                   parent.right=newNode;
                   return;
               }
           }

       }
    }

    public void display(Node root){
        if(root!=null){
            display(root.left);
            System.out.print(" "+root.key);
            display(root.right);
        }
    }

    public Node LCA(Node root, Node n1, Node n2){
        if(root.key>Math.max(n1.key,n2.key)){
            return LCA(root.left, n1, n2);
        }
        else if(root.key<Math.min(n1.key,n2.key)){
            return LCA(root.right,n1,n2);
        }
        else {
            return root;
        }
    }
}

