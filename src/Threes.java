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
         Set<String> strSet = new HashSet<>();
            for(int i=input.length()-1;i>-1;i++){
                for(int j=0;j<input.length();j++){

                }

            }

    }


    static boolean isMultiple(String sub){
        int digit =0;
        int p=0;
        for(int i=sub.length()-1;i>-1;i--){

            digit+=(Integer.parseInt(sub.charAt(i)+"")*Math.pow(2,p));
            p++;
        }


  return digit%3==0;  }


}
