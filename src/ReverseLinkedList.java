//node
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

        //assign the current.next value to next, so that we cannot lose the control over the
        //remaining list,
        // make the connection of current. next with previous, which is initially 0
        //then previous becomes current, and current becomes next, and it continues
        next = current.next;
        current.next= previous;
        previous = current;
        current = next;

        //return previous as list will be starting from the end now
    }return previous;

}


    public static void main(String[] args) {

    }
}
