/**
 * Created by sbncla002 on 2018/09/23.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
public class Product {

    public static  void main(String args[]){

      //  System.out.println();
        double max =-Double.MAX_VALUE;

        Scanner sc = new Scanner(System.in);
        List<Double> l = new ArrayList<>();
       String data = sc.nextLine();
       String [] dataArr = data.split(" ");
       System.out.println(Arrays.toString(dataArr));
       double dArr[]= new double [dataArr.length];

       for(int i=0;i<dataArr.length;i++){
           dArr[i]=Double.parseDouble(dataArr[i]);
       }
double product =1;
        int maxlen=0;
       for(int i=0;i<dArr.length;i++){

           for(int j=i+1;j<dArr.length;j++){
               product=dArr[i];
               for(int w=i+1;w<=j;w++){
                   product*= dArr[w];
               }
               if(product>max) {
                   max = product;
                   maxlen=j-i+1;
               }
           }
       }

System.out.println(max);
        System.out.println(maxlen);
sc.close();

    }

}
//0.5 1.0 1.5 0.001 20 1.1 0.01
