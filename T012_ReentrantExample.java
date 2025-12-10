import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class T012_ReentrantExample {
    private final Lock lock = new ReentrantLock(); // since the lock is reentrant if the same thread want to enter another resource to lock then it will able to lock it so names as reentrant

    public void outerMethod() {
        lock.lock();
//		lock.lockInterruptibly();
        try {

        }catch(Exception e) {

        }
    }

    public void innerMethod() {
        lock.lock();
        try {

        }catch(Exception e){

        }
    }
}
