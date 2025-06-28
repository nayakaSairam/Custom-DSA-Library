import java.util.*;

public class Custom_heap<T extends Comparable<T>> {
    public ArrayList<T> al;
    public  heapss(){
        al=new ArrayList<>();
    }
    public void swap(int first,int second){
        T temp=al.get(first);
        al.set(first, al.get(second));
        al.set(second, temp);
    }
    public int parent(int index){
        return (index-1)/2;
    }
    public int left(int index){
    return index*2+1;
    }
    public int right(int index){
        return index *2 +2;
    }
    public  void insert(T val){
        al.add(val);
        upheap(al.size()-1);
    }
    public void upheap(int index){
        if(index==0){
            return;
        }
        if(al.get(parent(index)).compareTo(al.get(index))>0){
            swap(index, parent(index));
        }
        upheap(parent(index));
    }
    public T remove() throws Exception{
        if(al.isEmpty()){
            throw new Exception("heap is empty!!");
        }
        T temp=al.get(0);
        T last=al.remove(al.size()-1);
        if(!al.isEmpty()){
            al.set(0, last);
            downheap(0);
        }
        return temp;
    }
    public void downheap(int index){
          
        int min=index;
        int left=left(index);
        int right=right(index);
        if(left<al.size() && al.get(left).compareTo(al.get(min))<0){
            min=left;
        }
        
        if(right<al.size() && al.get(right).compareTo(al.get(min))<0){
            min=right;
        }
        if(min!=index){
            swap(min, index);
            downheap(min);
        }
        }
        public ArrayList<T> heapsort() throws Exception{
            ArrayList<T> data=new ArrayList<>();
            while(!al.isEmpty()){
                data.add(this.remove());
            }
            return data;
        }
}
