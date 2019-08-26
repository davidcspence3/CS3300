import java.util.Arrays;

public class List{
public static void main(String[] args){

char sample1[] = {'A','C','T','G','A','C','G','C','A','G'};
char sample2[] = {'T','C','A','C','A','A','C','G','G','G'};
char sample3[] = {'G','A','G','T','C','C','A','G','T','T'};

System.out.println(Arrays.toString(sample1));
System.out.println(Arrays.toString(sample2));
System.out.println(Arrays.toString(sample3));

char temp1[] = {'A','A','A','A'};
char temp2[] = {'A','A','A','A'};
char temp3[] = {'A','A','A','A'};

//iterate through 1st sample 4 at a time, assign it to temp1
for(int i=0; i<7; i++){
  System.out.print("Sample1 " + i + "  ");
for(int x=0; x<4; x++){
  temp1[x] = sample1[x+i];
  }
System.out.println(Arrays.toString(temp1)); //prints each 4 element sample1
}

//iterate through 1st sample 4 at a time, assign it to temp2
for(int i=0; i<7; i++){
  System.out.print("sample2 " + i + "  ");
for(int x=0; x<4; x++){
  temp2[x] = sample2[x+i];
  }
System.out.println(Arrays.toString(temp2)); //prints each 4 element sample2
}

//iterate through 1st sample 4 at a time, assign it to temp3
for(int i=0; i<7; i++){
  System.out.print("sample3 " + i + "  ");
for(int x=0; x<4; x++){
  temp3[x] = sample3[x+i];
  }
System.out.println(Arrays.toString(temp3)); //prints each 4 element sample3
}

}
}
