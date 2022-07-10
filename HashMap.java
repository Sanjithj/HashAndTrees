package com.bridgelabz;

public class HashMap {
	
	    public static void main(String[] args) {

	        HashMap hash = new HashMap();

	        String message = " Paranoids are not to be paranoid because they are to be paranoid but \" +\r\n";

	        String[] messageArray = message.toLowerCase().split(" ");

	        for(String word: messageArray) {

	            Integer value =  hash.get(word);

	            if( value == null) {
	                value = 1;
	            }
	            else {
	            	 value = value + 1;
	                 hash.add(word , value);
	            	
	            } 
	            System.out.println(hash);
	            hash.remove("paranoid");
	            System.out.println(hash);
	    }
	    }
		private void add(String word, Integer value) {
		}

		private void remove(String string) {
		}

		private Integer get(String word) {	
			return null;
		}
}

