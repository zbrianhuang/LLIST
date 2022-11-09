public interface ListInterface<T> {
    public void add(T m) throws ListException;
    public T delete(int position)throws ListException;
}
