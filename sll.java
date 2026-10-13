import java.util.*;
class node 
{
int data;
node link;
}
class sll extends node
{
node p,q,s,t,w;
node first;
void createList(){
p=new node();
q=new node();
p.data=45;
q.data=75;
p.link=q;
q.link=null;
first=p;
}
void addFirst()
{
p=new node();
p.data=35;
p.link=first;
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
p.link=s;
}
void deleteFirst()
{
t=first;
first=first.link;
}
void deleteLast()
{
 t=first;
 while(t.link.link!=null)
 {
   t=t.link;
  }
  t.link=null;
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
void deletebet()
{
 t=first;
 while(t.link.data!=15)
 {
  t=t.link;
  }
  s=t.link;
 t.link=s.link;
}
public static void main(String args[])
{
sll obj=new sll();
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