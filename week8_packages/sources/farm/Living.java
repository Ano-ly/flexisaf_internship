package farm;

public interface Living<T> {
    void infect();
    void grow();
    T[] yield();
} 