public class Custom_Dynamicstack extends Custom_stack {
    Custom_Dynamicstack(){
        super();
    }
    Custom_Dynamicstack(int val){
        super();
    }
    @Override
    public boolean push(int val)throws Exception{
        if(this.isFull()){
            int[] temp=new int[data.length*2];
            for(int i=0;i<=ptr;i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        return super.push(val);
    }
}
