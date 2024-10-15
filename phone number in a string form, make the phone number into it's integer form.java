  import java.util.*;
  class main{
    static String digit="";
    public static void main(String[] args){
      Scanner n=new Scanner(System.in);
      String s=n.nextLine();
      String s1[]=s.split(" ");
      for(int i=0;i<s1.length;i++){
  String c=s1[i];
  //System.out.println(c);
  if(c.equals("double")){
    c=s1[++i];
    //System.out.println(c);
    for(int j=0;j<2;j++){
      gen(c);
    }
   
  }
  else if(c.equals("triple")){
    c=s1[++i];
    for(int l=0;l<3;l++){
      gen(c);
    }
  }
  else{
    gen(c);  
    }}
     Long number=Long.parseLong(digit);
     System.out.print(number%1009);
    }
  public static void gen(String c){
  switch(c){
    case "one":digit=digit+"1";break;
    case "two":digit=digit+"2";break;
    case "three":digit=digit+"3";break;
    case "four":digit=digit+"4";break;
    case "five":digit=digit+"5";break;
    case "six":digit=digit+"6";break;
    case "seven":digit=digit+"7";break;
    case "eight":digit=digit+"8";break;
    case "nine":digit=digit+"9";break;
    case "zero":digit=digit+"0";break;
  }}}   
