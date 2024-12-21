package generic.test.ex1;

public class Container<T> {

    private T item;

    public Container() {
    }

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public boolean isEmpty(){

        if(item==null){
            return true;
        }
        return false;
    }
}
