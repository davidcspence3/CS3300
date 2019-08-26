import java.util.Arrays;

public class DNA{



public static void main(String[] args){


char sample1[] = {'A','C','T','G','A','C','G','C','A','G'};
char sample2[] = {'T','C','A','C','A','A','C','G','G','G'};
char sample3[] = {'G','A','G','T','C','C','A','G','T','T'};

System.out.println(Arrays.toString(sample1));
System.out.println(Arrays.toString(sample2));
System.out.println(Arrays.toString(sample3));

char temp1[] = new char[4];
char temp2[] = new char[4];
char temp3[] = new char[4];
int count = 0;

//where we start the 4 elemnt subsamples (0-6)
int index1 = 6;
int index2 = 2;
int index3 = 4;

//load1();

//iterate through 1st sample 4 at a time, assign it to temp2
  System.out.print("sample1 ");// + i + "  ");
for(int x=0; x<4; x++){
  temp1[x] = sample1[x+index1];//+i];
  }
System.out.println(Arrays.toString(temp1)); //prints each 4 element sample2

//iterate through 1st sample 4 at a time, assign it to temp2
  System.out.print("sample2 ");// + i + "  ");
for(int x=0; x<4; x++){
  temp2[x] = sample2[x+index2];//+i];
  }
System.out.println(Arrays.toString(temp2)); //prints each 4 element sample2

//iterate through 1st sample 4 at a time, assign it to temp3
//for(int i=0; i<7; i++){
  System.out.print("sample3 ");// + i + "  ");
for(int x=0; x<4; x++){
  temp3[x] = sample3[x+index3];//+i];
  }
System.out.println(Arrays.toString(temp3)); //prints each 4 element sample3

for(int i=0; i<4; i++){
boolean match1_2 = temp1[i]==temp2[i];
boolean match2_3 = temp2[i]==temp3[i];
boolean match1_3 = temp1[i]==temp3[i];
if(match1_2){
  count++;
}
if(match1_3){
  count++;
}
if(match2_3){
  count++;
}
}

//Keep track of match count
System.out.println("sample1 position " + index1);
System.out.println("sample2 position " + index2);
System.out.println("sample3 position " + index3);
System.out.println(count + " matches found");
//if(count<8) increment 3, then 2, then 1

}//main

}//class
