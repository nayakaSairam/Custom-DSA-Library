public class Custom_DynamicQueue extends Custom_queue {
    @Override
    public boolean insert(int val){
        if(isFull()){
            System.out.println("doubling array length");
            int[] temp = new int[2*data.length];
            for(int i=0;i<=end;i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        end++;
        data[end]=val;
        return true;
    }
}
