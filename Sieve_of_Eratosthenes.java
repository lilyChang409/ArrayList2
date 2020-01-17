import java.util.ArrayList;
public class Sieve_of_Eratosthenes
{
     public static void prime1 (ArrayList<Integer> prime){

      for (int k=0;k<prime.size();k++){  
          int p = prime.get(k);
      for (int j=k+1;j<prime.size();){
           int x=prime.get(j);
            if(x%p==0){
                prime.remove(j);
            }else{
                j++;}
        }
    }
   
}
    public static void main (String[] args) {
     
     ArrayList <Integer> prime =new ArrayList <Integer>();
     int n=1000;
     for(int i=2;i<=n;i++){
         prime.add(i);   
        }
        System.out.println("the primes are:"+prime);
        prime1(prime);
        System.out.println("the primes are:"+prime);
 
    }
   
}
