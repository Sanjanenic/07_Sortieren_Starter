package UE06_Wishlist;

public class PresentSorter {
    public void sortPresentsByDesire(Present[] presents) {
        // war TODO: Implementierung

        //BubbleSort

        //Aussere Schleife  //n sagt uns wie viel mal muss es vergleichen tj.durch array gehen und sortieren
        for(int n=(presents.length-1); n>0; n--) {
            //innereschleife
            for (int i = 0; i < n; i++) {
                if (presents[i].desire > presents[i + 1].desire) {

                    Present temp = presents[i];
                    presents[i] = presents[i + 1];
                    presents[i + 1] = temp;
                }


//        int temp=0;
//
//        for (int i =1; i< presents.length; i++){
//
//            for (int j=i; i>0; i--){
//
//                if(presents[j].desire < presents[j-1].desire){
//                    temp = presents[j].desire;
//                    presents[j]= presents[j-1];
//                    presents[j-1].desire=temp;
//                }
//                else{
//                    break;
//                }
//            }
            }
        }
    }
}
