package Bubble;

public class BubleStart {

    public void sort(int[]numbers){
        for(int n =numbers.length-1; n>0; n--){

            for(int i=0; i<n; i++){
                if(numbers[i]>numbers[i+1]){
                    int temp= numbers[i];
                    numbers[i]= numbers[i+1];  //imam gresku
                }

            }
        }

    }
}
