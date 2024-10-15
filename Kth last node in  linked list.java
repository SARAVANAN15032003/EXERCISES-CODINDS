import java.util.*;
class sll{
  Node head;
  class Node{
    int data;
    Node next;
    Node(int val){
      data=val;
      next=null;
    }
  }
  public void end(int k){
    Node newnode=new Node(k);
    if(head==null)
    head=newnode;
    else{
      Node temp=head;
      while(temp.next!=null){
    temp=temp.next;}temp.next=newnode;}
  }
  /*public int count(){
    Node temp=head;
    int c=0;
    while(temp!=null){
      c++;
      temp=temp.next;
    }
    return c;
  }
  public void find(int o){
    Node temp=head;
    int r=count()-o;
    int i=0;
    while(i<r-1){
      temp=temp.next;
      i++;
    }
    System.out.print(temp.data);
  }*/
  public void rev(int p){
    Node cur=head;
    Node prev=null;
    while(cur!=null){
      Node next=cur.next;
      cur.next=prev;
      prev=cur;
      cur=next;
    }
    head=prev;
    int i=0;
     Node temp=head;
    while(i<p){
      temp=temp.next;i++;
    }
    System.out.print(temp.data);
  }
  sll(){
    head=null;
  }
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
    sll list=new sll();
    int u;
    while(true){
      u=n.nextInt();
      list.end(u);
      if(u==-1)
      break;
    }
    int p=n.nextInt();
    list.rev(p);
  }
}
