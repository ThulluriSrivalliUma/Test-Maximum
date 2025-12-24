public class Maximum<T extends Comparable<T>>  {
    private T a;
    private T b;
    private T c;
    public Maximum(T a, T b, T c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public static <T extends Comparable<T>> T testMaximum(T a, T b, T c){
        T max=a;
        if(b.compareTo(max)>0){
            max=b;
        }
        if(c.compareTo(max)>0){
            max=c;
        }
        return max;
    }
    public T testMaximum() {
        return Maximum.testMaximum(a, b, c);
    }
}
