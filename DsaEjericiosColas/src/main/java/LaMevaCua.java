public class LaMevaCua<E> implements Queue<E> {

    E[] data;
    int p;

    public LaMevaCua(int len){
        this.data = (E[])new Object[len];
        this.p=0;
    }

    public void push(E e) throws FullQueueException {
        if(this.estaPlena()) throw new FullQueueException();

        this.data[this.p++] = e;
    }

    private boolean estaPlena() {
        return this.p>=this.data.length;
    }

    public E pop() throws EmptyQueueException {
        if(this.estaBuida()) throw new EmptyQueueException();

        E e = this.data[0];

        lshift();

        return e;
    }

    private void lshift() {
        for(int i =0; i<this.p;i++){
            this.data[i]=this.data[i+1];
        }
        this.p--;
    }

    private boolean estaBuida(){
        return this.p==0;
    }

    public int size() {
        return this.p;
    }
}
