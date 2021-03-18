package leetcode155;
import java.util.Stack;

public class MinStack {

    Stack<Integer> s;
    int min;
    public MinStack() {
        s = new Stack<>();
        min = 0;
    }
    
    public void push(int val) {
        
        if (s.isEmpty()) {
            s.push(val);
            min = val;
            return;
        } else {
            if (val >= min) {
                s.push(val);
            } else {
                s.push(2 * val - min);
                min = val;
            }
        }
        
    }
    
    public void pop() {
        if (s.peek() >= min) {
            s.pop();
        } else {
            min = 2 * min - s.peek();
            s.pop();
        }
    }
    
    public int top() {
        if (s.peek() >= min) {
            return s.peek();
        } else {
            return min;
        }
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */