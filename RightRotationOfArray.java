package arraypractice;

public class RightRotationOfArray {
    public static void main(String[] args) {
    
    int A[]={ 1,2,3,4,5,6,7,8,9,0 };
    
    for(int x:A)
            System.out.print(x+",");
        System.out.println("");
        
        int temp=A[A.length-1];
        
        for(int i=A.length-1;i>1;i--)
        {
            A[i]=A[i-1];
        }
        
        A[0]=temp;
        
        for(int x:A)
            System.out.print(x+",");
        System.out.println("");        
    }
    
    
    //Left Rotation
    /*
    public static void main(String[] args) {
        
        int A[]={2,67,56,67,78,43,9,65 };
        
        for(int x:A)
            System.out.print(x+",");
        System.out.println("");
        
        int temp=A[0];
        for(int i=1;i<A.length;i++){
            A[i-1]=A[i];
        }
        A[A.length-1]=temp;
        
        for(int x:A)
            System.out.print(x+",");
        System.out.println("");
        
    }
    
    */
    
}

    
}
