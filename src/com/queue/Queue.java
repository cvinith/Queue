package com.queue;

public class Queue {

  private class Node{
    int data;
    Node link;
    Node(int data){
      this.data = data;
      this.link = null;
    }
  }

  private Node head = null;
  private Node next = null;

  //Function adds an element to the tail of queue
  public void add(int data){
    Node newNode = new Node(data);
    if(head == null){
      head = newNode;
      next = head;
    }
    else{
      next.link = newNode;
      next = next.link;
    }
  }

  // Functions returns head of queue without removing it
  public int  peek(){
    if(head == null)
      throw new RuntimeException("stack is empty");
    return head.data;
  }

  //Function removes and return head of queue
  public int poll(){
    if(head == null)
      throw new RuntimeException("stack is empty");
    Node temp = head;
    head = head.link;
    return temp.data;
  }

  //Function returns size of queue
  public int size(){
    int count = 0;
    Node temp = head;
    while(temp != null){
      temp = temp.link;
      count++;
    }
    return count;
  }

  //Function prints all elemnts in queue
  public void printElements(){
    Node temp = head;
    while(temp != null){
      System.out.println(temp.data);
      temp = temp.link;
    }
  }

  @Override
  public String toString() {
    StringBuffer list = new StringBuffer();
    list.append("[");
    Node temp = head;
    while(temp != null){
      list.append(temp.data+" ");
      temp = temp.link;
    }
    list.append("]");
    return list.toString();
  }
}
