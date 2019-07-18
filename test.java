import java.util.Scanner;
public class test 
{

    public static void main(String[] args)
        {
            linkedList<Integer> potato= new linkedList<Integer>();
            potato.addBeginning(9);
            potato.addBeginning(2);
            potato.addAtIndex(15, 5);
            potato.addAtIndex(11, 0);
            potato.addAtIndex(7, 3);
            potato.addAtIndex(99, 5);
            potato.display();
        }
}