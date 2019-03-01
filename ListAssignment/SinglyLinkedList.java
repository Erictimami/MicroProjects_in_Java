public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList(){
        //your code here
        this.head = null;
    }

    //SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        } else{
            Node runner = head; //setup the runner at the beginning position (head)
            while(runner.next != null){
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    public void remove(int val){
        Node runner = head;
        while(runner.next != null ^ runner.next.value == val){ // using ^ means using XOR logic (exclusive OR)
            runner=runner.next;
        }
        if(head.value == val && head.next ==null){
            head = null;
        }else if(head.value == val && head.next != null){
            head = head.next;
        }else if(runner.next==null){
            System.out.println("the Node of value "+val+" doesn't exist in the List");
        }else{
            runner.next=runner.next.next;
            System.out.println("the Node of value "+val+" has been found and removed from the List");
        }
    }
    public void printValues(){
        Node runner = head;
        int index = 0;
        while(runner != null){
            System.out.println("Node "+index+": "+runner.value);
            index++;
            runner=runner.next;
        }
    }
    public boolean detectNegs(){
      if(head == null){
          return false;
      } else{
          Node runner = head; //setup the runner at the beginning position (head)
          while(runner.next != null){
            if(runner.value < 0){
              return true;
            }
              runner = runner.next;
          }
          if(runner.value < 0){
            return true;
          } else{
            return false;
          }
        }
    }

}