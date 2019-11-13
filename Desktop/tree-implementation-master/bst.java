import java.util.*;

class BinarySearchTree
{
    class Node
    {
        Node left,right;
        int item;
        Node(int k)
        {
            item=k;
            left=right=null;
        }

    }
    Node root;
    BinarySearchTree()
    {
        root=null;
    }
    void insert(int k)
    {
        root = insertrec (root,k);
    }
    Node insertrec(Node root,int k)
    {
        if(root==null)
        {
            root=new Node(k);
            return root;
        }
        else if(k < root.k)
        {
            root.left=insertrec(root.left,k);
        }
        else if(k>root.k)
        {
            root.right=insertrec(root.right,k);
        }
    }
    void inorder()  { 
        inorderRec(root); 
     } 
   
      
     void inorderRec(Node root) { 
         if (root != null) { 
             inorderRec(root.left); 
             System.out.println(root.k); 
             inorderRec(root.right); 
         } 
     }
    public static void main(String args[])
    {
        BinarySearchTree tree=new BinarySearchTree();
        tree.insert(43);
        tree.insert(42);
        tree.insert(44);
        tree.insert(41);
        tree.insert(53);
        tree.insert(63);
        tree.insert(13);
        tree.insert(453);
        tree.insert(49);    
        tree.inorder(); 

    }
}