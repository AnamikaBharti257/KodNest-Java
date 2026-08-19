public class Homeworktwo {
    public static void main(String[] args){
        int[] stock = {4,12,2,9,5};
        int reorderlevel = 5;
        int reordercount = 0;

        for(int i = 0 ; i < stock.length ; i++){
            if(stock[i] <= reorderlevel){
                reordercount ++ ;
            }
        }
        System.out.println("Items to reorder: " + reordercount);
    }
}