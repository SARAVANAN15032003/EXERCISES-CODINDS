import java.util.*;
class main{
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
    String s=n.nextLine();
    int u=0;
    char c;
    for(int i=0;i<s.length();i++){
      c=s.charAt(i);
      if(Character.isDigit(c))
      u=(u*10)+(c-'0');
    }
    System.out.print(u);
  }
}
