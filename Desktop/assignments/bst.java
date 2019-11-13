package assignmentupgrad;

 

class bst 
{
	class Node 
	{ 
		int data; 
		Node left, right; 
		public Node(int item) 
		{ 
			data = item; 
			left = right = null; 
		} 
	}
	Node root; 

	public bst() 
	{ 
		root = null; 
	} 
	void printLevelOrder() 
	{ 
		int h = height(root); 
		int i; 
		for (i=1; i<=h; i++) 
			printGivenLevel(root, i); 
	} 
	int height(Node root) 
	{ 
		if (root == null) 
		return 0; 
		else
		{ 
			int lh = height(root.left); 
			int rh = height(root.right); 
			
			if (lh > rh) 
			{
				return(lh+1); 
			}
			
			  else
			  {
				return(rh+1); 
			  }
			}
		} 
	 

	void printGivenLevel (Node root ,int level) 
	{ 
		if (root == null) 
			return; 
		if (level == 1) 
			System.out.print(root.data + " "); 
                           else if(level%2==0&&level>1)
                          { 
                                        printGivenLevel(root.right, level-1); 
			printGivenLevel(root.left, level-1); 
                           }

		else if (level%2==1&&level > 1) 
		{ 
			printGivenLevel(root.left, level-1); 
			printGivenLevel(root.right, level-1); 
		} 
	} 
	
	public static void main(String args[]) 
	{ 
	bst t = new bst(); 
	t.root= new Node(1); 
	t.root.left= new Node(2); 
	t.root.right= new Node(3); 
	t.root.left.left= new Node(4); 
	t.root.left.right= new Node(5); 
	t.root.right.left=new Node(6);
	t.root.right.right=new Node(7);
	t.root.left.left.left= new Node(8); 
	t.root.left.right.right= new Node(9);
		
	System.out.println("Level order traversal of binary tree is "); 
	t.printLevelOrder(); 
	} 
} 