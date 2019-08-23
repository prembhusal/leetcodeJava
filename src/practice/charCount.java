import java.util.HashMap;

class charCount {
  public static void main(String[] args) {

    HashMap<String,String> obj = new HashMap<String, String>();
    obj.put("a","b");
    obj.put("c","d");

    for(String str: obj.keySet()){
      System.out.println("key : "+str+" value : "+obj.get(str));
    }
    
    obj.forEach((k,v)-> System.out.println("key : "+k+" value : "+v));
    String str = "aaabbcccccddd";
  int [] arr = {3,2,3,4,5,4,6,9,3};
    HashMap<Character,Integer>  objMap = new HashMap<Character,Integer>();
    char [] charArr = str.toCharArray();
    for (char entry: charArr){
        if ( objMap.get(entry)!= null){
            objMap.put(entry,objMap.get(entry) +1 );
        }else{
            objMap.put(entry,1);
        }
}
System.out.println(objMap);
  }
}
