package UE5;

import java.util.Arrays;

public class InsertionSortBeispiel {
    public static void main(String[] args) {
        int[]array={ 12, 4, 6, 9, 0, 57, 87};
        System.out.println(Arrays.toString(array));


    }

    public void sort(int[]array){
         int temp=0;
          for (int i =1; i<array.length; i++){
              for (int j=i; i>0; i--){

                  if(array[j ]< array[j-1]){
                      temp = array[j];
                      array[j]= array[j-1];
                      array[j-1]=temp;
                  }
                  else{
                      break;
                  }
              }
          }
    }
}
