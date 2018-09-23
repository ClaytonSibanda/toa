import java.util.Scanner;

/**
 * Created by sbncla002 on 2018/09/23.
 */
public class Modulus {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);


        int n= sc.nextInt();
        int z = sc.nextInt();
        int count=0;
        for( int x=1;x<n;x++){
            for(int y=1;y<n;y++){

                if((x*y)%n==z) {

                    count++;
                }

            }
        }
        System.out.println(count);
    }
}
