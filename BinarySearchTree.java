
package binarysearchtree;

public class BinarySearchTree {
    
    class Node 
    {
        int data;
        Node leftChild;
        Node rightChild;
        
        Node (int d)
        {
            this.data = d;
            leftChild = null;
            rightChild = null;
        }
    }
     Node root = null;

    
   public void addLeaf(int data)    //called public function
   {
       addLeaf(root,data);
   }
   
   private void addLeaf(Node current, int d)   //private function called from public
   {   
       if(root == null)
       {
           root = new Node(d);
       }
       
       else if (d < current.data)
       {
           if (current.leftChild != null)
           {     
               addLeaf(current.leftChild,d);
           }
           else 
           {
               current.leftChild = new Node(d);
           }
       }
       else if (d > current.data)
       {
           if(current.rightChild != null)
           {
              addLeaf(current.rightChild,d);
           }
           else
               current.rightChild = new Node(d);
       }
   }
   
   public void inOrderTraversal()
   {
       inOrderTraversal(root);
   }
   
   private void inOrderTraversal(Node current)
   {     
       if(root == null)
           System.out.println("Empty tree");
       
       else if(current.leftChild != null)
       {
           inOrderTraversal(current.leftChild);
       }
     
         System.out.print(current.data + " ");
 
       if(current.rightChild != null)
       {
           inOrderTraversal(current.rightChild);
       }
   }

    
   public void preOrderTraversal()
   {
       System.out.println();
       preOrderTraversal(root);
   }
   private void preOrderTraversal(Node current)
   {
       if(current != null)
       {
           System.out.print(current.data + " ");
           preOrderTraversal(current.leftChild);
           preOrderTraversal(current.rightChild);
       }
   }
   
   public void postOrderTraversal()
   {
       System.out.println();
       postOrderTraversal(root);
   }
   private void postOrderTraversal(Node current)
   {
       if(current != null)
       {
           postOrderTraversal(current.leftChild);
           postOrderTraversal(current.rightChild);
           System.out.print(current.data + " ");
       }
   }
           
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.addLeaf(20);
        bst.addLeaf(10);
        bst.addLeaf(6);
        bst.addLeaf(12);
        bst.addLeaf(25);
        bst.addLeaf(24);
        bst.addLeaf(30);
        
        bst.inOrderTraversal();
        bst.preOrderTraversal();
        bst.postOrderTraversal();
        
        
    }
    
}
