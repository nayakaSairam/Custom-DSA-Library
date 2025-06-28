public class Custom_queue {
    
    public static int[] data;
    public static final int defaultsize=10;
    int end=-1;
    Custom_queue(){
        this(defaultsize);
    }
    Custom_queue(int val){
        data=new int[val];
    }
    public boolean insert (int val) throws Exception{
        if(isFull()==true){
            throw new Exception("Queue is full,cannot insert!!");
        }
        end++;
        data[end]=val;
        return true;
    }
    public boolean isFull(){
        if(end==data.length-1){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(end==-1){
            return true;
        }
        return false;
    }
    public int peek(){
        return data[end];
    }
    public int remove()throws Exception{
        if(end==-1){
            throw new Exception("Queue is empty,cannot remove!!");
        }
        int removed=data[0];
        for(int i=1;i<=end;i++){
            data[i-1]=data[i];        
        }
        end--;

        return removed;
    }
    public int front()throws Exception{
        if(end==-1){
            throw new Exception("empty queue");
        }else{
            return data[0];
        }
    }
    public void display(){
        for(int i=0;i<=end;i++){
            System.out.println(data[i]);
        }
    }
}
