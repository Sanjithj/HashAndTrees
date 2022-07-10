package com.bridgelabz;

public class Hash<K> {
	class Hashtable<K, V> {
	    Node head;
	    Node tail;

	    public void ad(K key, V value) {
	        Node<K, V> myNode = (Node<K, V>) searchNode(key);
	        if(myNode == null) {
	            myNode = new Node<>(key , value);
	            this.append(myNode);
	        }
	        else {
	            myNode.setValue(value);
	        }
	    }
	    private Node<K, V> searchNode(K key) {
		return null;
		}
		private void append(Node<K, V> myNode) {
			
		}
	}

	private Object head;
	private Node tail;
	 //Append in linked list
    public void append(Node myNode) {
        if(this.head == null)
            this.head = myNode;
        if(this.tail == null)
            this.tail = myNode;
        else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }

    public Object getHead() {
		return head;
	}

	public void setHead(Object head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	//Searching word in linked list
    public Node<K, V> searchNode(K data) {
        Node currentNode = (Node) head;
        int position = 0;
        while (currentNode != null) {
            position++;
            if (currentNode.getKey().equals(data)) {
                return currentNode;
            }
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    @Override
    public String toString() {
    return "LinkedListNodes{" + head + "}";
    }

    public void printNodes() {
    System.out.println("Nodes: " + head);
    }
}