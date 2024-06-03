import java.util.LinkedList;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

class LinkList {
    private Node first;
    private Node current;
    private Node last;
    Automotive A;
    DecimalFormat df = new DecimalFormat("0.00");
    //default constructor
    public LinkList() {
        first = null;
        current = null;
        last = null;
    }
    //is empty
    public boolean isEmpty() {
        return (first == null);
    }
    //insert at front
    public void insertAtFront (Object insertItem) {
        Node newNode = new Node(insertItem);
        
        if(isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
    }
    //insert at back
    public void insertAtBack(Object insertItem) {
        Node newNode = new Node(insertItem);
    
        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }
    //remove from front
    public Object removeFromFront() {
        Object removeItem = null;
        if (isEmpty()) {
            return removeItem;
        }
        removeItem = first.data;
        if(first == last) {
            first = null;
            last = null;
        }
        else
            first = first.next;
        return removeItem;
    }
    //remove from back
    public Object removeFromBack() {
        Object removeItem = null;
        if (isEmpty()) {
            return removeItem;
        }
        removeItem = last.data;
        if(first == last) {
            first = null;
            last = null;
        } else {
            current = first;
            while (current.next != null)
            current = current.next;
            last = current;
            last.next = null;
        }
        return removeItem;
    }
    //delete vehicle at nth
    public void deleteVehicle(int code) {
        boolean found = false;
        Node current = first;
    
        if (((Automotive) first.data).getCode() == code) {
            first = first.next;
        }
        else while ((current.next != null) && (found == false)) {
            if(((Automotive)current.next.data).getCode()==code) {
                current.next = current.next.next;
                found = true;
            } else {
                current = current.next;
            }
        }
    }
    //getter
    public Object getFirst() {
        if(isEmpty())
            return null;
        else {
            current = first;
            return current.data;
        }
    }
    public Object getNext() {
        if (current == null) {
            current = first; // Initialize current to the first node if it's null
        }
        if (current != null && current.next != null) {
            current = current.next;
            return current.data;
        } else {
            return null;
        }
    }
    //count
    public int countNodes() {
        int count = 0;
        Node current = first;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    //traverse
    public void traverse() {
        Node current = first;

        while (current != null) {
            // Perform an action on the current node's data (in this case, print a report)
            Automotive A = (Automotive) current.data;
            A.printReport();

            // Move to the next node
            current = current.next;
        }
    }
    //sort vehicle by year ascending
    public void sortList() {
        // Node current will point to head
        Node current = first, index = null;
        Object temp;
        
        if (first == null) {
            return;
        } else {
            while (current != null) {
                // Node index will point to node next to
                // current
                index = current.next;

                while (index != null) {
                    // If current node's data is greater
                    // than index's node data, swap the data
                    // between them based on the yearLaunched
                    if (((Automotive) current.data).getYearLaunched() > ((Automotive) index.data).getYearLaunched()) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }

                    index = index.next;
                }
                current = current.next;
            }
        }
    }
    //sort vehicle by code ascending
    public void sortCode() {
        Node current = first, index = null;
        Object temp;
    
        if (first == null) {
            return;
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    // If current node's vehicle code is greater than
                    // index's node vehicle code, swap the data
                    if (((Automotive) current.data).getCode() > ((Automotive) index.data).getCode()) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
    //search vehicle by code
    public Automotive findVehicleByCode(int code) {
        Node current = first;
        while (current != null) {
            Automotive vehicle = (Automotive) current.data;
            if (vehicle.getCode() == code) {
                return vehicle; // Found the vehicle with the specified code
            }
            current = current.next;
        }
        return null; // Vehicle not found
    }
    //update vehicle condition
    public void updateVehicleCondition(int vehicleCode, char newCondition) {
        Node current = first;
        while (current != null) {
            if (((Automotive) current.data).getCode() == vehicleCode) {
                ((Automotive) current.data).setCondition(newCondition);
                return; // exit loop if vehicle is found and updated
            }
            current = current.next;
        }
        // Vehicle not found in the list
        System.out.println("Vehicle with code " + vehicleCode + " not found.");
    }
}

