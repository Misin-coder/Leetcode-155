package leetcode155;


/*
 * ["MinStack","push","push","push","top","pop","getMin","pop","getMin","pop","push","top","getMin","push","top","getMin","pop","getMin"]
[[],[2147483646],[2147483646],[2147483647],[],[],[],[],[],[],[2147483647],[],[],[-2147483648],[],[],[],[]]
 */
public class Test {

	public static void main(String[] args) {
		MinStack m = new MinStack();
		m.push(2147483646);
		m.push(2147483646);
		m.push(2147483647);
		System.out.println(m.top());
		m.pop();
		System.out.println(m.getMin());
		m.pop();
		System.out.println(m.getMin());
		m.pop();
		m.push(2147483647);
		System.out.println(m.top());
		System.out.println(m.getMin());
		m.push(-2147483648);
		m.top();
		System.out.println(m.getMin());
		m.pop();
		System.out.println(m.getMin());
		
// 46,47,48
	}

}
