import java.util.Scanner;

/**
 * Created by sbncla002 on 2018/09/23.
 */
public class Scoring
{

    public  static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] list= new int[n];
        for(int i=0;i<n;i++){
            list[i]= sc.nextInt();
        }
        int target = sc.nextInt();

        System.out.println(computeMax(list,target));
    }


   static int computeMax(int [] list,int target){
        int max=1;

        for(int i=0;i<list.length;i++){

            if(i==0){
                max+=list[i];
            }
            else {

                if (list[i] == 0 || list[i] == 1) {
                    if ((max + list[i]) < target)
                         max += list[i];
                    else{
                        max *= list[i];
                    }
                }
                else {
                    if ((max * list[i]) > target) {
                        max += list[i];

                    } else {
                        max *= list[i];
                    }
                }
            }


        }



        return max;
    }

}
