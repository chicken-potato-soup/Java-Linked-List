import java.util.Scanner;

class linkedList<DataType>
{
    private int count;
    Node <DataType> head;
    Node <DataType> tail;

    linkedList()
    {
        count=0;
        head=null;
        tail=null;
    }

    public Boolean isEmpty()
    {
        return(head==null);
    }

    public void display()
    {
        Node <DataType> current=head;
        while(current!=null)
            {
                System.out.print(current.info);
                System.out.print(" ");
                current=current.link;
            }
    }
    public void addBeginning(DataType val)
    {
        Node <DataType> current=head;
        Node <DataType> newNode= new Node <DataType>();
        newNode.info=val;
        newNode.link=null;

        if(isEmpty())
            {
                head=newNode;
                tail=newNode;
                count++;
            }
        else
            {
                newNode.link=current;
                head=newNode;
                count++;
            }
    }
    public void addAtEnd(DataType val)
    {
        Node <DataType> current=head;
        Node <DataType> newNode=new Node <DataType>();
        newNode.info=val;
        newNode.link=null;

        if(isEmpty())
            {
                head=newNode;
                tail=newNode;
                count++;
            }
        else
            {
                while(current.link!=null)
                    {
                        current=current.link;
                    }
                current.link=newNode;
                tail=newNode;
                count++;
            }
    }
    public void addAtIndex(DataType val, int index)
    {
        Node <DataType> current=head;
        Node <DataType> newNode= new Node <DataType>();
        newNode.info=val;
        newNode.link=null;
        //if the list is empty, new node becomes the first node
        if(isEmpty())
            {
                head=newNode;
                tail=newNode;
                count++;
            }
        //check if index is greater than number of nodes on the list
        else if(index>count)
            {
                //index is out of range, we add to the end of the list
                addAtEnd(val);
            }
            //if index is <2 we add to the beginning
        else if(index<2)
            {
                //add to the head
                addBeginning(val);
            }
        else
            {
                for(int i=1; i<index-1; i++)
                    {
                        current=current.link;
                    }
                newNode.link=current.link;
                current.link=newNode;
                count++;
            }
    }
}
