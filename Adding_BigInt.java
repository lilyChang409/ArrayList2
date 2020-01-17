import java.util.ArrayList;

public class Adding_BigInt
{
public static ArrayList<Integer> add (ArrayList<Integer> big1,ArrayList<Integer> big2){
    ArrayList<Integer> result= new ArrayList<Integer>();
    for(int i=0;i<big1.size();i++){
        int x=big1.get(i);
        int y=big2.get(i);
       result.add(x+y);
        
    }
    for(int j=1;j<result.size();j++){
        int z=result.get(j);
        int s=result.get(j-1);
        if(z>=10){
            result.set(j-1,s+1);
            result.set(j,z-10);
        }
    }
    if(result.get(0)>=10 &&result.get(0)<20){
        int x=result.get(0);
        result.add(0,1);
        result.set(1,x-10);
    }
    if(result.get(0)==20){
        result.add(0,2);
        result.set(1,0);}
    return result;
}
   public static void main (String[] args) {
       ArrayList <Integer> big1 =new ArrayList <Integer>();
       big1.add(9);
       big1.add(8);
       big1.add(1);
       big1.add(9);
       ArrayList <Integer> big2 =new ArrayList <Integer>();
       big2.add(9);
       big2.add(9);
       big2.add(5);
       big2.add(9);
       ArrayList<Integer> n3 =add(big1,big2);
         System.out.println(n3);

    }
    
  
}
