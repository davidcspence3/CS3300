public class compare{
  public static void main(String[] args){

    int count = 0;
    char one[] = {'A','A'};
    char two[] = {'A','T'};
    for(int x=0; x<2; x++){
    boolean match = one[x]==two[x];
    System.out.println(match);
      if(match){
        count++;
      }
    }
    System.out.println(count);
  }
}
