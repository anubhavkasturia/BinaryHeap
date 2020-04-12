import java.util.ArrayList;

public class heap{
    private ArrayList<Integer> AL;
    boolean isminormax; //for min=false & max=true;

    

heap(boolean acceptedval,int[] arr){
    this.isminormax=acceptedval;
    this.AL=new ArrayList<>();
    create(arr);
}

public void push(int data){
    AL.add(data);
    upHeapify(AL.size()-1);

}
public void upHeapify(int ci){
    int pi=(ci-1)/2;

    if(compare(ci,pi)>0){
        //swap
    swap(ci,pi);
    upHeapify(pi);

    }
}
public int compare(int ci,int pi){
    return AL.get(ci)-AL.get(pi); 
}
public void swap(int ci,int pi){
    int child=AL.get(ci);
    int parent=AL.get(pi);

    AL.set(ci, parent);
    AL.set(pi, child);

}
public void display(){
    for(int el:AL){
        System.out.println(el);
    }
}
public int top(){
    return AL.get(0);

}
    
public void create(int[]arr){
    for(int el:arr){
        AL.add(el);
        upHeapify(AL.size()-1);

        
    }

}
public void pop(){
    swap(0,AL.size()-1);//swaps the last positioned val
    AL.remove(AL.size()-1); //removes the last positioned(updated) value
    downHeapify(0); //required to make it a max/min heap 
}
public void downHeapify(int pi){
    int max=pi;
    int lc=2*pi+1; //left child
    int rc=2*pi+2;//right child
    if(lc<AL.size() && compare(lc, max)>0){
        max=lc;
    }
    if(rc<AL.size() && compare(rc, max)>0){
        max=rc;
    }
   
    if(max!=pi){
        swap(max,pi);//value was retained in max
        downHeapify(max);
    }
}
public void update(int i,int data){
    if(i>=AL.size()){
        System.out.println("Enter valid value of i");
        return;
    }
    AL.set(i, data);
    upHeapify(i);
    downHeapify(i);
}
}