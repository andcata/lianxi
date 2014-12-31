import java.util.Scanner;
public class FindNearestPoints{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the numberofpionts");
        int numberOfPoints= in.nextInt();

        double[][] points = new double[numberOfPoints][2];
        System.out.println("enter the points");

        for(int t =0;t < points.length;t++){
            
            points[t][0] = in.nextDouble();
            points[t][1] = in.nextDouble();
        }

        int p1= 0;int p2 = 1;
        double theShortest = distance(points[p1][0],points[p1][1],points[p2][0],points[p2][1]);

        for(int i =0;i<points.length;i++){
            for(int k = i+1;k <points.length;k++){
                double distance = distance(points[i][0],points[i][1],points[k][0],points[k][1]);

                if(theShortest > distance){
                    p1 = i;
                    p2 = k;
                    theShortest = distance;
                }
            }
        }

        System.out.println("the closest two points are"+"("+points[p1]+","+points[0]+")and("+points[p2][0]+","+points[p2][1]+")");
    }

    public static double distance(double x1,double y1,double x2,double y2){
        return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    }
}


