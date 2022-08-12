 class Node{
    int data;
Node next;
Node(int data, Node next){
    this.data = data;
    this.next = null;
}
}


public class ReverseLinkedList {

static Node reverseLinkedList(Node root){

    if(root == null || root.next== null){
        return root;
    }
    Node current = root;
    Node next = null;
    Node previous = null;

    while(current != null){

        next = current.next;
        current.next= previous;
        previous = current;
        current = next;
    }

}


    public static void main(String[] args) {

    }
}
