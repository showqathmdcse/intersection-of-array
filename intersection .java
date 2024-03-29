import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
    int[] nums={1,2,2,3,4,5,4};
    int[] num={2,2};
    Set<Integer> set=new HashSet<Integer> ();
    int i,j=0;
    for(i=0;i<nums.length;i++)
    {
        for(j=0;j<num.length;j++){
        if(nums[i]==num[j])
        {
            set.add(num[j]);
            
        }
        }
    }
    System.out.println(set);
     Integer[] integerArray = set.toArray(new Integer[0]);

        // Convert Integer array to int array (if needed)
        int[] intArray = new int[integerArray.length];
        for (i = 0; i < integerArray.length; i++) {
            intArray[i] = integerArray[i];
        }
      System.out.println("Integer Array:");
        for (int nu : intArray) {
            System.out.println(nu);
        }
    }
}
