package practice;

import java.util.HashMap;
import java.util.Map;

public class First {
	//naive method O(n2)
	  public int[] twoSum1(int[] nums, int target) {
	        int[] l = new int[2];
	        for (int i=0; i< nums.length;i++){
	            for (int j=i+1;j< nums.length;j++){
	                if((nums[i]+nums[j])==target){
	                    l[0] = i;
	                    l[1] = j;
	                }
	            }
	        } 
	        return l;
	    }
	    //with hash table O(n)
	    public int[] twoSum(int[] nums , int target){
	        int[] l = new int[2];
	        Map<Integer,Integer> map = new HashMap<>();
	        for(int i=0;i<nums.length;i++){
	            int comp = target-nums[i];
	            if(map.containsKey(comp)){
	                l[0]=map.get(comp);
	                l[1]=i;
	                //return new int [] {map.get(comp),i};
	            }else{
	                map.put(nums[i],i);
	            }
	        }
	        return l;
	    }
	    public static void main(String[] args) {
	    	int [] nums = {1,2,3,6};
	    	int target = 5;
	    	First obj = new First();
	    	int [] sum = obj.twoSum1(nums,target);
	    System.out.println(sum[0]+","+sum[1]);
	    int [] sum1 = obj.twoSum(nums, target);
	    System.out.println(sum1[0]+","+sum1[1]);
	    
	    }
}
