import java.util.Arrays;
import java.util.Optional;

public class Maximum<T extends Comparable<T>>{
    private T[] values ;

    public Maximum(T... values){
        this.values=values;
    }
    public static <T extends Comparable<T>> Optional<T> testMaximum(T... values){
        if (values==null || values.length==0){
            return Optional.empty();
        }
        Arrays.sort(values);
        return Optional.of(values[values.length-1]);
    }
    public Optional<T> testMaximum(){
        return Maximum.testMaximum(values);
    }
}
