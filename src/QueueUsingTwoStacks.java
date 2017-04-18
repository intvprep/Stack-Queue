import java.util.Scanner;

public class QueueUsingTwoStacks {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        MyQueue queue = new MyQueue();
        for(int i=0;i<n;i++){
            int op = scan.nextInt();
            if(op == 1){
                int j = scan.nextInt();
                queue.offer(j);
            }else if(op == 2){
                queue.poll();
            }else if(op == 3){
                System.out.println(queue.peek());
            }
        }
        
    }
	
	 private static class MyQueue{

	        java.util.Stack<Integer> stack1;
	        java.util.Stack<Integer> stack2;
	        public MyQueue(){
	            stack1 = new java.util.Stack<>();
	            stack2 = new java.util.Stack<>();
	        }
	        
	        public void offer(int i){
	                stack1.push(i); // Always push to first stack
	        }
	        
	        public int poll(){
	            if(stack2.isEmpty()){
	                while(!stack1.isEmpty())
	                    stack2.push(stack1.pop());
	            }
	            int i = stack2.pop();
	            return i;
	        }
	        
	        public int peek(){
	            if(stack2.isEmpty()){
	                while(!stack1.isEmpty())
	                    stack2.push(stack1.pop());
	            }
	            int i = stack2.peek();
	            return i;
	        }        
	        
	    }
}
