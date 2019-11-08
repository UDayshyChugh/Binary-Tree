class BinaryTreeA { 
  
   
    class Node { 
        int data; 
        Node left, right; 
  
        public Node(int a) { 
            data = a; 
            left = right = null; 
        } 
    } 
  
   
    Node root = null; 
 
   
    void insert(int a) { 
       root = insertN(root, a); 
    } 
      
   
    Node insertN(Node root, int a) { 
  
        if (root == null) { 
            root = new Node(a); 
            return root; 
        } 
 
        if (a < root.data) 
		{
			if(root.left!=null)
			{
				insertN(root.left,a);
			}
			else
			{
			   root.left= new Node(a);	
			}
		}
        else if (a > root.data) 
            if(root.right!=null)
			{
				insertN(root.right,a);
			}
			else
			{
			   root.right= new Node(a);	
			}         
  
        return root; 
    } 
  
   
    void inorder()  { 
       inorderT(root); 
    } 
  
   
    void inorderT(Node root) { 
        if (root != null) { 
            inorderT(root.left); 
			 System.out.println(root.data);
            inorderT(root.right); 
		
			
        } 
    } 
	
	 void Postorder()  { 
       PostorderT(root); 
    } 
  
   
    void PostorderT(Node root) { 
        if (root != null) { 
            PostorderT(root.left); 
            PostorderT(root.right); 
			 System.out.println(root.data);
        } 
    } 
	 void Preorder()  { 
       PreorderT(root); 
    } 
  
   
    void PreorderT(Node root) { 
        if (root != null) { 
		   System.out.println(root.data);
            PreorderT(root.left); 
            PreorderT(root.right); 
			 
        } 
    } 
  
   
    public static void main(String[] args) { 
        BinaryTreeA leave = new BinaryTreeA(); 
  
        leave.insert(50); 
        leave.insert(30); 
        leave.insert(70); 
        leave.insert(20); 
        leave.insert(40); 
        leave.insert(60); 
        leave.insert(80); 
  
     System.out.println("IN");
        leave.inorder();
	  System.out.println("Post");	
		leave.Postorder();
	  System.out.println("Pre");	
		leave.Preorder();
    } 
} 