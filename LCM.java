import java.util.*;
class mian{
  public static  int  find(int a,int b){
    for(int i=1;i<=a;i++){
      if(b*i==a)
      return a;
    }
    return a*b;
  }
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
    int a=n.nextInt();
    int b=n.nextInt();
    int h=a>b?find(a,b):find(b,a);
    System.out.print(h);
  }
}
