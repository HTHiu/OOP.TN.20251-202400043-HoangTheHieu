package com.hust.kstn.models;

public class Store {
	private static final int MAX_STORE =100;
	private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_STORE];
	private int qtyStore = 0;
	
	
	public Store() {}
	public void addDVD(DigitalVideoDisc disc) {
		if(qtyStore >= MAX_STORE) {
			System.out.println("The Store is FULL");
		}else {
			itemsInStore[qtyStore] = disc;
			qtyStore ++;
			System.out.println("The disc has been added successfully!");
		}
	}
	
	public void removeDVD(DigitalVideoDisc disc) {
		if(qtyStore ==0) {
			System.out.println("The Store is NULL");
		}else {
			for(int i=0;i<qtyStore;i++) {
				if(itemsInStore[i]==disc) {
					for(int j=i;j<qtyStore;j++) itemsInStore[j]=itemsInStore[j+1];
					itemsInStore[qtyStore-1] = null;
					qtyStore --;
					System.out.println("The disc has been remove successfully!");
				}
			}
		}
	}
	 public void print() {
	        System.out.println("================THE STORE========================");
	        if (qtyStore == 0) 
	            System.out.println("The store is empty");
	        else {
	            System.out.println("Total items: " + qtyStore);
	            for (DigitalVideoDisc item : itemsInStore)
	                if (item != null)
	                    System.out.println("- " + item.toString());
	        }
	    }
}
