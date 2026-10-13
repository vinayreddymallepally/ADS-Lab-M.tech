import java.util.*;
class node
{
 int data;
 node prev;
 node link;
}
class dll extends node
{
  node p,q,s,t,w;
  node first;
void createList()
 {
p=new node();
q=new node();
p.data=45;
q.data=75;
p.prev=null;
p.link=q;
q.prev=p;
q.link=null;
first=p;}
void addFirst()
{
 p=new node();
p.data=35;
p.prev=null;
p.link=first;
first.prev=p;
first=p;
    }
void addLast()
{
p=new node();
p.data=25;
t=first;
while(t.link!=null)
{
 t=t.link;
}
 t.link=p;
p.prev=t;
p.link=null;
    }
void addbet()
 {
p=new node();
 p.data=15;
t=first;
while(t.data!=45)
{
t=t.link;
}
s=t.link;
t.link=p;
p.prev=t;
p.link=s;
s.prev=p;
    }
void deleteFirst()
{
t=first;
 first=first.link;
first.prev=null;
}
void deleteLast()
{
 t=first;
while(t.link!=null)
{
t=t.link;
}
t.prev.link=null;
}
void deletebet()
{
t=first;
while(t.link.data!=15)
{
t=t.link;
 }
s=t.link;
t.link=s.link;
s.link.prev=t;
}
void display()
{
t=first;
while(t.link!=null)
{
System.out.print(t.data + " ");
t=t.link;
}
System.out.print(t.data);
}
public static void main(String args[])
{
dll obj=new dll();
obj.createList();
obj.display();
System.out.println();
obj.addFirst();
obj.display();
System.out.println();
obj.addLast();
obj.display();
System.out.println();
obj.addbet();
obj.display();
System.out.println();
obj.deleteFirst();
obj.display();
System.out.println();
obj.deleteLast();
obj.display();
System.out.println();
obj.deletebet();
obj.display();
System.out.println();
}
}
