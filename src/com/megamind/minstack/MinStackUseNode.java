package com.megamind.minstack;

import java.util.Stack;

public class MinStackUseNode {
    Stack<Node> dataStack;

    public MinStackUseNode() {
        this.dataStack = new Stack<>();
    }

    public void push(int x) {
        if (dataStack.isEmpty()) {
            dataStack.push(new Node(x, x));
        } else {
            int min = Math.min(x, dataStack.peek().min);
            dataStack.push(new Node(x, min));
        }
    }

    public void pop() {
        dataStack.pop();
    }

    public int top() {
        return dataStack.peek().val;
    }

    public int getMin() {
        return dataStack.peek().min;
    }

    public static class Node {
        public int val;
        public int min;

        public Node(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }
}
