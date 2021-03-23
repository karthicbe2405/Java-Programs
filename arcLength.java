import java.util.*;
public class arcLength {
    public static void calculate(int radius,int position,int velocity,int direction,int time){
        int degree;
        if(position == 1)
            degree = (((position * 90) + ((velocity * time) ))% 360);
        else
            degree = 360 - (((position * 90) + ((velocity * time) ))% 360);
        if(degree == 360)
            degree = 0;
        System.out.println(degree);
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a[][] = new int[4][4];
        HashMap<Integer,Integer> pos = new HashMap<Integer,Integer>();
        pos.put(0,0);
        pos.put(1,90);
        pos.put(2,180);
        pos.put(3,270);
        pos.put(4,0);
        for(int i = 0; i < 4;i++){
            for(int j = 0;j < 4;j++){
                a[j][i] = scan.nextInt();
            } 
        }
        /*for(int i = 0;i < 4;i++){
            for(int j = 0;j < 4;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }*/
        int time = scan.nextInt();
        for(int i = 0;i <4;i++){
            calculate(a[i][0],a[i][1],a[i][2],a[i][3],time);
        }
    }
}
