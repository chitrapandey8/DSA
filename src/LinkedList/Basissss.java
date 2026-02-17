package LinkedList;

  class Node{
      int data;
      Node next;

      Node(int data){
          this.data = data;
          this.next= next;
      }
  }




public class Basissss {
    static void main() {
     Node Newnnode = new Node(10);
     Node head = null;
//
//
//     //Insert at starting
//        Newnnode.next = head;
//        head = Newnnode;
//
//     // Insert at last
//        if(head == null){
//            head = Newnnode;
//            return;
//        }
//     Node curr = head; //jaha h head h waha curr hoga
//
//     while (curr.next == null){
//         curr = curr.next; //curr jispe khada h uska next curr msi daldo
//
//     }
//     curr.next =  Newnnode;

     //insert at any position
//        int pos = 5;
//        if(pos == 1){
//            //insert at position
//            return;
//        }
//
//        Node curr = head;
//
//        for(int i = 1; i<=pos-2 && curr!=null; i++){
//            curr = curr.next;
//        }
//
//        if(curr.next == null){
//            //
//        }
//
//        Newnnode.next = curr.next;
//        curr.next = Newnnode;

        //insert after value
//        Node curr = head;
//        while(curr!=null){
//            if(curr.data == key){
//                Node newnode =  new Node();
//                newnode.next = curr.next;
//                curr.next = new newnode;
//                return;
//            }
//            curr = curr.next;
//
//        }


    }
}
