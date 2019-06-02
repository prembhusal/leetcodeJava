//from the given array of numbers find the numbers which has odd number of repetition
public findOddCount{
 public static void main(String [] args){
  
   int [] arr = {3,2,3,4,5,4,6,9,3};
    HashMap<Integer,Integer>  objMap = new HashMap<Integer,Integer>();
    for (Integer entry: arr){
        if ( objMap.get(entry)!= null){
            objMap.put(entry,objMap.get(entry) +1 );
        }else{
            objMap.put(entry,1);
        }
    }
    List<Integer> lis = new ArrayList<Integer>();
    for ( Integer key : objMap.keySet()){
        
        if( objMap.get(key) %2 != 0){
        System.out.println("key: "+key);
        System.out.println("value: "+objMap.get(key));
        }
    } 
 }
  
}
