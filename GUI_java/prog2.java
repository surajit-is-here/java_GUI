import java.util.Scanner;

public class prog2 {
    int size;
    Node top;

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void push(int data) {
        Node mynode = new Node(data);
        mynode.next = top;
        top = mynode;
        size++;
    }

    int pop() {
        if (isempty())
            System.out.println("Stack is empty");
        int result = top.data;
        top = top.next;
        size--;
        return result;
    }

    boolean isempty() {
        return size == 0;
    }

    void peek() {
        if (isempty())
            System.out.println("Stack is empty");
        else
            System.out.println(top.data);
    }

    void display() {
        Node current = top;
        if (isempty())
            System.out.println("Stack is empty");
        while (current != null) {
            System.out.print(current.data + "  ");
            current = current.next;
        }
        System.out.println();
    }
    void  go()
    {
        prog2 S=new prog2();
        Scanner sc =new Scanner(System.in);
        int v=0;
        while(v==0) {
            System.out.println("press 1 for push & 2 for pop & 3 for display & 4 for peek & 5 for stop");
            int de = sc.nextInt();
            if (de == 1) {
                System.out.println("Enter element");
                int num = sc.nextInt();
                S.push(num);
                v=0;
            }
            else if(de==2)
            {
                S.pop();
                v=0;
            }
            else if (de==3)
            {
                S.display();
                v=0;
            }
            else if(de==4)
            {
                S.peek();
                v=0;
            }
            else
               v++;
        }
    }
}
