public class Custom_stack{
    public int[] data;
    public static final int defaultsize=10;
    Custom_stack(){
        this(defaultsize);
    }
    public Custom_stack(int size){
        this.data=new int[size];
    }
    public static int ptr=-1;
    public boolean push(int val) throws Exception{
        if(isFull()){
            throw new Exception("stack is full,element cannot be pushed!!");

        }
        ptr++;
        data[ptr]=val;
        return true;
    }
    public boolean isFull(){
        if(ptr==data.length-1){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(ptr==-1){
            return true;
        }
        return false;
    }
    public int peek(){
        return data[ptr];
    }
    public int pop() throws Exception{
        if(ptr==-1){
            throw new StackException("Stack is empty,there is no element to pop!!");
        }
        return data[ptr--];
    }
    public void display(){

        for(int el:data){
            System.out.println(el);
        }
    }

}