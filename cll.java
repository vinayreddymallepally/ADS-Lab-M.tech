import java.util.*;
class node 
{
int data;
node link;
}
class cll extends node
{
node p,q,s,t,w;
node first;
void createList()
{
Scanner sc = new Scanner(System.in);
int n, i;
System.out.println("Enter number of nodes:");
n = sc.nextInt();
first = null;
i = 1;
while(i <= n){
p = new node();
System.out.println("Enter data:");
p.data = sc.nextInt();
if(first == null)
{
first = p;
t = p;
}
else
{
t.link = p;
t = p;
}
i++;
}
t.link = first;
}
void addFirst()
{
p=new node();
p.data=35;
p.link=first;
t=first;
while(t.link!=first){
t=t.link;
}
first=p;
t.link=first;
}
void addLast()
{
p=new node();
p.data=25;
t=first;
while(t.link!=first)
{
t=t.link;
}
t.link=p;
p.link=first;
}
void addbet()
{
p=new node();
p.data=15;
t=first;
while(t.data!=75)
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
while(t.link!=first){
t=t.link;
}
t.link=first.link;
first=first.link;

}
void deleteLast()
{
 t=first;
 while(t.link.link!=first)
 {
   t=t.link;
  }
  t.link=first;
}

void display()
{
t=first;
while(t.link!=first)
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
cll obj=new cll();
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