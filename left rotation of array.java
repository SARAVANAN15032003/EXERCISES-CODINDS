import java.util.*;
class main{
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
    int size=n.nextInt();
    int rot=n.nextInt();
    int arr[]=new int[size];
    for(int i=0;i<size;i++){
      arr[i]=n.nextInt();
    }
int temp[]=new int[rot];
for(int i=0;i<rot;i++){
  temp[i]=arr[i];
}
for(int j=rot;j<size;j++){
  arr[j-rot]=arr[j];
}
for(int i=0;i<rot;i++){
  arr[i+size-rot]=temp[i];
}
    for(int o=0;o<size;o++){
      System.out.print(arr[o]+" ");
    }
  }
}
