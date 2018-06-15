package com.learning.linklist;

class Passenger {
	int id;
	String Name;

	public Passenger(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.Name = name;
	}
}

public class NonPrimitiveLinkList {
	Node head;
	
	static class Node{
		Passenger psg;
		Node next;
		Node(int id,String name){
			psg = new Passenger(id,name);
			next = null;
		}
	}
	
	public void addFromLast(int val, String name) {
		if (head == null) {
			head = new Node(val, name);
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node(val,name);
		}
	}
	
	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.println(n.psg.id + " : "+n.psg.Name);
			n = n.next;
		}
	}
	
	public void sortList() {
		Node n = head;
		Node nj = head;
		Node temp = null, first = null;
		while (n != null) {
			nj = n;
			while (nj.next != null) {
				//temp = nj;
				
				if(n.psg.id>=nj.psg.id){
					//System.out.println(n.psg.id + " nd : nsg "+nj.psg.id);
					temp = nj;
				}
				nj = nj.next;
			}
			if(first == null){
				first = temp;
			}else{
				Node nd = first;
				while (nd.next != null) {
					System.out.println(nd.psg.id + " : "+nd.psg.Name);
					nd = nd.next;
				}nd.next = temp;
			}
			
			temp =null;
			n = n.next;
		}
	}
	
	public static void main(String[] args) {
		NonPrimitiveLinkList llist = new NonPrimitiveLinkList();
		
		llist.addFromLast(9,"Aditya");
		llist.addFromLast(3,"Shiva");
		llist.addFromLast(5,"Rajendra");
		llist.addFromLast(6,"Gangadhar");
		llist.addFromLast(2,"Soumil");
		llist.addFromLast(-1,"Monoj");
		System.out.println("After insertion Link List is : ");
		llist.printList();
		System.out.println("After sorting Link List is : ");
		llist.sortList();
		//llist.printList();
	}

}
