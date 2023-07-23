import java.util.HashSet;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveDuplicatesFromLinkedList {
    public static void main(String[] args) {
        // Example usage:
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next = new Node(5);

        System.out.println("Original Linked List:");
        printLinkedList(head);

        removeDuplicates(head);

        System.out.println("\nLinked List after removing duplicates:");
        printLinkedList(head);
    }

    public static void removeDuplicates(Node head) {
        if (head == null) {
            return;
        }

        HashSet<Integer> seenElements = new HashSet<>();
        Node current = head;
        Node previous = null;

        while (current != null) {
            if (seenElements.contains(current.data)) {
                previous.next = current.next;
            } else {
                seenElements.add(current.data);
                previous = current;
            }
            current = current.next;
        }
    }

    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
