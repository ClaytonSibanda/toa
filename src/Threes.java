import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by sbncla002 on 2018/09/23.
 */
public class Threes {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);


            String input = sc.next();
            int min =Integer.MAX_VALUE;
         Set<String> strSet = new HashSet<>();


        System.out.println(checkPartition(input.trim()));

    }


    static  int checkPartition(String b){

        if(b==null || b.length()==0)
            return 0;
        return checkPartition(b,b.length(),0);

    }

    static int checkPartition(String b, int len , int index){

        if(index==len )
            return 0;
        if(isMultiple(b)){
            return 0;
        }
        int count = Integer.MAX_VALUE;
        for(int i =index;i<len;i++){

            if(isMultiple(b.substring(index,i))){
                count =Math.min(count,1+checkPartition(b,len,i));
            }
        }


        return count;
    }




    static boolean isMultiple(String sub){
        int digit =0;
        int p=0;
        long num = Long.parseLong(sub,2);
        System.out.println(num);

        while(num!=1){
           if(num%3!=0)
               return false;
           num=num/3;
       }


  return true;  }


}
