package edu.kis.vh.nursery.collection;

public interface Stackable {

    int STACK_EMPTY_VALUE = 0;

    int top();

    void push(int i);

    int pop();

    boolean isEmpty();

    boolean isFull();
}
