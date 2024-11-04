/**
 * A {@link Node} is an element of a stack that is implemented
 * using a Linked List structure to allow for unbounded size.
 */
class Node<T>
{
    // TONOTDO: you do not need to modify this class,
    //   but you can if you like.
    public T element;
    public Node<T> next;
    T data;


    public Node(T elem) {
        element = elem;
        next = null;
    }

    public T getElement()
    {
        return element;
    }

    public void setElement(T elem)
    {
        element = elem;
    }

    public Node<T> getNext()
    {
        return next;
    }

    public void setNext(Node<T> nextNode)
    {
        next = nextNode;
    }
}
