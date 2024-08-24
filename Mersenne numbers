import java.util.*;
class maib{
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
    int h=0;
    int a=n.nextInt();
    int arr[]=new int[a];
    for(int i=0;i<a;i++){
      arr[i]=n.nextInt();
    }
    for(int k=0;k<a;k++){
      if(p(arr[k]))
      h=h+arr[k];
    }
    
    System.out.print(h);
  }
  public static boolean p(int s){
    for(int j=1;j<s+1;j++){
      if(s==(Math.pow(2,j)-1)){
        return true;
      }
    }
    return false;
  }
  
}
