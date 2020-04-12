public class Client{
    public static void main(String[] args) {
      
        int[] arr={15,30,25,40,20,23,9};
        heap hp=new heap(true,arr); //MaxHeap
        // hp.push(10);
        // hp.push(20);
        // hp.push(7);
        
        hp.display();
        // 
        // hp.pop();
        hp.update(3, 7);
        System.out.println();
        hp.display();



    }
}