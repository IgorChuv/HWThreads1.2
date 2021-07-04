import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    int taskCount = 1;

    @Override
    public String call() throws Exception {
        while(taskCount < 4) {
            Thread.sleep(2500);
            System.out.println("Я " + Thread.currentThread().getName() + ". Всем привет! Выполняю задачу " + taskCount);
            taskCount++;
        }
        return "\nЯ " + Thread.currentThread().getName() + " выполнил задач " + taskCount;
    }

}



