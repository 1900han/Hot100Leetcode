package com.megamind.minstack;

import java.util.Deque;
import java.util.LinkedList;

public class MinStack {
    Deque<Integer> dataStack;
    Deque<Integer> minStack;

    public MinStack() {
        this.dataStack = new LinkedList<>();
        this.minStack = new LinkedList<>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        dataStack.push(x);
        minStack.push(Math.min(minStack.peek(), x));
    }

    public void pop() {
        dataStack.pop();
        minStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
