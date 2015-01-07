import java.util.Scanner;
public class Main{
  public static void main(String[] args){
     Scanner in = new Scanner(System.in);
    while(in.hasNextLine()){
        
      int count = in.nextInt();
      if(count != 0){
      int[] list = new int[count];
      for(int i = 0;i< list.length;i++){
    	  list[i]= in.nextInt();
    	  
    	  int yushu;
        if(list[i]>=7)
           yushu = list[i] % 7;
        else
          yushu = list[i];
       
        
        if(yushu == 0)
          System.out.println(yushu);
        else if(yushu>=600)
          System.out.println(yushu-600);
        else if(yushu >= 550)
          System.out.println(yushu - 550);
        else if( yushu>=500)
          System.out.println(yushu - 500);
        else if(yushu>=450)
          System.out.println(yushu-450);
        else if (yushu>=400)
          System.out.println(yushu -400);
        
        else if(yushu>= 350)
          System.out.println(yushu - 350);
        else if (yushu>=300)
          System.out.println(yushu-300);
        else if(yushu>=200)
          System.out.println(yushu -200);
        else if(yushu >=150)
          System.out.println(yushu - 150);
        else
          System.out.println(yushu);
          }
    }
  }
}
}
