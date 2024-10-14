import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
   Scanner n=new Scanner(System.in);
 int a=n.nextInt();
 int arr[]=new int[10];
int o=0,h=0,k=a;
while(a!=0){
    o++;
    h=a%10;
    arr[h]++;
    a=a/10;
}
int q=o-1;
boolean t=false;
for(int i=o-1;i>=0;i--){
    int w=k%10;
    System.out.println(q+" "+arr[i]);
q--;
   k=k/10;
    if(arr[i]==w)
    t=true;
    else {
    t=false;
    break;}
}
if(t)
System.out.println("Auto");
else
System.out.println("Non Auto");
 
}
    }
