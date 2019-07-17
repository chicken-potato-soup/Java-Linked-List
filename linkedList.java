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
}
