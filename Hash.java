package com.bridgelabz;

public class Hash {
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


}
