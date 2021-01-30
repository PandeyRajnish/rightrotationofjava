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
    
}
