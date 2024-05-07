import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Test2 {
    List<Integer> list = new ArrayList<>();
    ReadWriteLock lock = new ReentrantReadWriteLock();
    public int get(int index){
        lock.readLock().lock(); //wait
        int value = list.get(index);
        lock.readLock().unlock();
        return value;
    }

    public void put(int index, int value){
        lock.writeLock().lock();
        list.add(index,value);
        lock.writeLock().unlock();
    }
    public static void main(String[] args) {
        //List<Integer> list = new CopyOnWriteArrayList<>();
        // emp
        // id name deptId salary
        //dept
        // id name

        "SELECT d1.name FROM emp e1 JOIN dept d1 ON e1.deptId=d1.id GROUP BY deptId WHERE COUNT(deptId) == 0"
    }
}
