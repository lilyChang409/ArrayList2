import java.util.ArrayList;
public class GoldBack_Conjunction
{
    public static void conjection (ArrayList<Integer> prime){
        boolean yes=false;
        int x=prime.get(prime.size()-1);
    for(int i=0;i<prime.size()-1;i++){
        int y=prime.get(i);
        for(int j=0;j<prime.size()-1;j++){
            int z=prime.get(j);
         if(y+z==x){
             System.out.println("the primes are:"+y+" "+z);
             yes=true;
             break;
            
        }
    }
        if(yes){
         break;   
        }
    }}
     public static void main (String[] args) {
         ArrayList <Integer> prime =new ArrayList <Integer>();
         int n=7;
         for(int i=2;i<=n;i++){
             prime.add(i);   
        }
          for (int k=0;k<prime.size()-1;k++){  
          int p = prime.get(k);
      for (int j=k+1;j<prime.size()-1;){
           int x=prime.get(j);
            if(x%p==0){
                prime.remove(j);
            }else{
                j++;}
        }
    }
    conjection(prime);
}

}
