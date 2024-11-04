/**
 * A {@link LinkedStack} is a stack that is implemented using
 * a Linked List structure to allow for unbounded size.
 * <p></p>
 * The {@code isEmpty} and {@code size} methods are provided,
 * on the house.
 * @param <T> the elements stored in the stack
 */
public class LinkedStack<T> implements StackInterface<T> {

    Node<T> head;
    int size;
    Node<T> last;




    /**
     * {@inheritDoc}.
     */
    @Override
    public T pop() {
        if (head == null) {
            return null;
        }

        T value = head.data;
        head = head.next;
        return value;
    }


    /**
     * {@inheritDoc}.
     */

    @Override
    public T top() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    /**
     * {@inheritDoc}.
     */
     @Override
     public void push(T elem) throws NullPointerException {
    if (elem == null) {
        throw new NullPointerException("Element cannot be null");
    }

    Node<T> newNode = new Node<>(elem);
    newNode.next = head;
    head = newNode;
}

    /**
     * {@inheritDoc}.
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public int size() {
        return size;
    }
}
