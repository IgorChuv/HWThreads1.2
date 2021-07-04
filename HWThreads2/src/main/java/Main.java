import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<String> myCallable1 = new MyCallable();
        Callable<String> myCallable2 = new MyCallable();
        Callable<String> myCallable3 = new MyCallable();
        Callable<String> myCallable4 = new MyCallable();
        List<? extends Callable<String>> taskList = Arrays.asList(myCallable1, myCallable2, myCallable3, myCallable4);
        final ExecutorService threadPool = Executors.newFixedThreadPool(4);

        System.out.println(threadPool.invokeAny(taskList));

        threadPool.shutdown();

    }
}
